package mru.tsc.controller;
import java.util.ArrayList;

import mru.tsc.model.Animal;
import mru.tsc.model.BoardGame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;

public class PopulateToyList {
	public static ArrayList<Toy> populateList(ArrayList<String> rawData){
		
		ArrayList<Toy> toyList = new ArrayList<Toy>();
		ArrayList<String[]> entryList = new ArrayList<String[]>();
		
		for(String data:rawData) {
			String[] entry = data.split(";");
			entryList.add(entry);
		}
		
		for(int i = 0; i < entryList.size(); i++) {
			char formatNum = entryList.get(i)[0].charAt(0);
			Long sn = Long.valueOf(entryList.get(i)[0]);
			String name = entryList.get(i)[1];
			String brand = entryList.get(i)[2];
			double price = Double.parseDouble(entryList.get(i)[3]);
			int availableCount = Integer.parseInt(entryList.get(i)[4]);
			int ageAppropriate = Integer.parseInt(entryList.get(i)[5]);
			
			
			switch(formatNum) {
			case'0':
			case'1':
				String classification = entryList.get(i)[6];
				Figure figure = new Figure(sn,name,brand,price,
						availableCount,ageAppropriate,classification);
				toyList.add(figure);
				break;
				
			case'2':	
			case'3':
				String material = entryList.get(i)[6];
				String size = entryList.get(i)[7];
				Animal animal = new Animal(sn,name,brand,price,
						availableCount,ageAppropriate,material,size);
				toyList.add(animal);
				break;		
		
			case'4':		
			case'5':
			case'6':
				String puzzleType = entryList.get(i)[6];
				Puzzle puzzle = new Puzzle(sn,name,brand,price,
						availableCount,ageAppropriate,puzzleType);
				toyList.add(puzzle);
				break;
				
			case'7':	
			case'8':
			case'9':
				String[] numOfPlayer = entryList.get(i)[6].split("-");
				int minPlayer = Integer.parseInt(numOfPlayer[0]);
				int maxPlayer = Integer.parseInt(numOfPlayer[1]);
				String designer = entryList.get(i)[7];
				BoardGame boardGame = new BoardGame(sn,name,brand,price,
						availableCount,ageAppropriate,minPlayer,
						maxPlayer, designer);
				toyList.add(boardGame);
				break;
			}
		}
		return toyList;
	}
}

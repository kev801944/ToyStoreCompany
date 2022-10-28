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
			case '0':
				String classificationA = entryList.get(i)[6];
//				System.out.println("Figures");
				Figure figureA = new Figure(sn,name,brand,price,
						availableCount,ageAppropriate,classificationA);
				toyList.add(figureA);
				break;
				
			case '1':
				String classificationB = entryList.get(i)[6];
//				System.out.println("Figures");
				Figure figureB = new Figure(sn,name,brand,price,
						availableCount,ageAppropriate,classificationB);
				toyList.add(figureB);
				break;
				
			case '2':
//				System.out.println("Animals");
				String materialA = entryList.get(i)[6];
				String sizeA = entryList.get(i)[7];
				
				Animal animalA = new Animal(sn,name,brand,price,
						availableCount,ageAppropriate,materialA,sizeA);
				toyList.add(animalA);
				break;
				
			case '3':
//				System.out.println("Animals");
				String materialB = entryList.get(i)[6];
				String sizeB = entryList.get(i)[7];
				Animal animalB = new Animal(sn,name,brand,price,
						availableCount,ageAppropriate,materialB,sizeB);
				toyList.add(animalB);
				break;		
		
			case '4':
//				System.out.println("Puzzles");
				String puzzleTypeA = entryList.get(i)[6];
				Puzzle puzzleA = new Puzzle(sn,name,brand,price,
						availableCount,ageAppropriate,puzzleTypeA);
				toyList.add(puzzleA);
				break;	
				
			case '5':
//				System.out.println("Puzzles");
				String puzzleTypeB = entryList.get(i)[6];
				Puzzle puzzleB = new Puzzle(sn,name,brand,price,
						availableCount,ageAppropriate,puzzleTypeB);
				toyList.add(puzzleB);
				break;	
				
			case'6':
//				System.out.println("Puzzles");
				String puzzleTypeC = entryList.get(i)[6];
				Puzzle puzzleC = new Puzzle(sn,name,brand,price,
						availableCount,ageAppropriate,puzzleTypeC);
				toyList.add(puzzleC);
				break;
				
			case '7':
//				System.out.println("Board Games");
				String[] numOfPlayerA = entryList.get(i)[6].split("-");
				int minPlayerA = Integer.parseInt(numOfPlayerA[0]);
				int maxPlayerA = Integer.parseInt(numOfPlayerA[1]);
				String designerA = entryList.get(i)[7];
				BoardGame boardGameA = new BoardGame(sn,name,brand,price,
						availableCount,ageAppropriate,minPlayerA,
						maxPlayerA, designerA);
				toyList.add(boardGameA);
				break;
				
			case'8':
//				System.out.println("Board Games");
				String[] numOfPlayerB = entryList.get(i)[6].split("-");
				int minPlayerB = Integer.parseInt(numOfPlayerB[0]);
				int maxPlayerB = Integer.parseInt(numOfPlayerB[1]);
				String designerB = entryList.get(i)[7];
				BoardGame boardGameB = new BoardGame(sn,name,brand,price,
						availableCount,ageAppropriate,minPlayerB,
						maxPlayerB, designerB);
				toyList.add(boardGameB);
				break;
			
			case'9':
//				System.out.println("Board Games");
				String[] numOfPlayerC = entryList.get(i)[6].split("-");
				int minPlayerC = Integer.parseInt(numOfPlayerC[0]);
				int maxPlayerC = Integer.parseInt(numOfPlayerC[1]);
				String designerC = entryList.get(i)[7];
				BoardGame boardGameC = new BoardGame(sn,name,brand,price,
						availableCount,ageAppropriate,minPlayerC,
						maxPlayerC, designerC);
				toyList.add(boardGameC);
				break;
			}

		}
		return toyList;
	}
}

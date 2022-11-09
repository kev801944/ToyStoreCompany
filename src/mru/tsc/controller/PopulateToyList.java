package mru.tsc.controller;

import java.util.ArrayList;

import mru.tsc.model.Animal;
import mru.tsc.model.BoardGame;
import mru.tsc.model.Figure;
import mru.tsc.model.Puzzle;
import mru.tsc.model.Toy;

/**
 * The PopulateToyList class is used to convert the raw data entries created by InitialFileRead class
 * and populate an ArrayList of Toy objects based on the parameters given by the data from InitialFileRead
 */
public class PopulateToyList {
	
	/**
	 * This creates a new arraylist containing the appropriate information based on the
	 * parameters from the InitialFileRead class
	 * @param rawData  The ArrayList containing the information of the toys from the toys.txt file
	 * @return Returns an ArrayList of Toy objects 
	 */
	public static ArrayList<Toy> populateList(ArrayList<String> rawData) {

		// An empty ArrayList of Toy objects
		ArrayList<Toy> toyList = new ArrayList<Toy>();
		
		// An empty ArrayList of Arrays used to format the entry for each Toy object
		ArrayList<String[]> entryList = new ArrayList<String[]>();

		// Using the delimiter ; to split about the raw data from InitialFileReader
		for (String data : rawData) {
			String[] entry = data.split(";");
			entryList.add(entry);
		}

		// Loop through the entire list of toy entries taken from toys.txt
		for (int i = 0; i < entryList.size(); i++) {
			
			// The first char of the Serial Number, used to deteremine the type of toy
			char formatNum = entryList.get(i)[0].charAt(0);
			
			// The Serial Number of the toy
			Long sn = Long.valueOf(entryList.get(i)[0]);
			
			// The name of the toy
			String name = entryList.get(i)[1];
			
			// The brand of the toy
			String brand = entryList.get(i)[2];
			
			// The price of the toy
			double price = Double.parseDouble(entryList.get(i)[3]);
			
			// The amount of toys still available for purchase
			int availableCount = Integer.parseInt(entryList.get(i)[4]);
			
			// The appropriate age range for the toy
			int ageAppropriate = Integer.parseInt(entryList.get(i)[5]);

			/*Based on the first number of the Serial Number, the toy will be a different class.
			  0,1 will be a Figure, 2,3 will be an Animal, 4,5,6 will be a Puzzle and 7,8,9 will
			  be a BoardGame
			*/
			
			switch (formatNum) {
				case '0':
				case '1':
					String classification = entryList.get(i)[6];
					Figure figure = new Figure(sn, name, brand, price,
							availableCount, ageAppropriate, classification);
					toyList.add(figure);
					break;

				case '2':
				case '3':
					String material = entryList.get(i)[6];
					String size = entryList.get(i)[7];
					Animal animal = new Animal(sn, name, brand, price,
							availableCount, ageAppropriate, material, size);
					toyList.add(animal);
					break;

				case '4':
				case '5':
				case '6':
					String puzzleType = entryList.get(i)[6];
					Puzzle puzzle = new Puzzle(sn, name, brand, price,
							availableCount, ageAppropriate, puzzleType);
					toyList.add(puzzle);
					break;

				case '7':
				case '8':
				case '9':
					String[] numOfPlayer = entryList.get(i)[6].split("-");
					int minPlayer = Integer.parseInt(numOfPlayer[0]);
					int maxPlayer = Integer.parseInt(numOfPlayer[1]);
					String designer = entryList.get(i)[7];
					BoardGame boardGame = new BoardGame(sn, name, brand, price,
							availableCount, ageAppropriate, minPlayer,
							maxPlayer, designer);
					toyList.add(boardGame);
					break;
			}
		}
		// Returns the populated toy list
		return toyList;
	}
}

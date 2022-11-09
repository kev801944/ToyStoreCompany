package mru.tsc.application;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import mru.tsc.controller.InitialFileReader;
import mru.tsc.controller.PopulateToyList;
import mru.tsc.model.Toy;
import mru.tsc.view.AddNewToyMenu;
import mru.tsc.view.MainMenu;
import mru.tsc.view.RemoveToyMenu;
import mru.tsc.view.SearchPurchaseMenu;

/**
 * This is the application class that runs the toy program
 * @author Kevin Luo and Shaina Anne Garrido
 *
 */
public class ToyStoreApplication {
	//main method
	public static void main(String[] args) throws Exception {

		ArrayList<String> rawData = InitialFileReader.initFileRead();
		ArrayList<Toy> toyList = PopulateToyList.populateList(rawData);
		Scanner keyboard;
		boolean notExit = true;

		while (notExit) {
			keyboard = new Scanner(System.in);
			MainMenu.mainMenu();
			int inputOption;

			if (keyboard.hasNextInt()) {
				inputOption = keyboard.nextInt();
			} else {
				continue;
			}
			// boolean notIntInput = true;
			// while (notIntInput) {
			// System.out.println("This is not a valid input!");
			// System.out.println("Enter an option: ");
			// if (keyboard.hasNextInt()) {
			// inputOption = keyboard.nextInt();
			// notIntInput = false;
			// }

			switch (inputOption) {
				case 1:
					SearchPurchaseMenu.searchPurchaseMenu();
					int subMenuOption = keyboard.nextInt();

					switch (subMenuOption) {
						case 1:

							System.out.println("Enter toy serial number: ");
							Long searchSnNum = keyboard.nextLong();
							System.out.println("Here are the search results: ");
							Toy purchaseToy = null;

							if (searchSnNum.toString().length() != 10) {
								System.out.println("Invalid input, length of serial number is not valid!");
								continue;
							}

							for (Toy toy : toyList) {
								if (toy.getSn().equals(searchSnNum)) {
									System.out.println("(1)" + toy.Format());
									purchaseToy = toy;
								}
							}

							if (purchaseToy == null) {
								break;
							}

							System.out.println("Enter option number to purchase: ");
							int purchaseOption = keyboard.nextInt();
							if (purchaseOption == 1) {
								purchaseToy.setAvailableCount(purchaseToy.getAvailableCount() - 1);
							}
							break;

						case 2:
							System.out.println("Enter toy name: ");
							String searchToyName = keyboard.next();
							System.out.println("Here are the search results: ");
							for (Toy toy : toyList) {
								if (toy.getName().toUpperCase().contains(searchToyName.toUpperCase())) {
									System.out.println(toy.Format());
								}
							}
							break;

						case 3:
							System.out.println("Enter toy type: ");
							String searchType = keyboard.next();
							System.out.println("Here are the search results: ");
							for (Toy toy : toyList) {
								if (toy.getBrand().equals(searchType)) {
									System.out.println(toy.Format());
									break;
								}
							}
							break;

						case 4:
							break;
					}
					break;

				case 2:
					System.out.println("Enter Serial Number: ");
					String option = keyboard.next();
					char snChar = option.charAt(0);
					AddNewToyMenu.addNewToyMenu(snChar);
					System.out.println("Press Enter to continue...");
					keyboard.nextLine();
					System.out.println("");
					break;

				case 3:
					RemoveToyMenu.removeToyMenu();
					Long removeSnNum = keyboard.nextLong();
					for (Toy toy : toyList) {
						if (removeSnNum.equals(toy.getSn())) {
							toy.Format();
							System.out.println("Do you want to remove this toy?(y/n): ");
							String removeChoice = keyboard.next();
							removeChoice.toUpperCase();
							if (removeChoice == "Y") {
								toyList.remove(toy);
							} else if (removeChoice == "N") {
								break;
							} else {
								System.out.println("Not an valid input!");
								break;
							}
						}
					}
					break;

				case 4:
					break;

				case 5:
					notExit = false;
					System.out.println("Saving Data Into Database...");
					FileWriter fw = new FileWriter("toys.txt", false);

					for (Toy toy : toyList) {
						fw.write(toy.Write());
					}
					fw.close();

					break;
			}
		}
	}

}

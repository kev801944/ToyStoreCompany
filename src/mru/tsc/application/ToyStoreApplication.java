package mru.tsc.application;
import java.util.ArrayList;
import java.util.Scanner;

import mru.tsc.controller.InitialFileReader;
import mru.tsc.controller.PopulateToyList;
import mru.tsc.controller.ToyClassification;
import mru.tsc.model.Toy;
import mru.tsc.view.MainMenu;
import mru.tsc.view.SearchPurchaseMenu;

public class ToyStoreApplication {
	public static void main(String[] args) {
//		Scanner keyboard = new Scanner(System.in);
//		MainMenu.mainMenu();
//		int inputOption = keyboard.nextInt();
//
//		switch(inputOption) {
//		case 1:
//			SearchPurchaseMenu.searchPurchaseMenu();
//			break;
//		default:
//			System.out.println("Not an valid input!!!");
//		}
		ArrayList<String> rawData = InitialFileReader.initFileRead();
		ArrayList<String> snList = new ArrayList<String>();
		for(String data: rawData) {
			String sn = data.split(";")[0];
			snList.add(sn);
			}
		ArrayList<Toy> toyList = PopulateToyList.populateList(snList);
		for (Toy toy:toyList) {
			System.out.println(toy.getSN());
		}
		
//		for(String entry:rawData) {
//			System.out.println(entry);
//		}
//		ToyClassification.toyClassification(rawData);
	}
}

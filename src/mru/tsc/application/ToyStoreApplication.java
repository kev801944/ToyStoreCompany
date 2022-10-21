package mru.tsc.application;
import java.util.Scanner;

import mru.tsc.view.MainMenu;
import mru.tsc.view.SearchPurchaseMenu;

public class ToyStoreApplication {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		MainMenu.mainMenu();
		try {
			int inputOption = keyboard.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		switch(inputOption) {
		case 1:
			SearchPurchaseMenu.searchPurchaseMenu();
			break;
		default:
			System.out.println("Not an valid input!!!");
		}
		
	}
}

package mru.tsc.view;

/**
 * This is the main method that displays the choices for the user
 * @author Shaina Anne Garrido and Kevin Luo
 *
 */
public class MainMenu {
	public static void mainMenu() {
		String[] statements = {
				"*********************************************************",
				"*		WELCOME TO TOY STORE COMPANY		*",
				"*********************************************************",
				"How We May Help You?",
				"",
				"(1) Search Inventory and Purchase Toy",
				"(2) Add New Toy",
				"(3) Remove Toy",
				"(4) Suggestion",
				"(5) Save & Exit",
				"Enter Option: "
		};

		for (String statement : statements) {
			System.out.println(statement);
		}

	}
}

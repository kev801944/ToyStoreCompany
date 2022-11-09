package mru.tsc.view;

public class SearchPurchaseMenu {
	public static void searchPurchaseMenu() {
		String[] statements = {
				"Find Toys With: ",
				"(1) Serial Numer(SN)",
				"(2) Toy Name",
				"(3) Type",
				"(4) Back to Main Menu",
				"",
				"Enter Option: "
		};

		for (String statement : statements) {
			System.out.println(statement);
		}

	}
}

package mru.tsc.view;

/**
 * This is the suggestion menu that offers the user a gift suggestion and what they would like to gift
 * @author Kevin Luo and Shaina Anne Garrido
 *
 */
public class SuggestionMenu {
    public static void suggestionMenu() {
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

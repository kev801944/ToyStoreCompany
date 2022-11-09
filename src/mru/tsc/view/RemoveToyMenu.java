package mru.tsc.view;

/**
 * This class if for when a user wants to remove a toy
 * @author Shaina Anne Garrido and Kevin Luo
 *
 */
public class RemoveToyMenu {
    public static void removeToyMenu() {
        String[] statemenStrings = {
                "Enter Serial Number: "
        };
        for (String statement : statemenStrings) {
            System.out.println(statement);
        }
    }
}

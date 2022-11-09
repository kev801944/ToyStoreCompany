package mru.tsc.view;

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

package mru.tsc.view;

import java.util.ArrayList;
import java.util.Arrays;

public class AddNewToyMenu {
    public static void addNewToyMenu(char snChar) {
        ArrayList<String> statemenStrings = new ArrayList<String>(
                Arrays.asList("Enter Toy Name: ",
                        "Enter Toy Brand: ",
                        "Enter Toy Price: ",
                        "Enter Available Count: ",
                        "Enter Appropriate Age: "));

        switch (snChar) {
            case '0':
            case '1':
                statemenStrings.add("Enter Classification: ");
                break;
            case '2':
            case '3':
                statemenStrings.add("Enter Material: ");
                statemenStrings.add("Enter Size: ");
                break;
            case '4':
            case '5':
            case '6':
                statemenStrings.add("Enter Puzzle Type: ");
                break;
            case '7':
            case '8':
            case '9':
                statemenStrings.add("Enter Minimum Number of Players: ");
                statemenStrings.add("Enter Maximmum Number of Players: ");
                statemenStrings
                        .add("Enter Designer Names(Use ',' to separate the names if there is more than one name): ");
                break;

        }

        for (String statement : statemenStrings) {
            System.out.println(statement);
        }

    }
}

package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The initialFileReader class is a class that is used to read the toys.txt file and convert 
 * the data into an ArrayList of Strings that holds every entry of the toys.txt file
 */
public class InitialFileReader {

	/**
	 * Reads the toys.txt file and stores the entries inside of an ArrayList
	 * 
	 * @return An ArrayList of Strings read from the toys.txt file
	 */
    public static ArrayList<String> initFileRead() {
    	
    	// Initializing the Scanner class
        Scanner inputFile = null;
        
        // An ArrayList of Strings used to store the raw output from the file read
        ArrayList<String> rawData = new ArrayList<String>();
        
        try {
        	// Reading from the toys.txt file from res folder
            File f = new File("res/toys.txt");
            
            // The scanned file
            inputFile = new Scanner(f);
            
            // Initialize an Array to store the data
            String[] dataFile = null;

            /* Reading through each line of the input file and splitting the text with the
               delimiter ;
            */
            while (inputFile.hasNextLine()) {
                String lineRead = inputFile.nextLine();
                dataFile = lineRead.split("\n");

                for (String data : dataFile) {
                    rawData.add(data);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! " + e);
            return null;
        } finally {
            if (inputFile != null)
                inputFile.close();
        }
        // Return the ArrayList of all the entries
        return rawData;
    }
}

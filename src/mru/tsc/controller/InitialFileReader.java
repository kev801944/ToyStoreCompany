package mru.tsc.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InitialFileReader {
		
	public static ArrayList<String> initFileRead(){
        Scanner inputFile = null;
        ArrayList<String> rawData = new ArrayList<String>();
        try {
            File f = new File("res/toys.txt");
            inputFile = new Scanner(f);
            String[] dataFile = null;

            while(inputFile.hasNextLine()) {
            	String lineRead = inputFile.nextLine();
            	dataFile = lineRead.split("\n");

            	for (String data:dataFile) {
            		rawData.add(data);
            	}
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error! " + e);
            return null;
        }finally{
            if (inputFile != null) 
            	inputFile.close();
        }
        return rawData;
    }		
}















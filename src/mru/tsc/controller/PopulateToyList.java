package mru.tsc.controller;
import java.util.ArrayList;

import mru.tsc.model.Toy;

public class PopulateToyList {
	public static ArrayList<Toy> populateList(ArrayList<String> snList){
		ArrayList<Toy> toyList = new ArrayList<Toy>();
		for (String sn:snList) {
			Toy toy = new Toy();
			toyList.add(toy);
		}
		System.out.println(toyList);
		return toyList;
	}
}

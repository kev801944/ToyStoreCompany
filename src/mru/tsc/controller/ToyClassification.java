package mru.tsc.controller;

import java.util.ArrayList;
import java.util.Arrays;

public class ToyClassification {
	public static char toyClassification(ArrayList<String> rawData) {
		String[] entry = rawData.get(0).split(";");

		char sn = entry[0].charAt(0);
		return sn;
	}
}

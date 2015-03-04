package edu.calstatela.cs203.lab07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Reader {
	
	private static String[] stopWords = { "to", "the" };
	private static Set<String> stopWordsSet = new HashSet<String>();
	
	private ArrayList<String> cleanUp(String[] words) {
		ArrayList<String> cleanWords = new ArrayList<String>();
		
		for (String word : words) {
			String t = word.replaceAll("\\.", "").replaceAll(";", "").replaceAll(":", "");
			if (!stopWordsSet.contains(t))
				cleanWords.add(t);
		}
		
		return cleanWords;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		String[] lines = new String[3];
		
		lines[0] = scanner.nextLine();
		lines[1] = scanner.nextLine();
		lines[2] = scanner.nextLine();
		
		Map<String,Integer> table = new TreeMap<String,Integer>();
		
		for (String word : stopWords) {
			stopWordsSet.add(word);
		}
		
		for (String line : lines) {
			String[] words = line.split("\\s+");
			for (String cleanWord : cleanUp(words)) {
				if (cleanWord.equals("")) {
					continue;
				}
				if (table.containsKey(cleanWord)) {
					int count = table.get(cleanWord);
					table.put(cleanWord, count + 1);
				} else {
					table.put(cleanWord, 1);
				}
			}
		}
		
		for (String word : table.keySet()) {
			System.out.println(word + ": " + table.get(word));
		}
	}

	public static void main(String[] args) {
		new Reader().run();
	}
}

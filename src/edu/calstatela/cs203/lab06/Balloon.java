package edu.calstatela.cs203.lab06;

import java.util.UUID;

class IdCollection {
	public String getId() {
		boolean done = false;
		String id = "";
		do {
			String key = UUID.randomUUID().toString();
			boolean found = false;
			for (String i : ids) {
				if (i.equals(key)) {
					found = true;
				}
			}
			
			if (!found) {
				id = key;
				ids.add(key);
				done = true;
			}
		} while (!done);
		
		return id;
	}
	private java.util.ArrayList<String> ids = new java.util.ArrayList<String>();
}

public class Balloon implements Comparable {
	String id;
	private static IdCollection idCollection = new IdCollection();
	double radius;
	int color;

	Balloon() {
		id = idCollection.getId();
		radius = Math.random() * 10 + 1;
		color = (int)(Math.random() * 100);
	}

	public int compareTo(Object other) {
		Balloon otherBalloon = (Balloon) other;
		if (color == otherBalloon.color) { 
			return 0;
		} else if (color > otherBalloon.color) {
			return 1;
		} else {
			return -1;
		}
	}

	public String toString() {
		return id + "" + " color = " + color + " radius = " + radius;
	}

	public static void main(String args[]) {
		java.util.TreeSet<Balloon> set = new java.util.TreeSet<Balloon>();
		for (int i = 0; i < 10; i++) {
			set.add(new Balloon());
		}
		
		for (Balloon b : set) {
			System.out.println(b);
		}
	}
	
	public static void main4(String[] args) {
		java.util.ArrayList<Balloon> list = new java.util.ArrayList<Balloon>();
		java.util.TreeMap<Double,Balloon> radiusTable = new java.util.TreeMap<Double,Balloon>();
		
		for (int i = 0; i < 10; i++) {
			list.add(new Balloon());
		}
		
		for (Balloon b : list) {
			Double key = b.radius;
			radiusTable.put(key, b);
		}
		
		for (Double key : radiusTable.keySet()) {
			System.out.printf("k = %f => v = %s\n", key, radiusTable.get(key));
		}
	}
	
	public static void main3(String[] args) {
		java.util.ArrayList<Balloon> list = new java.util.ArrayList<Balloon>();
		java.util.TreeMap<Integer,Integer> countTable = new java.util.TreeMap<Integer,Integer>();
		
		for (int i = 0; i < 10000; i++) {
			list.add(new Balloon());
		}
		
		for (Balloon b : list) {
			Integer key = b.color;
			if (countTable.containsKey(key)) {
				int value = countTable.get(key) + 1;
				countTable.put(key, value);
			} else {
				countTable.put(key, 1);
			}
		}
		
		for (Integer key : countTable.keySet()) {
			System.out.printf("k = %d => v = %d\n", key, countTable.get(key));
		}
	}
	
	public static void main2(String[] args) {
		java.util.ArrayList<Balloon> list = new java.util.ArrayList<Balloon>();
		java.util.TreeMap<Integer, Long> stopWatchTable = new java.util.TreeMap<Integer,Long>();

		for (int i = 0; i < 1000000; i += 10000) {
			long startTime = System.currentTimeMillis();
			for (int j = i; j < i + 10000; j++) {
				list.add(new Balloon());
			}
			long endTime = System.currentTimeMillis();
			long tick = endTime - startTime;
			System.out.println(i + " " + tick);
			stopWatchTable.put(i, tick);
		}
		
		for (Integer n : stopWatchTable.keySet()) {
			Long time = stopWatchTable.get(n);
			
			System.out.println(n + " " + time);
		}
	}

}

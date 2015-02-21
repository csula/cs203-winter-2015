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

public class Balloon {
	String id;
	private static IdCollection idCollection = new IdCollection();

	Balloon() {
		id = idCollection.getId();
	}

	public String toString() {
		return id + "";
	}

	public static void main(String[] args) {
		java.util.ArrayList<Balloon> list = new java.util.ArrayList<Balloon>();
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.add(new Balloon());
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("elapsed time = " + (endTime - startTime));
	}
}

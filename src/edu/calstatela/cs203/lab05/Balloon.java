package edu.calstatela.cs203.lab05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class Balloon {
	int id;
	private static int idcount = 0;
	
	Balloon() {
		id = idcount++;
	}
	
	public String toString() {
		return id + "";
	}
	
	public static void main(String[]args ) {
		java.util.ArrayList<Balloon> list = new java.util.ArrayList<Balloon>();
		for (int i = 0; i < 5; i++) { 
			list.add(new Balloon());
		}
		
		for (Balloon b : list) {
			System.out.println(b);
		}
		
		Iterator<Balloon> it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		Map<String,Balloon> map = new HashMap<String,Balloon>();
		UUID uuid = UUID.randomUUID();
		String key = uuid.toString();
		Balloon value = new Balloon();
		System.out.println("key = " + key);
		System.out.println("value = " + value);
		map.put(key, value);
		Balloon b = map.get(key);
		System.out.println("value = " + b);
	}
}

package edu.calstatela.cs203.lab5;

public class Balloon {
	int id;
	private static int idcount = 0;
	
	Balloon() {
		id = idcount++;
	}
	
	public String toString() {
		return id + "";
	}
}

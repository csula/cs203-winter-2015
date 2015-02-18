package edu.calstatela.cs203.lab05;

public class MapNode {
	
	public MapNode(Object key, Object value) {
		this.key = key;
		this.value = value;
	}
	
	public String toString() {
		return key.toString();
	}
	
	Object key;
	Object value;
}

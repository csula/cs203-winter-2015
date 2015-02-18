package edu.calstatela.cs203.lab05;

public class MapContainer /* extends Container */ {
	ListContainer container;

	public void add(Object key, Object value) {
		
		if (container.has(key.toString())) {
			// update accordingly
		}
		else {
			MapNode mn = new MapNode(key,value);
			container.add(new ListNode( mn ));
		}
	}
	
	public Object get(String key) {
		return null; // update accordingly
	}
	
	// update the rest...
}

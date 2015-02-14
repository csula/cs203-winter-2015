package edu.calstatela.cs203.lab5;

public class ListContainer {
	ListNode head = null;
	
	public static void main(String args[]) {
		ListContainer lc = new ListContainer();
		for (int i = 0; i < 5; i++) {
			lc.add( new ListNode(new Balloon()) );
		}
		
		System.out.println(lc.hasNode("1"));
	}
	
	public boolean hasNode(String name) {
		return false;
	}
	
	public void add(ListNode node) {
		if (head == null) {
			head = node;
		}
		
		append(node);
	}
	
	public void delete(String name) {
		// search the list compare object.toString() with name and delete accordingly
	}
	
	private void append(ListNode node) {
		ListNode currentPtr = head;
		while (currentPtr.next != null) {
			currentPtr = currentPtr.next;
		}
		currentPtr.next = node;
	}
	
	private void insert(ListNode node) {
		node.next = head;
		head = node;
	}
}

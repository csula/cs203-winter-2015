package edu.calstatela.cs203.lab05;

public class ListContainer extends Container {
	private ListNode head = null;
	
	public static void main(String args[]) {
		ListContainer lc = new ListContainer();
		for (int i = 0; i < 5; i++) {
			lc.add( new ListNode(new Balloon()) );
		}
		
		System.out.println(lc.has("1"));
	}
	
	public boolean has(String name) {
		ListNode currentPtr = head;
		while (currentPtr != null) {
			
			if (currentPtr.object.toString().equals(name)) {
				return true;
			}
			
			currentPtr = currentPtr.next;
		}
		
		return false;
	}
	
	public void add(ListNode node) {
		if (head == null) {
			head = node;
		}
		
		append(node);
	}
	
	public void remove(String name) {
		// search the list compare object.toString() 
		// with name and delete accordingly
	}
	
	protected void append(ListNode node) {
		ListNode currentPtr = head;
		while (currentPtr.next != null) {
			currentPtr = currentPtr.next;
		}
		currentPtr.next = node;
	}
	
	protected void insert(ListNode node) {
		node.next = head;
		head = node;
	}

	public Object remove_from_front() {
		return null;
	}

	public Object remove_from_back() {
		return null;
	}
}

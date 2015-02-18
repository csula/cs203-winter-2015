package edu.calstatela.cs203.lab05;

public class StackContainer extends ListContainer {

	public void push(Object object) {
		insert(new ListNode(object));
	}
	
	public Object pop() {
		return super.remove_from_front();
	}
}

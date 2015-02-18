package edu.calstatela.cs203.lab05;

public class SetContainer extends ListContainer {
	public void insert(Object object) {
		if (! has(object.toString())) {
			super.insert(new ListNode(object));
		}
	}
}

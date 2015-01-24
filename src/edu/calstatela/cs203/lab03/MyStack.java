package edu.calstatela.cs203.lab03;

public class MyStack {
	private java.util.ArrayList arraylist = 
			new java.util.ArrayList();
	
	public void push(Object o) {
		arraylist.add(o);
	}
	
	public Object pop() {
		int lastOneIndex = arraylist.size() - 1;
		Object o = arraylist.get(lastOneIndex);
		arraylist.remove(o);
		return o;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		for (int i = 0; i < 3; i++) { 
			Balloon b = new Balloon();
			stack.push( b );
		}
		
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
	}
	
}

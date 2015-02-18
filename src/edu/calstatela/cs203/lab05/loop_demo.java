package edu.calstatela.cs203.lab05;

public class loop_demo {
	public static void main(String[] args) {
		f(5);
	}
	
	// System.out.println("john");
	static void f(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n + " john");
		f(n-1);
	}
}

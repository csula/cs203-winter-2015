package edu.calstatela.cs203.lab5;

public class factorial {
	public static void main(String[] args) {
		System.out.println("f(10) = " + f(10));
	}
	
	static int f(int n) {
		if (n == 0) {
			return 1;
		}
	
		return n * f(n - 1);
	}
}

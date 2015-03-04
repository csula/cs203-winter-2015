package edu.calstatela.cs203.lab07;

public class InsertionSortDemo {

	public static void Sort(int[] a) {
		/* outer loop: O(n) */
		/* assume that you've already have the first element */
		for (int i = 1; i < a.length; i++) {
			int currentElement = a[i];
			int k;
			/* inner loop: O(n): implicit k = i for worst case scenario */
			for (k = i - 1; k >= 0 && a[k] > currentElement; k--) {
				a[k+1] = a[k];
			}
			a[k+1] = currentElement;
		}
	}
	
	public static void main(String[] args) {
		int[] a = { 2, 5, 9, 4, 8, 1, 6 };
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");

		Sort(a);
		
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}
}

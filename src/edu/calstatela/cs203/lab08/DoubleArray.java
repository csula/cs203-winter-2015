package edu.calstatela.cs203.lab08;

public class DoubleArray {
	private double[] array;
	DoubleArray(int N) {
		array = new double[N];
		for (int i = 0; i < N; i++) {
			array[i] = Math.random();
		}
	}
	
	public String toString() {
		String s = "[";
		for (double a : array) {
			s += a + " ";
		}
		return s + "]";
	}
	
	public void serialDouble() {
		for (int i = 0; i < array.length; i++) {
			array[i] *= 2.0;
		}
	}
	
	public void parallelHalf() {
		Thread[] threads = new Thread[2];
		for (int i = 0; i < 2; i++) {
			threads[i] = new Thread();
		}
		
		for (int i = 0; i < 2; i++) {
			threads[i].start();
		}
		
		try {
			threads.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		DoubleArray aa = new DoubleArray(8);
		System.out.println(aa);
		aa.serialDouble();
		System.out.println(aa);
		aa.parallelHalf();
		System.out.println(aa);
	}
}

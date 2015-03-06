package edu.calstatela.cs203.lab08;

interface CONSTANTS {
    public static final int SIZE = 10000;
    public static final int THREAD_COUNT = 4;
}

class Task implements Runnable, CONSTANTS {
    private int id;
    private double[] a;
    private double sum = 0.0;

    public Task() {
        System.out.println("default constructor not allowed");
        System.exit(-1);
    }

    public Task(int id, double[] a) {
        this.id = id; this.a = a;
    }

    double getSum() {
    	// calculate the subset sum given array a and id
        return sum;
    }

    public void run() {
        int start = id * SIZE/THREAD_COUNT;
        int end = (id + 1) * SIZE/THREAD_COUNT;
        sum = ThreadDemo.sum(a, start, end);
        System.out.println("task id = " + id + " sum = " + sum);
    }
}

public class ThreadDemo implements CONSTANTS {

    public static void main(String[] args) {
        new ThreadDemo().runApp();
    }

    private void runApp() {
        double[] a = newArray(SIZE);
        Task[] tasks = new Task[THREAD_COUNT];
        Thread[] threads = new Thread[THREAD_COUNT];

        for (int i = 0; i < THREAD_COUNT; i++) {
            tasks[i] = new Task(i, a);
            threads[i] = new Thread(tasks[i]);
        }

        System.out.println("serial sum = " + sum(a, 0, a.length));

        for (int i = 0; i < THREAD_COUNT; i++) {
            threads[i].start();
        }

        for (int i = 0; i < THREAD_COUNT; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        double sumOfSum = 0.0;
        for (int i = 0; i < THREAD_COUNT; i++) {
            sumOfSum += tasks[i].getSum();
        }
        System.out.println("paralel sum = " + sumOfSum);
    }

    public static double sum(double[] a, int start, int end) {
        double sum = 0.0;
        for (int i = start; i < end; i++) {
            sum += a[i];
        }
        return sum;
    }

    private double[] newArray(int N) {
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = Math.random();
        }
        return a;
    }

}
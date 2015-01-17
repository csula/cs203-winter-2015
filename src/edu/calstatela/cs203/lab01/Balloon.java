package edu.calstatela.cs203.lab01;

public class Balloon {

	static int balloonCounts = 0;
	
	private final int R;
	private final int G;
	private final int B;

	private int x;
	private int y;

	private double vx;
	private double vy;
	
	private double radius;

	private boolean exist;

	/* constructors */

	Balloon() {
		R = randomColor();
		G = randomColor();
		B = randomColor();
		x = randomPosition();
		y = randomPosition();
		vx = randomVelocity();
		vx = randomVelocity();
		radius = randomRadius();
		exist = true;
		balloonCounts++;
	}

	/* accessors */
	
	public String toString() {
		String buffer = "";
		buffer += "(x,y) = (" + x + "," + y + ") ";
		buffer += "(R,G,B) = (" + R + "," + G + "," + B + ")";
		return buffer;
	} 
	
	private double randomRadius() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isExist() {
		return exist == true;
	}
	
	public void print() {
		System.out.println("(x,y) = (" + x + "," + y + ")");
	}
	
	/* mutators */
	
	public void drift( /* maybe */) {
		// TODO calculate new (x',y') base on (vx,vy) and (x,y)
	}

	private double randomVelocity() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int randomPosition() {
		return (int) (Math.random() * 200);
	}

	private int randomColor() {
		return (int) (Math.random() * 255);
	}

	/* main method */
	
	public static void main(String[] args) {
		final int N = 10; 
		Balloon[] balloons = new Balloon[N]; // 10 references to Balloons
		
		for (int i = 0; i < N; i++) {
			balloons[i] = new Balloon();
		}
		
		for (int i = 0; i < N; i++) {
			System.out.println(balloons[i]);
		}
	}

}

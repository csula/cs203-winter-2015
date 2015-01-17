package edu.calstatela.cs203.lab01;

public class Balloon {

	private final int R;
	private final int G;
	private final int B;

	private int x;
	private int y;

	private double vx;
	private double vy;

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
		exist = true;
	}

	/* accessors */
	
	public boolean isExist() {
		return exist == true;
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
		// TODO Auto-generated method stub
		return 0;
	}

	private int randomColor() {
		return (int) (Math.random() * 255);
	}

	/* main method */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

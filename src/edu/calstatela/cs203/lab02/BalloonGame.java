package edu.calstatela.cs203.lab02;

public class BalloonGame extends Game {

	/* we have constant number of balloons => 5 */
	final int N = 5;
	
	/* a balloongame has a collection of balloons */
	Balloon[] balloons;
	
	void start() {
		status = true;
	}

	BalloonGame() {
		balloons = new Balloon[N];
		for (int i = 0; i < N; i++) {
			balloons[i] = new Balloon();
		}
	}
	
	void stop() {
		status = false;
	}

	void pause() {
		// TODO Auto-generated method stub
	}
	
	public static void main(String[] args) {
		BalloonGame game = new BalloonGame("john");
		game.start();
		game.moveBalloons();
		game.displayInformation();
		game.stop();
	}


}

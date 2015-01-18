package edu.calstatela.cs203.lab02;

public abstract class Game {
	public final String nameOfPlayer;
	private int score = 0;
	protected boolean status = false;
	
	abstract void start();
	abstract void stop();
	abstract void pause();
	
	Game() {
		nameOfPlayer = "Unknown";
	}
	
	Game(String nameOfPlayer) {
		this.nameOfPlayer = nameOfPlayer;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
	
}

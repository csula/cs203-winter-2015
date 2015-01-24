package edu.calstatela.cs203.lab03;

import javax.swing.*;

public class SimpleCanvas {
	
	SimpleCanvas() {
		JFrame frame = new JFrame("simple gui");
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create the panel
		JPanel canvasPanel = new JPanel();
		JPanel controlPanel = new JPanel();
		
		// create a button widget
		JButton startButton = new JButton("start");
		JButton stopButton = new JButton("stop");
		JButton pauseButton = new JButton("pause");
		
		// add the button to the panel
		controlPanel.add(startButton);
		controlPanel.add(stopButton);
		controlPanel.add(pauseButton);
		
		// add the panel to the frame
		frame.add(canvasPanel);
		frame.add(controlPanel);
	}
	
	public static void main(String args[]) {
		new SimpleCanvas();
		System.out.println("I am here!");
	}
}

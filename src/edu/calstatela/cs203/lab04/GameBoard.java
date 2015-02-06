package edu.calstatela.cs203.lab04;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class GameBoard {
	Timer timer; // timer reference!
	CanvasPanel canvasPanel;
	RadiusAction ra;

	class StartTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.start();
		}
	}

	class StopTimer implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			timer.stop();
		}
	}

	class RadiusAction implements ActionListener {
		private int radius = 5;

		int getRadius() {
			return radius;
		}

		void resetRadius() {
			radius = 5;
		}

		public void actionPerformed(ActionEvent e) {
			radius++;
			canvasPanel.repaint();
		}
	}

	class CanvasPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		CanvasPanel() {
			super();
			this.addMouseListener( new MouseAction() );
		}
		protected void paintComponent(Graphics pen) {
			super.paintComponent(pen);
			pen.setColor(Color.RED);
			pen.fillOval(20, 20, 
					ra.getRadius(),
					ra.getRadius() );
		}
	}
	
	class MouseAction implements MouseListener {

		public void mouseClicked(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			System.out.println("x = " + x + " y = " + y);
		}

		public void mouseEntered(MouseEvent event) {	}
		public void mouseExited(MouseEvent event) { 	}
		public void mousePressed(MouseEvent event) { 	}
		public void mouseReleased(MouseEvent event) { 	}

	}

	GameBoard() {
		JFrame frame = new JFrame("simple gui");
		frame.setVisible(true);
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(2, 1));

		// create radius action
		ra = new RadiusAction();

		// create a timer to update the action
		timer = new Timer(1000, ra);

		// create the panel
		canvasPanel = new CanvasPanel();
		JPanel controlPanel = new JPanel();

		// create a button widget
		JButton startButton = new JButton("start");
		startButton.addActionListener(new StartTimer());

		JButton stopButton = new JButton("stop");
		stopButton.addActionListener(new StopTimer());

		JButton pauseButton = new JButton("pause");

		// add the button to the panel
		controlPanel.add(startButton);
		controlPanel.add(stopButton);
		controlPanel.add(pauseButton);

		// canvas specific layout
		canvasPanel.setLayout(new GridLayout(1, 1));

		// add the panel to the frame
		frame.add(canvasPanel);
		frame.add(controlPanel);
	}

	public static void main(String args[]) {
		new GameBoard();
	}
}

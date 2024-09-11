package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false); //Resizable
		window.setTitle("Ilias' 2D Adventure"); //Windowtitle
		
		GamePanel gamePanel = new GamePanel(); //add Gamepanel to the window
		window.add(gamePanel);
		
		window.pack();
		
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		gamePanel.setUpGame();
		gamePanel.StartGameThread();
	}

}

package com.techlabs.swing.case3;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends JFrame{
	public WelcomeFrame() {
		this.setSize(1024,768);
		this.setVisible(true);
		this.setTitle("Welcome page");
		this.getContentPane().setBackground(Color.YELLOW);
		
		JLabel welcomeLabel = new JLabel("Welcome " + LoginFrame.name);
		welcomeLabel.setBounds(200, 300, 80, 80);
		
		add(welcomeLabel);
		
	}

}

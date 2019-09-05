package com.techlabs.swing.case2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObservableFrame extends JFrame{
	private JButton helloButton;
	private JButton exitButton ;
	public ObservableFrame() {   
		this.setSize(1024,768);
		this.setVisible(true);
		this.setTitle("Akash");
		this.getContentPane().setBackground(Color.BLUE);
		
		helloButton = new JButton("Hello");
		exitButton = new JButton("Exit");
		helloButton.setBounds(200, 200, 100, 100);
		exitButton.setBounds(500,200,100,100);
		
		add(helloButton);
		add(exitButton);
		
		helloButton.addActionListener(new CommonListener(this));
		exitButton.addActionListener(new CommonListener(this));
		
	}
	public JButton getHelloButton() {
		return helloButton;
	}
	public JButton getExitButton() {
		return exitButton;
	}
	

}

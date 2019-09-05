package com.techlabs.swing.case1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ObservableFrame extends JFrame{
	public ObservableFrame() {
		this.setSize(1024,768);
		this.setVisible(true);
		this.setTitle("Akash");
		this.getContentPane().setBackground(Color.BLUE);
		
		JButton helloButton = new JButton("Hello");
		helloButton.setBounds(200, 200, 100, 100);
		
		add(helloButton);
		helloButton.addActionListener(new HelloListener());
		helloButton.addActionListener(new ThankyouListener());
	}
	

}

package com.techlabs.nonblocking;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NonBlockingFrame extends JFrame{
	public NonBlockingFrame() {
		this.setSize(1024,768);
		this.setVisible(true);
		
		JButton helloButton = new JButton("Hello");
		helloButton.setBounds(200, 200, 100, 100);
		this.add(helloButton);
		
		JButton printButton = new JButton("Print");
		printButton.setBounds(400, 200, 100, 100);
		this.add(printButton);
		
		helloButton.addActionListener(new Hello());
		printButton.addActionListener(new Printer());
		
		this.setLayout(new FlowLayout());
		
	}

}

package com.techlabs.nonblocking;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Hello implements ActionListener, Runnable {
	@Override
	public void actionPerformed(ActionEvent e) {
		Thread t1 = new Thread(new Hello());
		t1.start();
	}

	@Override
	public void run() {
		JDialog dialog = new JDialog();
		dialog.setLayout( new FlowLayout() );
		
		dialog.add( new JLabel ("Hello World!"));    
		dialog.setSize(300,150);    
		dialog.setVisible(true);
		
	}

}

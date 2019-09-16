package com.techlabs.blocking;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Hello implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog dialog = new JDialog();
		dialog.setLayout( new FlowLayout() );
		
		dialog.add( new JLabel ("Hello World!"));    
		dialog.setSize(300,150);    
		dialog.setVisible(true);
	}

}

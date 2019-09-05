package com.techlabs.swing.case2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class CommonListener implements ActionListener{
	
	private ObservableFrame frame;
	
	public CommonListener(ObservableFrame frame) {
		this.frame = frame;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getActionCommand().equals("Hello")) {     // Using getActionCommand 
		JDialog dialog = new JDialog();
		dialog.setLayout( new FlowLayout() );
		
		dialog.add( new JLabel ("Hello button pressed."));    
		dialog.setSize(300,150);    
		dialog.setVisible(true);
		}
		if(e.getSource() == frame.getExitButton()) {   // Using Object
			System.exit(0);
		}
		
	}

}

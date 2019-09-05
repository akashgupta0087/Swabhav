package com.techlabs.swing.case3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

public class Validator implements ActionListener {

	private LoginFrame loginFrame;

	public Validator(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
	}

private boolean validateUserInputs(String username, String password) {
	if(username.equals(password)) {
		return true;
	}
	return false;
	
}

@Override
public void actionPerformed(ActionEvent e) {
	String username = loginFrame.getUsername().getText();
	String password = loginFrame.getPassword().getText();
	if(validateUserInputs(username, password)) {
		LoginFrame.name = username; 
		WelcomeFrame welcomeFrame = new WelcomeFrame();
		
	}
	else {
		JDialog dialog = new JDialog();
		dialog.setLayout( new FlowLayout() );
		
		dialog.add( new JLabel ("Invalid username or password"));    
		dialog.setSize(300,150);    
		dialog.setVisible(true);
	}
	
}
}

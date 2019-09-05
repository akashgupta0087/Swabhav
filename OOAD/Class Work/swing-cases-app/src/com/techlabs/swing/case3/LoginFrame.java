package com.techlabs.swing.case3;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
	static String name;

	JTextField username;
	JTextField password;
	JLabel usernameLabel;
	JLabel passwordLabel;
	JButton loginButton;

	public LoginFrame() {
		this.setSize(1024, 768);

		this.setTitle("Login page");
		this.getContentPane().setBackground(Color.CYAN);

		usernameLabel = new JLabel("Username:");
		usernameLabel.setBounds(50, 100, 100, 30);
		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(50, 150, 100, 30);
		
		this.add(usernameLabel);
		this.add(passwordLabel);

		username = new JTextField();
		password = new JTextField();
		username.setBounds(150, 100, 200, 30);
		password.setBounds(150, 150, 200, 30);

		this.add(username);
		this.add(password);
		
		loginButton = new JButton("Login");
		loginButton.setBounds(200, 200, 100, 50);
		this.add(loginButton);

		this.setLayout(null);
		this.setVisible(true);
		
		loginButton.addActionListener(new Validator(this));

	}

	public JTextField getUsername() {
		return username;
	}

	public JTextField getPassword() {
		return password;
	}

}

package com.techlabs.jframe;
import java.awt.Color;

import javax.swing.*;

public class JFrameDemo {
	public static void main(String[] args) {
		WelcomeFrame welcome = new WelcomeFrame();
		
		JButton button = new JButton("Click");
		button.setBounds(400, 350, 100, 40);
		welcome.add(button);
	}

}

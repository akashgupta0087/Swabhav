package com.techlabs.game.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameFrame extends JFrame{
	
	JButton[] cells = new JButton[9];
	
	public GameFrame() {
		this.setSize(1024, 768);
		this.setTitle("Tic Tac Toe");
		this.getContentPane().setBackground(Color.CYAN);
		
		for(int i = 0; i < cells.length; i++) {
			cells[i] = new JButton("" + (i+1));
			add(cells[i]);
		}
		
		JPanel main = new JPanel(new GridLayout(3,1));
		add(main);
		
		JPanel top = new JPanel();
        main.add(top,new BorderLayout().CENTER);
        JLabel currentPlayerDisplay = new JLabel("Current Player:   Sachin");
        top.add(currentPlayerDisplay);
        
        JPanel centerMaster = new JPanel(new GridLayout(1,3));
        JPanel left = new JPanel();
        JPanel center = new JPanel(new GridLayout(3,3));
        JPanel right = new JPanel();
        
        centerMaster.add(left);
        centerMaster.add(center);
        centerMaster.add(right);
        main.add(centerMaster);
        for(int i = 0; i < cells.length; i++) {
			cells[i] = new JButton("" + (i+1));
			center.add(cells[i]);
		}
        
        JPanel bottom = new JPanel(new GridLayout(1,1));
        main.add(bottom);
        JLabel gameProgress = new JLabel("Game Progress:   Progress");
        currentPlayerDisplay.setBounds(600,600,80,80);
        bottom.add(gameProgress);
        
        this.setVisible(true);
		
		
	}

}

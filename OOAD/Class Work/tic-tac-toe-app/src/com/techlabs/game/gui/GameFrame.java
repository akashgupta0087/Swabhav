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

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.ResultAnalyzer;

public class GameFrame extends JFrame{
	
	JButton[] cells = new JButton[9];
	Game game;
	JLabel currentPlayerDisplay;
	JLabel gameProgress;
	
	public GameFrame() {
		this.setSize(1024, 768);
		this.setTitle("Tic Tac Toe");
		this.getContentPane().setBackground(Color.CYAN);
		
		Player[] players = new Player[2];
		players[0] = new Player("Sachin", Mark.CROSS);
		players[1] = new Player("Kholi", Mark.NOUGHT);
		
		Board board = new Board(new Cell[9]);

	    game = new Game(board, players, new ResultAnalyzer(board));
		
		JPanel main = new JPanel(new GridLayout(3,1));
		add(main);
		
		JPanel topMaster = new JPanel(new GridLayout(3,3));
		JPanel topUpper = new JPanel();
		currentPlayerDisplay = new JLabel(this.getGame().getCurrentPlayer().getName());
		JPanel topLower = new JPanel();
		topMaster.add(topUpper);
		topMaster.add(currentPlayerDisplay,new BorderLayout().CENTER);
		topMaster.add(topLower);
        main.add(topMaster,new BorderLayout().CENTER);
        
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
			cells[i].addActionListener(new CommonListener(this));
		}
        
        JPanel bottom = new JPanel(new GridLayout(1,1));
        main.add(bottom);
        gameProgress = new JLabel("Progress");
        currentPlayerDisplay.setBounds(600,600,80,80);
        bottom.add(gameProgress);
        
        this.setVisible(true);
       
	}

	public Game getGame() {
		return game;
	}

	public JButton[] getCells() {
		return cells;
	}

	public JLabel getCurrentPlayerDisplay() {
		return currentPlayerDisplay;
	}

	public JLabel getGameProgress() {
		return gameProgress;
	}
	
	
	
	

}

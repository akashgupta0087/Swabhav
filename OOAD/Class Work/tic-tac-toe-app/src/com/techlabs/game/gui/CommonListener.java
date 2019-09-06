package com.techlabs.game.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlabs.game.Result;

public class CommonListener implements ActionListener {

	public GameFrame frame;

	public CommonListener(GameFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int playerPosition = Integer.parseInt(e.getActionCommand());

		frame.getGame().play(playerPosition);
		frame.getGame().getAnalyzer().analyze();

		((JButton) e.getSource()).setText(frame.getGame().getCurrentPlayer().getMark().toString());

		if (frame.getGame().getAnalyzer().getResult() == Result.WIN) {
			frame.getGameProgress().setText("Winner: " + frame.getGame().getCurrentPlayer().getName());
			for(int i = 0; i < frame.getCells().length; i++) {
				frame.getCells()[i].setEnabled(false);
			}
		}

		if (frame.getGame().getAnalyzer().getResult() == Result.DRAW)
			frame.getGameProgress().setText("Draw");

		if(frame.getGame().getAnalyzer().getResult() == Result.PROGRESS) {
		frame.getGame().swapPlayers();
		frame.getCurrentPlayerDisplay().setText(frame.getGame().getCurrentPlayer().getName());
		}
		
	}

}

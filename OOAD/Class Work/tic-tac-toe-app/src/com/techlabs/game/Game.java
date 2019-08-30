package com.techlabs.game;

public class Game {
	private Board board;
	private Player player[];
	private ResultAnalyzer analyzer;
	private Player currentPlayer;

	public Game(Board board, Player[] player, ResultAnalyzer analyzer) {
		this.board = board;
		this.player = player;
		this.analyzer = analyzer;
		this.currentPlayer = player[0];
	}

	public Board getBoard() {
		return board;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public Player[] getPlayer() {
		return player;
	}

	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}

	public void play(int position) {
		board.addMark(position, currentPlayer);
	}

	public void setPlayer(Player[] player) {
		this.player = player;
	}

	public void swapPlayers() {
		if (this.currentPlayer == player[0])
			this.currentPlayer = player[1];
		else
			this.currentPlayer = player[0];
	}

}

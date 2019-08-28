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
	}

	public Board getBoard() {
		return board;
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
	
//	public void swapPlayers() {
//		if(current)
//	}
//	
	


}

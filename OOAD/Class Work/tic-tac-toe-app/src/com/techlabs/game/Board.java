package com.techlabs.game;

public class Board {
	private Cell board[];

	public Board(Cell[] board) {
		this.board = board;
	}
	
	public void addMark(int position, Player player) {
		board[position -1] = new Cell(player.getMark());
		
	}

	public Cell[]getBoard() {
		return board;
	}
	
	
	
	

}

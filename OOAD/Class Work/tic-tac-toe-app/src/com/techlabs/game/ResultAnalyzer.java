package com.techlabs.game;

public class ResultAnalyzer {
	private Result result;
	private Board board;
	private static int count = 0;
	public ResultAnalyzer(Board board) {
		this.board = board;
	}
	
	public Result analyze() {
		count++;
		// For row
		for(int i = 0; i < 7; i+=3) {
			if(board.getBoard()[i] == board.getBoard()[i+1] && board.getBoard()[i+1] == board.getBoard()[i+2])
			result = Result.WIN;	
		}
		
		// For column
		for(int i = 0; i < 3; i++) {
			if(board.getBoard()[i] == board.getBoard()[i+3] && board.getBoard()[i+3] == board.getBoard()[i+6])
				result = Result.WIN;
		}
		
		// For left diagonal
		for(int i = 0; i < 3; i+=2) {
			if(board.getBoard()[i] == board.getBoard()[i+4] && board.getBoard()[i+4] == board.getBoard()[i+8])
				result = Result.WIN;
		}
		
		for(int i = 0; i == 0; i++) {
			if(board.getBoard()[i] == board.getBoard()[i+4] && board.getBoard()[i+4] == board.getBoard()[i+8])
				result = Result.WIN;
		}
		
		for(int i = 2; i == 0; i++) {
			if(board.getBoard()[i] == board.getBoard()[i+2] && board.getBoard()[i+2] == board.getBoard()[i+4])
				result = Result.WIN;
		}
		
		if(count == 9)
			return Result.DRAW;
		
		return result = Result.PROGRESS;
	}

	public Result getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}	

}

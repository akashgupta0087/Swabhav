package com.techlabs.game;

public class ResultAnalyzer {
	private Result result = Result.PROGRESS;
	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public void analyze() {

		try {
			// For row
			for (int i = 0; i < 7; i += 3) {

				if ((board.getBoard()[i].getMark() == board.getBoard()[i + 1].getMark()
						&& board.getBoard()[i + 1].getMark() == board.getBoard()[i + 2].getMark()))
					result = Result.WIN;
			}
		} catch (NullPointerException ex) {
		}

		try {
			// For column
			for (int i = 0; i < 3; i++) {
				if ((board.getBoard()[i].getMark() == board.getBoard()[i + 3].getMark()
						&& board.getBoard()[i + 3].getMark() == board.getBoard()[i + 6].getMark()))
					result = Result.WIN;
			}
		} catch (NullPointerException ex) {
		}

		try {
			// For left diagonal
			for (int i = 0; i < 1; i++) {
				if ((board.getBoard()[i].getMark() == board.getBoard()[i + 4].getMark()
						&& board.getBoard()[i + 4].getMark() == board.getBoard()[i + 8].getMark()))
					result = Result.WIN;
			}
		} catch (NullPointerException ex) {
		}

		try {
			// For right diagonal
			for (int i = 2; i < 3; i++) {
				if ((board.getBoard()[i].getMark() == board.getBoard()[i + 2].getMark()
						&& board.getBoard()[i + 2].getMark() == board.getBoard()[i + 4].getMark()))
					result = Result.WIN;
			}
		} catch (NullPointerException ex) {
		}

		// For Draw
		int count = 0;
		for (int i = 0; i < board.getBoard().length; i++) {
			if (board.getBoard()[i] != null)
				count += 1;
		}

		if (count == board.getBoard().length)
			result = Result.DRAW;
	}

	public Result getResult() {
		return result;
	}

	public Board getBoard() {
		return board;
	}

}

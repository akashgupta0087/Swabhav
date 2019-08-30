package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyzer;

class ResultAnalyzerJUnit {
	Board board = new Board(new Cell[9]);
	ResultAnalyzer analyzer = new ResultAnalyzer(board);

	@Test
	void analyse_WillGiveTheCorrectResultForRow() {
		Player player = new Player("Sachin", Mark.CROSS);
		board.addMark(1, player);
		board.addMark(2, player);
		board.addMark(3, player);

		analyzer.analyze();
		assertEquals(Result.WIN, analyzer.getResult());
	}

	@Test
	void analyse_WillGiveTheCorrectResultForColumn() {
		Player player = new Player("Virat", Mark.CROSS);
		board.addMark(1, player);
		board.addMark(4, player);
		board.addMark(7, player);

		analyzer.analyze();
		assertEquals(Result.WIN, analyzer.getResult());

	}

	@Test
	void analyse_WillGiveTheCorrectResultForLeftDiagonal() {
		
		Player player = new Player("Dhoni", Mark.CROSS);
		board.addMark(1, player);
		board.addMark(5, player);
		board.addMark(9, player);

		analyzer.analyze();
		assertEquals(Result.WIN, analyzer.getResult());

	}

	@Test
	void analyse_WillGiveTheCorrectResultForRightDiagonal() {
		Player player = new Player("Dhoni", Mark.CROSS);
		board.addMark(3, player);
		board.addMark(5, player);
		board.addMark(7, player);

		analyzer.analyze();
		assertEquals(Result.WIN, analyzer.getResult());

	}
	
	@Test
	void analyse_WillGiveTheCorrectResultForDraw() {
		Player player1 = new Player("Dhoni", Mark.CROSS);
		Player player2 = new Player("Sachin", Mark.NOUGHT);
		board.addMark(2, player1);
		board.addMark(1, player2);
		board.addMark(5, player1);
		board.addMark(3, player2);
		board.addMark(6, player1);
		board.addMark(4, player2);
		board.addMark(7, player1);
		board.addMark(8, player2);
		board.addMark(9, player1);
		
		analyzer.analyze();
		assertEquals(Result.DRAW, analyzer.getResult());

	} 

}

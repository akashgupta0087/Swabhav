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
	ResultAnalyzer analyze = new ResultAnalyzer(board);
	
	@Test
	void analyse_WillGiveTheCorrectResult() {
		Player player =  new Player("Sachin", Mark.CROSS);
		board.addMark(1, player);
		board.addMark(2, player);
		board.addMark(3, player);
		
		analyze.analyze();
		
		assertEquals(Result.WIN, analyze.getResult());
		
		
	}

}

package com.techlabs.game.junit;

import com.techlabs.game.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Mark;
import com.techlabs.game.Player;

class BoardJUnit {
	
	Board board = new Board(new Cell[3]);

	@Test
	void addMark_WillAddTheMarkInTheCell() {
		board.addMark(1,new Player("Sachin",Mark.CROSS));
		assertEquals(Mark.CROSS, board.getBoard()[0].getMark());
		
		board.addMark(2,new Player("Sachin",Mark.NOUGHT));
		assertEquals(Mark.NOUGHT, board.getBoard()[1].getMark());
		
	}
	
	@Test
	void IfAddMarkIsNotCalledThenCellShouldBeNull() {
		try {
		   board.getBoard()[2].getMark();
		}
		catch(NullPointerException ne) {
			
		}
	}

}

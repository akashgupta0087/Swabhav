package com.techlabs.game.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.game.Cell;
import com.techlabs.game.Mark;

class CellUnitTest {
	
	Cell cell1 = new Cell(Mark.CROSS);
	Cell cell2 = new Cell(Mark.NOUGHT);

	@Test
	void constructorWillSetTheMark() {
		assertEquals(Mark.CROSS, cell1.getMark());
		assertEquals(Mark.NOUGHT, cell2.getMark());
	}

}

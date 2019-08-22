package com.techlabs.calculator.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.*;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.techlabs.calculator.Calculator;
import com.techlabs.customexceptions.NegativeNumberException;
import com.techlabs.customexceptions.OddNumberException;

class CalculatorJUnitTest {

	Calculator cal = new Calculator();
	
	@Test
	void testAdd_addTwoPositiveNumbers() {
		assertEquals(30, cal.add(10, 20));
		assertEquals(120, cal.add(50, 70));
		assertEquals(22,cal.add(1, 21));
	}
	
	@Test
	void testAdd_addingNegativeNumbersWillThrowException() {
		try {
		assertEquals(-30, cal.add(-10, -20));
		assertEquals(-6, cal.add(-2, -4));
		assertEquals(-20,cal.add(-1, -9));
		}
		catch(NegativeNumberException negative) {	
		}
	}
	
	@Test
	void testCube_cubeEvenNumbers(){
		assertEquals(8,cal.cube(2));
		assertEquals(64,cal.cube(4));
	}
	
	@Test
	void testCube_oddNumbersWillThrowException() {
		try {
		assertEquals(27, cal.cube(3));
		}
		catch(OddNumberException odd) {
		}
	}

}

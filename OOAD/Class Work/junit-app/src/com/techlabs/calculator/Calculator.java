package com.techlabs.calculator;

import com.techlabs.customexceptions.NegativeNumberException;
import com.techlabs.customexceptions.OddNumberException;

public class Calculator {
	
	public int add(int firstNumber, int secondNumber) {
		if(firstNumber >= 0 && secondNumber >= 0)
		return firstNumber + secondNumber;
		
		throw new NegativeNumberException("Cannot add negative numbers");
	}
	
	public int cube(int number) {
		if(number % 2 == 0)
			return number * number * number;
		
		throw new OddNumberException("Cannot cube odd numbers");
	}

}

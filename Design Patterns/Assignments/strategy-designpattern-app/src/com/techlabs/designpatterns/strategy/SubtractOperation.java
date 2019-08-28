package com.techlabs.designpatterns.strategy;

public class SubtractOperation implements MathOperations{

	@Override
	public double doOperation(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

}

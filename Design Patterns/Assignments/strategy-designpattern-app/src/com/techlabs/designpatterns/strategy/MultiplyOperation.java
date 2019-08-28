package com.techlabs.designpatterns.strategy;

public class MultiplyOperation implements MathOperations{

	@Override
	public double doOperation(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

}

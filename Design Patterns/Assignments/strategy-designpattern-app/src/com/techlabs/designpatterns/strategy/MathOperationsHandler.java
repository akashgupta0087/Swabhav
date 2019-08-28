package com.techlabs.designpatterns.strategy;

public class MathOperationsHandler {
	private MathOperations operations;

	public MathOperationsHandler(MathOperations operations) {
		this.operations = operations;
	}
	
	public double executeOperation(double firstNumber, double secondNumber) {
		return operations.doOperation(firstNumber, secondNumber);
	}
	
	

}

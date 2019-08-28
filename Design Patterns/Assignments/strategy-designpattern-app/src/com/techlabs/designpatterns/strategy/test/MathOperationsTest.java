package com.techlabs.designpatterns.strategy.test;

import com.techlabs.designpatterns.strategy.*;

public class MathOperationsTest {
	public static void main(String[] args) {

		MathOperationsHandler additionHandler = new MathOperationsHandler(new AddOperation());
		System.out.println("Addition: " + additionHandler.executeOperation(10, 20));

		MathOperationsHandler subtractionHandler = new MathOperationsHandler(new SubtractOperation());
		System.out.println("Subtraction: " + subtractionHandler.executeOperation(10, 20));

		MathOperationsHandler multiplicationHandler = new MathOperationsHandler(new MultiplyOperation());
		System.out.println("Multiplication: " + multiplicationHandler.executeOperation(10, 20));

		MathOperationsHandler divisionHandler = new MathOperationsHandler(new DivideOperation());
		System.out.println("Division: " + divisionHandler.executeOperation(10, 20));

	}

}

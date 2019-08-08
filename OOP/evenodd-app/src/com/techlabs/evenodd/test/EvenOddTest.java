package com.techlabs.evenodd.test;

import java.util.ArrayList;

import com.techlabs.evenodd.EvenOdd;

public class EvenOddTest {
	public static void main(String[] args) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		EvenOdd number = new EvenOdd();

		evenNumbers = number.getEvenNumbers(100);
		oddNumbers = number.getOddNumbers(100);

		System.out.println("Even Numbers :");
		display(evenNumbers);

		System.out.println("\nOdd Numbers :");
		display(oddNumbers);

	}

	private static void display(ArrayList<Integer> numbers) {
		for (int number : numbers) {
			System.out.print(number);
			System.out.print(" ");
		}
	}
}
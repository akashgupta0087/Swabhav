package com.swabhav.numberguess;

import java.util.Scanner;

public class ConsoleGameController {
	public void start() {
		NumberGuess n = new NumberGuess();
		int result = 1;

		while (result != 0) {
			int userGuess = input();
			result = n.guessNumber(userGuess);
			System.out.println(output(result));
		}
	}

	public int input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess the number: ");
		int userGuess = sc.nextInt();
		return userGuess;
	}

	public String output(int result) {
		if (result == 1) {
			return "Too high";
		}
		if (result == -1) {
			return "Too low";
		}
		return "Congratulations!! You have guessed the correct number";

	}

}

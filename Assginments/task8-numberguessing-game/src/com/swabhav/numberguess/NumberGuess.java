package com.swabhav.numberguess;

public class NumberGuess {

	private final int number;

	public NumberGuess() {
		number = (int) (Math.random() * 101) + 1;
	}

	public int guessNumber(int userGuess) {
		if (userGuess < number) {
			return -1;
		}

		if (userGuess > number) {
			return 1;
		}

		return 0;
	}

}

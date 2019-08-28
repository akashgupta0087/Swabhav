package com.techlabs.designpatterns.templatemethod.test;

import com.techlabs.designpatterns.templatemethod.Cricket;
import com.techlabs.designpatterns.templatemethod.Football;
import com.techlabs.designpatterns.templatemethod.Game;

public class GameTest {
	public static void main(String[] args) {

		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}

}

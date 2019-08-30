package com.techlabs.game.test;

import java.util.Scanner;

import com.techlabs.game.Board;
import com.techlabs.game.Cell;
import com.techlabs.game.Game;
import com.techlabs.game.Mark;
import com.techlabs.game.Player;
import com.techlabs.game.Result;
import com.techlabs.game.ResultAnalyzer;

public class GameTester {
	public static void main(String[] args) {
		
		int playerPosition = 0;
		Player[] players = new Player[2];
		players[0] = new Player("Sachin", Mark.CROSS);
		players[1] = new Player("Kholi", Mark.NOUGHT);
		
		Board board = new Board(new Cell[9]);

		Game game = new Game(board, players, new ResultAnalyzer(board));

		Scanner sc = new Scanner(System.in);

		while (game.getAnalyzer().getResult() != Result.WIN &&  game.getAnalyzer().getResult() != Result.DRAW) {
			System.out.print(game.getCurrentPlayer().getName() + " enter a position: ");
			playerPosition = sc.nextInt();
			game.play(playerPosition);
			game.getAnalyzer().analyze();
			if (game.getAnalyzer().getResult()!= Result.WIN && game.getAnalyzer().getResult() != Result.DRAW)
				game.swapPlayers();
		}
		if (game.getAnalyzer().getResult() == Result.WIN)
			System.out.println(game.getCurrentPlayer().getName() + " is the winner!!");

		if (game.getAnalyzer().getResult() == Result.DRAW)
			System.out.println("The game has been drawn");

		System.out.println("Game Over");
	}

}

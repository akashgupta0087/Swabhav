package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTestCount {
	public static void main(String[] args) {
		Player p1 = new Player(1, "Sachin", 45);
		System.out.println("Player count : " + p1.getPlayerCount());

		Player p2 = new Player(2, "Dhoni", 35);
		System.out.println("Player count : " + p1.getPlayerCount());

		Player p3 = new Player(3, "Kholi", 30);
		System.out.println("Player count : " + p1.getPlayerCount());

		Player p4 = new Player(4, "Panth");
		System.out.println("Player count : " + p1.getPlayerCount());
		
		System.out.println(Player.headCount());
	}
}

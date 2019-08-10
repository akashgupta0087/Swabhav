package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String[] args) {

		Player p1 = new Player(101, "Sachin", 45);
		Player p2 = new Player(102, "Virat");

		Player elder = p1.whoIsElder(p2);

		display(p1);
		display(p2);

		System.out.println("Elder Player is :");
		display(elder);
	}

	private static void display(Player p) {
		System.out.println("ID = " + p.getId() + ", Name = " + p.getName() + ", Age = " + p.getAge());
	}
}
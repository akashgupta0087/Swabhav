package com.techlabs.player;

public class Player {
	private final String name;
	private final int age;
	private final int id;
	private static int playerCount;
	
	static{
		playerCount = 0;
		System.out.println("Inside static block");
	}

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		playerCount += 1;
		System.out.println("Inside Constructor");
	}

	public Player(int id, String name) {
		this(id, name, 18);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}

	public int getPlayerCount() {
		return playerCount;
	}
	
	public static int headCount() {
		return playerCount;
	}
	
	public Player whoIsElder(Player p) {
		if (this.age > p.age) {
			return this;
		}
		return p;
	}
}
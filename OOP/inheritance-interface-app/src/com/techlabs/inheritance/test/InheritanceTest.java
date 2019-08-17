package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Man;
import com.techlabs.interfaces.IEmotion;
import com.techlabs.interfaces.IManner;

public class InheritanceTest {
	public static void main(String[] args) {
		atTheParty(new Man());
		atTheParty(new Boy());
		
		atTheMovies(new Boy());
//		atTheMovies(new Man());
		
	}
	
	public static void atTheMovies(IEmotion obj) {
		System.out.println("At the movies");
		obj.cry();
		obj.laugh();
	}
	
	public static void  atTheParty(IManner obj) {
		obj.wish();
		obj.depart();
	}
	
}



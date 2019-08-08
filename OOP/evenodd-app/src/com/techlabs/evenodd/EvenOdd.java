package com.techlabs.evenodd;

import java.util.ArrayList;

public class EvenOdd {
	public ArrayList<Integer> getEvenNumbers(int range) {
		ArrayList<Integer> even = new ArrayList<Integer>();
		for(int i = 0; i <= range; i++) {
			if(i % 2 == 0) {
				even.add(i);
			}
		} 
		return even;
	}
	
	public ArrayList<Integer> getOddNumbers(int range){
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i = 0; i <= range; i++) {
			if(i % 2 != 0) {
				odd.add(i);
			}
		}
		return odd;
	}
}
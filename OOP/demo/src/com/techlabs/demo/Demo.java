package com.techlabs.demo;

import java.util.ArrayList;

public class Demo {
	public void EvenOdd() {
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		
		System.out.print("Even Numbers");
		for(int evenNumber:even) {
			System.out.print(evenNumber);
		}
		
		System.out.print("\n Odd Numbers");
		for(int oddNumber:odd) {
			System.out.print(oddNumber);
		}
	}

}

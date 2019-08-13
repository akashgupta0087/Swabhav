package com.swabhav.boxingunboxing;

import java.util.*;

public class BoxingUnboxing {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add("Hello");
		list.add("World");
		
		int i = (int) list.get(0);
		list.add(0,i+1);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	}

}

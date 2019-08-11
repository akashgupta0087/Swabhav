package com.swabhav.boxingunboxing;

public class BoxingUnboxing {
	public static void main(String[] args) {
		
		//Boxing
		int primivitive1 = 50;
		System.out.println("Boxing: ");
		System.out.println(Integer.valueOf(primivitive1));
		
//		int p = Integer.valueOf(primivitive1);
//		System.out.println(p);
		
		//Unboxing
		Integer obj = new Integer(100);
		int primitive2 = obj.intValue();
		System.out.println("Unboxing: ");
		System.out.println(primitive2);
	}

}

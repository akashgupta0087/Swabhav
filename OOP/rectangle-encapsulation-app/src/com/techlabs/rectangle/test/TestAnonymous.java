package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class TestAnonymous {
	public static void main(String[] args) {
		
		System.out.println(new Rectangle().calcArea());
		displayRectangle(new Rectangle(),"small");
	}
	
	private static void displayRectangle(Rectangle rectangle, String size) {
		System.out.println("The dimensions of " + size + " rectangle are : \n" + "Width = " + rectangle.getWidth() + "\n"
				+ "Height = " + rectangle.getHeight() + "\n" + "Area = " + rectangle.calcArea());
		
		System.out.println("Hash code = " + rectangle.hashCode());
	}

}

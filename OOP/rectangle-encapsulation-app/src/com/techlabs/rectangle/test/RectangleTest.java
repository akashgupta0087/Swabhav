package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.setWidth(-1);
		smallRectangle.setHeight(500);

		bigRectangle.setWidth(101);
		bigRectangle.setHeight(-500);

		displayRectangle(smallRectangle,"small");
		displayRectangle(bigRectangle,"big");
		
		Rectangle temp = smallRectangle;
		temp = null;
		System.out.println("Small rectangle height = " + smallRectangle.getHeight());
		System.out.println("Temp height = " + temp.getHeight());
	}

	private static void displayRectangle(Rectangle rectangle, String size) {
		System.out.println("The dimensions of " + size + " rectangle are : \n" + "Width = " + rectangle.getWidth() + "\n"
				+ "Height = " + rectangle.getHeight() + "\n" + "Area = " + rectangle.calcArea());
		
		System.out.println("Hash code = " + rectangle.hashCode());
	}

}
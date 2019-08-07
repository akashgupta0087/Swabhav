package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.width = 20;
		smallRectangle.height = 9;

		bigRectangle.width = 100;
		bigRectangle.height = 90;

		int smallRectangleArea = smallRectangle.calcArea();
		int bigReactangleArea = bigRectangle.calcArea();

		System.out.println("The dimensions of small rectangle are : \n" + "Width = " + smallRectangle.width + "\n"
				+ "Height = " + smallRectangle.height + "\n" + "Area = " + smallRectangleArea);

		System.out.println("The dimensions of big rectangle are : \n" + "Width = " + bigRectangle.width + "\n"
				+ "Height = " + bigRectangle.height + "\n" + "Area = " + bigReactangleArea);

	}

}
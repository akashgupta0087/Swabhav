package com.techlabs.rectangle.test;

import com.techlabs.rectangle.Rectangle;

public class RectangleTestArray {
	public static void main(String[] args) {
		
		Rectangle[] rectangles = new Rectangle[5];

		rectangles[0] = new Rectangle(10, 20);
		rectangles[1] = new Rectangle(5, 10);
		rectangles[2] = new Rectangle(20, 50);
		rectangles[3] = new Rectangle(10, 60);
		rectangles[4] = new Rectangle(15, 75);

		displayRectangle(rectangles[0]);
		displayRectangle(rectangles[1]);
		displayRectangle(rectangles[2]);
		displayRectangle(rectangles[3]);
		displayRectangle(rectangles[4]);

		int sum = rectangles[0].calcArea() + rectangles[1].calcArea() + rectangles[2].calcArea()
				+ rectangles[3].calcArea() + rectangles[4].calcArea();

		System.out.println("The sum of area of all the rectangles is = " + sum);
	}

	private static void displayRectangle(Rectangle rectangle) {
		System.out.println("The dimensions of  rectangle are : \n" + "Width = " + rectangle.width + "\n" + "Height = "
				+ rectangle.width + "\n" + "Area = " + rectangle.calcArea());

		System.out.println("Hash code = " + rectangle.hashCode());
		System.out.println(" ");
	}
}
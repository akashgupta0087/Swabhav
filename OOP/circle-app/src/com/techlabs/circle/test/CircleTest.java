package com.techlabs.circle.test;

import com.techlabs.circle.Circle;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle = new Circle(5f, "");

		System.out.println("Radius = " + circle.getRadius() + "\nBorder Color = " + circle.getBorderColor()
				+ "\nArea = " + circle.calcArea());
	}
}

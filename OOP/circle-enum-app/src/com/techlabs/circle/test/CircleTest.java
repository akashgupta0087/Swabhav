package com.techlabs.circle.test;

import com.techlabs.circle.BorderStyle;
import com.techlabs.circle.Circle;
import com.techlabs.circle.ColorCategory;

public class CircleTest {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(10,ColorCategory.RED);
		Circle circle2 = new Circle(5,ColorCategory.GREEN,BorderStyle.DOUBLE);
		
		display(circle1);
		display(circle2);
	}
	
	private static void display(Circle circle) {
		System.out.println("Radius = " + circle.getRadius() + "\nBorder Color = " + circle.getBorderColor()
		 + "\nBorder Style = " + circle.getBorderStyle() + "\nArea = " + circle.calcArea());
		
		System.out.println(" ");
	}

}
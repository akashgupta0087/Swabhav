package com.techlabs.circle;

import com.techlabs.circle.ColorCategory;

public class Circle {
	private final static float pi = 3.142f;

	private final float radius;
	private final ColorCategory borderColor;
	private final BorderStyle style;

	public Circle(float paramRadius, ColorCategory paramBorderColor) {
		style =  BorderStyle.SINGLE;
		radius = paramRadius;
		borderColor = paramBorderColor;
	}

	public Circle(float paramRadius, ColorCategory paramBorderColor, BorderStyle paramStyle) {
		radius = paramRadius;
		borderColor = paramBorderColor;
		style = paramStyle;
	}

	public float getRadius() {
		return radius;
	}

	public ColorCategory getBorderColor() {
		return borderColor;
	}

	public BorderStyle getBorderStyle() {
		return style;
	}

	public float calcArea() {
		return pi * radius * radius;
	}
}
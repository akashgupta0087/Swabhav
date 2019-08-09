package com.techlabs.circle;

public class Circle {
	private float radius;
	private String borderColor;
	private final float pi = 3.142f;
	private final String colorRed = "RED";
	private final String colorBlue = "BLUE";
	private final String colorGreen = "GREEN";

	public Circle(float paramRadius, String paramBorderColor) {
		radius = paramRadius;
		borderColor = validateColor(paramBorderColor);
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float paramRadius) {
		radius = paramRadius;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String paramBorderColor) {
		borderColor = validateColor(paramBorderColor);
	}

	public float calcArea() {
		return pi * radius * radius;
	}

	private String validateColor(String paramBorderColor) {
		if (colorRed.equalsIgnoreCase(paramBorderColor) || colorGreen.equalsIgnoreCase(paramBorderColor)
				|| colorBlue.equalsIgnoreCase(paramBorderColor)) {
			return paramBorderColor;
		}
		return colorRed;
	}
}

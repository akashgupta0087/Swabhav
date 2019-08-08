package com.swabhav.reflection;

public class Rectangle {
	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int rectWidth) {
		width = validateDimensions(rectWidth);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int rectHeight) {
		height = validateDimensions(rectHeight);

	}

	public int calcArea() {
		return width * height;
	}

	private int validateDimensions(int value) {
		int result = 0;
		if (value > 100) {
			result = 100;
		} else if (value < 1) {
			result = 1;
		} else {
			result = value;
		}
		return result;
	}
}
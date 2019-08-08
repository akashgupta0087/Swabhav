package com.techlabs.rectangle;

public class Rectangle {
	public int width;
	public int height;

	public Rectangle(int rectWidth, int rectHeight){
		width = rectWidth;
		height = rectHeight;
	}
	public int calcArea() {
		return width * height;
	}
}
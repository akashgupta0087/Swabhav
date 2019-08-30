package com.techlabs.designpatterns.test;

import com.techlabs.designpatterns.facade.ShapeMaker;

public class Test {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangle();
	      shapeMaker.drawSquare();
	}

}

package com.techlabs.lsp.solution.test;

import com.techlabs.lsp.solution.*;

public class LSPTest {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10,20);
		
		Polygon square = new Square(10);
		
		displayArea(rectangle);
		
		displayArea(square);
		
		shouldNotChangeHeight_IfWidthChanges(rectangle);
	}
	
	
	private static void displayArea(Polygon poly) {
		System.out.println("Area: " + poly.calcArea());
	}
	
	private static void shouldNotChangeHeight_IfWidthChanges(Rectangle rect) {
		int beforeHeight = rect.getHeight();
		
		rect.setWidth(rect.getWidth() + 1);
		
		int afterHeight = rect.getHeight();
		
		System.out.println(beforeHeight);
		
		System.out.println(afterHeight);
				
}

}

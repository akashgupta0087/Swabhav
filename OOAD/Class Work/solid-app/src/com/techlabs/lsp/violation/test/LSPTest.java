package com.techlabs.lsp.violation.test;

import com.techlabs.lsp.violation.Rectangle;
import com.techlabs.lsp.violation.Square;

public class LSPTest {
	public static void main(String[] args) {
		
		shouldNotChangeHeight_IfWidthChanges(new Square(10));
	}
	
	private static void shouldNotChangeHeight_IfWidthChanges(Rectangle rect) {
		int beforeHeight = rect.getHeight();
		
		rect.setWidth(20);
		
		int afterHeight = rect.getHeight();
		
		System.out.println(beforeHeight);
		
		System.out.println(afterHeight);
				
}

}

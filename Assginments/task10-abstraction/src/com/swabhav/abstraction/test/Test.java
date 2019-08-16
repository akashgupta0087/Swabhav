package com.swabhav.abstraction.test;

import com.swabhav.abstraction.*;

public class Test {
	public static void main(String[] args) {
		Bike b1 = new Honda();
		b1.run();
		b1.changeGear();
		
		Shape s1 = new Rectangle();
		s1.big();
		
		Rectangle r1 = new Rectangle();
		r1.big();
		r1.draw();
		
	}

}

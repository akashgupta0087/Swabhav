package com.techlabs.lsp.solution;

public class Square implements Polygon{
	private int side;
	
	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public double calcArea() {
		return side * side;
	}
}

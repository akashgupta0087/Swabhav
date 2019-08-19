package com.swabhav.arraylist.crud.test;

import com.swabhav.arrylist.crud.ArrayListCrud;

public class Test {
	public static void main(String[] args) {
		ArrayListCrud al = new ArrayListCrud();
		
		al.create("Milk");
		al.create("Bread");
		al.create("Butter");
		al.create("Eggs");
		al.create("Tea");
		al.create("Chocolate");
		
		
		System.out.println(al.read());
		
		al.update(4, "Coffee");
		
		al.delete(5);
		
		System.out.println(al.read());
		
	}

}

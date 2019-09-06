package com.techlabs.composite.test;

import com.techlabs.composite.File;
import com.techlabs.composite.Folder;

public class CompositeTest {
	public static void main(String[] args) {
		
		Folder root = new Folder("Movies");
		
		root.addItem(new File("abc",2,".avi"));
		root.addItem(new File("pqr",3,".avi"));
		
		Folder comedy = new Folder("Comedy");
		
		root.addItem(comedy);
		comedy.addItem(new File("lmno",4,".avi"));
		comedy.addItem(new File("lmnopqr",5,".avi"));
		
		root.display();
		
	}

}

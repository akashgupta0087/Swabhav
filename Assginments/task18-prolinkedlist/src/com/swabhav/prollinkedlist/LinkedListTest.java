package com.swabhav.prollinkedlist;

import com.swabhav.prolinkedlist.test.*;

public class LinkedListTest {
	public static void main(String[] args) {
		ProLinkedList list = new ProLinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println("The linked list size is: " + list.getSize());
		list.display();
		
		list.remove(30);
		
		System.out.println("\nAfter deletion of 30 from the list the size is: " + list.getSize());
		list.display();
		
		
		
		
		
	}

}

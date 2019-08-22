package com.swabhav.prolinkedlist.test;

public class ProLinkedList {
	Node node;
	Node head = null;
	int size = 1;
	
	public void add(int data) {
	    node= new Node(data);
		Node t = null;
		if(head != null) {
			t = head;
			while(t.getNext()!=null) {
				t = t.getNext();
			}
			t.setNext(node);
			size++;
		}
		if(head == null) {
			head = node;
		}	
	}
	
	
	public void display()
	{
		node = head;
		while(node != null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
	public void remove(int data) {
		Node t = head;
		Node prev = null;
		while(!(t.getData() == data)) {
			prev = t;
			t = t.getNext();
		}
		
		prev.setNext(t.getNext());
		size--;
	}


	public int getSize() {
		return size;
	}
	
	

}

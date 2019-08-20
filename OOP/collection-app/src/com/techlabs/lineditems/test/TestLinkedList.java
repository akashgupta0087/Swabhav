package com.techlabs.lineditems.test;

import com.techlabs.node.Node;

public class TestLinkedList {
	public static void main(String[] args) {
		
		Node<Integer> node1 = new Node(10);
		Node<Integer> node2 = new Node(20);
		node1.next = node2;
		Node<Integer> node3 = new Node(30);
		node2.next = node3;
		
		Node<String> s1 = new Node("Hello");
		Node<String> s2 = new Node("World!!");
		s1.next = s2;
		
		display(node1);
		display(s1);
		
	}
	
	public static <T> void display(Node<T> nodeValue) {
		while(nodeValue != null) {
			System.out.println(nodeValue.getData());
			nodeValue = nodeValue.next;
		}
	}

}

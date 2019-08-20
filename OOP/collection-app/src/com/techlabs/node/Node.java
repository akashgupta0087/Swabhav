package com.techlabs.node;

import com.techlabs.lineditems.LinedItem;

public class Node <T> {
	private T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
	
}


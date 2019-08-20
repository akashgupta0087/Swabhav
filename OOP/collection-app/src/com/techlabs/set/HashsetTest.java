package com.techlabs.set;

import java.util.HashSet;

import com.techlabs.lineditems.LinedItem;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<LinedItem> itemList = new HashSet<LinedItem>();
		
		itemList.add(new LinedItem(1,"Books", 20, 5));
		itemList.add(new LinedItem(1,"Books", 20, 5));
		itemList.add(new LinedItem(1,"Books", 20, 5));
		
		System.out.println(itemList.size());
		
	}

}

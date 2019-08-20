package com.techlabs.set;

import java.util.TreeSet;

import com.techlabs.lineditems.LinedItem;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<LinedItem> itemList = new TreeSet<LinedItem>();
		
		itemList.add(new LinedItem(1,"Books",20,5));
		//itemList.add(new LinedItem(1,"Books",20,5));
		//itemList.add(new LinedItem(1,"Books",20,5));
		
		System.out.println(itemList.size());
		
	}

}

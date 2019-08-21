package com.techlabs.set;

import java.util.*;

import com.techlabs.lineditems.LinedItem;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<LinedItem> itemList = new TreeSet<LinedItem>(new ProductNameComparator());
		
		itemList.add(new LinedItem(3,"Books",20,5));
		itemList.add(new LinedItem(1,"Pencil",5,10));
		itemList.add(new LinedItem(2,"Pen",10,5));
		
		//System.out.println(itemList.size());
		
		display(itemList);
		
		//Collections.sort(itemList, new ProductNameComparator());
		
	}
	
	public static void display(TreeSet<LinedItem> itemList) {
		for(LinedItem item : itemList) {
			System.out.println(item.getId() + " " + item.getProductName() + " " + item.getCost());
		}
	}

}

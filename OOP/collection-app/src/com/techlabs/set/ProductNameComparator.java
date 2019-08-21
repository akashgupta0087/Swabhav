package com.techlabs.set;

import java.util.Comparator;

import com.techlabs.lineditems.LinedItem;

public class ProductNameComparator implements Comparator<LinedItem>{

	@Override
	public int compare(LinedItem item1, LinedItem item2) {
		return item1.getProductName().compareTo(item2.getProductName());
	}


}

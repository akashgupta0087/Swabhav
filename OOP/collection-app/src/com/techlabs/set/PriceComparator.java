package com.techlabs.set;

import java.util.*;

import com.techlabs.lineditems.LinedItem;

public class PriceComparator implements Comparator<LinedItem>{

	@Override
	public int compare(LinedItem item1, LinedItem item2) {
		if(item1.getCost() > item2.getCost())
			return 1;
		if(item1.getCost() < item2.getCost())
			return -1;
		return 0;
	}
	
	
	

}

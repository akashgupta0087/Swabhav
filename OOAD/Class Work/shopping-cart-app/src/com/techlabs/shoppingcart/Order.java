package com.techlabs.shoppingcart;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private String id;
	private List<LineItem> items = new ArrayList<LineItem>();
	private final Date date;

	public Order(String id, Date date) {
		this.id = id;
		this.date = date;
	}

	public void addLineItem(LineItem lineItem) {
		if (items.size() == 0) {
			items.add(lineItem);
		} else {
			if (!isContains(lineItem))
				items.add(lineItem);
		}
	}

	public void removeLineItem(String lineItemId) {
		for (LineItem item : items) {
			if (item.getId().equals(lineItemId)) {
				items.remove(item);
				break;
			}
		}
	}

	public int count() {
		return items.size();
	}

	public double checkOutPrice() {
		double totalOrderCost = 0.0;
		for (LineItem item : items) {
			totalOrderCost += item.itemCost();
		}
		return totalOrderCost;
	}

	public boolean isContains(LineItem lineItem) {
		for (LineItem item : items) {
			if (item.getProduct().getId().equals(lineItem.getProduct().getId())) {
				item.setQuantity(item.getQuantity() + lineItem.getQuantity());
				return true;
			}
		}
		return false;

	}

	public String getId() {
		return id;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public Date getDate() {
		return date;
	}

}

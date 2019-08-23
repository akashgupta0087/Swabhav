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

	public void addLineItem(LineItem item) {
		boolean isItemExist = true;
		if (items.size() == 0) {
			items.add(item);
		} else {
			for (LineItem listItem : items) {
				if (listItem.getProduct().getId().equals(item.getProduct().getId())) {
					listItem.setQuantity(listItem.getQuantity() + item.getQuantity());
					isItemExist = false;
					break;
				}
			}
			if (isItemExist) {
				items.add(item);
			}

		}
	}

	public void removeLineItem(String lineItemId) {
		for (LineItem item : items) {
			if (item.getId().equals(lineItemId))
				items.remove(item);
			break;
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

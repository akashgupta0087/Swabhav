package com.techlabs.basic;

public class PassByValueTest {
	public static void main(String[] args) {
		int orders = 100;
		int[] manyOrders = { 100, 200, 300, 400, 500 };

		changeOrdersToZero(orders);
		System.out.println("Orders = " + orders);

		System.out.println("Many Orders:");
		changeManyOrdersToZero(manyOrders);
		for (int order : manyOrders) {
			System.out.println(order);
		}
		System.out.println(orders);
		System.out.println(manyOrders);
	}

	private static void changeOrdersToZero(int paramOrders) {
		paramOrders = 0;
	}

	private static void changeManyOrdersToZero(int[] paramManyOrders) {
		for (int i = 0; i < paramManyOrders.length; i++) {
			paramManyOrders[i] = 0;
		}
	}
}
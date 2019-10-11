package com.techlabs.transaction.test;

import java.util.Scanner;

import com.techlabs.transaction.TransactionController;


public class TransactionTest {
	public static void main(String[] args) {
		TransactionController controller = new TransactionController();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the amount that you want to give to the merchant: ");
		
		int amount = sc.nextInt();
		
		controller.transfer(amount);
	}
}

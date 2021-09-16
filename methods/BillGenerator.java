package com.xworkz.methods;

public class BillGenerator {

	public static int calculateBillAmount(int price, int quantity) {
		int totalBillAmount = price * quantity;
		return totalBillAmount;
	}

	public static void main(String[] args) {

		int price = 500;
		int quantity = 5;
		int totalAmount;
		totalAmount = BillGenerator.calculateBillAmount(price, quantity);

		System.out.println(totalAmount);
	}

}

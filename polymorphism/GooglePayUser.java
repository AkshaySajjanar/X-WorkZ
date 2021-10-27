package com.xworkz.polymorphism;

public class GooglePayUser {

	public static void main(String[] args) {

		GooglePay googlePay = new GooglePay();
		googlePay.billPayment("Ab45656", 450.8);
		googlePay.billPayment("Vi", 9742872820L, 598.00);
	}

}

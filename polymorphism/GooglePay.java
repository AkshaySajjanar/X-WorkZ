package com.xworkz.polymorphism;

public class GooglePay {

	public void billPayment(String waterId, double amount) {
		System.out.println("Bill payed to " + waterId + " successfully");
	}

	public void billPayment(String companyName, String billId, double amount) {
		System.out.println("Bill payed to " + billId + " successfully");
	}

	public void billPayment(String simName, long phoneNumber, double amount) {
		System.out.println("amount paid to " + phoneNumber + " successfully");

	}

	public void billPayment(String cardname, double amount, long cardNumber) {
		System.out.println("Card bill payed successfully to " + cardNumber);
	}

}
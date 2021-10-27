package com.xworkz.polymorphism;

public class PhonePe {

	public void recharge(String dishName, String subscriberId, double amount) {
		System.out.println("amount paid for " + subscriberId + " successfully");
	}

	public void recharge(long phoneNumber, String simName, int amount) {
		System.out.println("recharge for " + phoneNumber + " done successfully");
	}
}

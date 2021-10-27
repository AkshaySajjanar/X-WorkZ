package com.xworkz.polymorphism;

public class PhonePeUser {

	public static void main(String[] args) {

		PhonePe phonePe = new PhonePe();
		phonePe.recharge(9742872820L, "Airtel", 598);
		phonePe.recharge("TataSky", "589624562", 799);
	}

}

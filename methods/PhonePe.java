package com.xworkz.methods;

public class PhonePe {

	public static String wallet(int money) {
		return money + " added to wallet successfully.";
	}

	public static void checkBalance(int upiPin) {
		int pin = 123456;
		if (upiPin == pin) {
			System.out.println("Your Bank Balance is 10,000/-");
		} else {
			System.out.println("Invalid UPI");
			System.out.println("Please enter Correct UPI");
		}
		System.out.println();
	}

	public static void mobileRecharge(long mobileNumber, String carrier, int plan, int upiPin) {
		System.out.println("Mobile recharge Initiated.");
		String mobileCarrier[] = { "Airtel", "Jio", "Vi", "Reliance" };
		int rechargePlan[] = { 99, 199, 299, 399 };
		for (int i = 0; i < mobileCarrier.length; i++) {
			if (carrier == mobileCarrier[i]) {
				System.out.println("Please select a Plan for " + mobileCarrier[i]);
			}
		}

		for (int j = 0; j < rechargePlan.length; j++) {
			if (plan == rechargePlan[j]) {
				int pin = 123456;
				if (upiPin == pin) {
					System.out.println("Recharge for " + mobileNumber + " is done succesfull");
				} else {
					System.out.println("Invalid UPI");
					System.out.println("Please enter Correct UPI");
				}
			} else {
				System.out.println();
			}
		}

	}

	public static String moneyAccountTransfer(long account, int amount, int upiPin) {
		int pin = 123456;
		if (upiPin == pin) {
			System.out.println("Amount " + amount + " tranfer to Account No " + account + " is initiated");
		} else {
			System.out.println("Invalid UPI, Tranfer Failed");
			System.out.println("Please enter Correct UPI");
		}

		return "Amount " + amount + " tranfered to " + account + " succesfully";

	}

	public static String bookCylinder(String gasProvider, int consumerNumber) {
		return gasProvider + " cylinder booked for " + consumerNumber;
	}

	public static String autoPay(int amount) {
		return "AutoPay for amount " + amount + " is set.";
	}

	public static void main(String[] args) {

		String walletMoney = PhonePe.wallet(50000);
		System.out.println(walletMoney);
		System.out.println();

		PhonePe.checkBalance(123456);

		PhonePe.mobileRecharge(9742872820L, "Airtel", 199, 123456);

		String tranfer = PhonePe.moneyAccountTransfer(101186661547L, 100000, 123456);
		System.out.println(tranfer);
		System.out.println();

		String cylinder = PhonePe.bookCylinder("HP", 622052);
		System.out.println(cylinder);
		System.out.println();

		String auto = PhonePe.autoPay(150);
		System.out.println(auto);

	}

}

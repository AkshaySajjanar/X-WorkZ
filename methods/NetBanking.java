package com.xworkz.methods;

public class NetBanking {

	public static void balance(String userName, String password) {
		String customerID = "Akshay";
		String pwd = "12345678";

		if (customerID == userName && pwd == password) {
			System.out.println("Login successfull for Net Banking");
		} else {
			System.out.println("Invaid username and password");
		}
	}

	public static void main(String[] args) {

		NetBanking.balance("Akshay", "12345678");
	}

}

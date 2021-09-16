package com.xworkz.methods;

public class MobileRecharge {

	public static void login(String UN, String pwd) {
		String userName = "admin";
		String password = "Test";
		if (userName == UN && password == pwd) {
			System.out.println("Login successfull");
		} else {
			System.out.println("Login failed");
		}
	}

	public static void rechargeMobile(long mobileNumber) {

		System.out.println("Mobile racharge for the mobile number " + mobileNumber + " is done successfully");
	}

	public static void main(String[] args) {
		MobileRecharge.login("admin", "Test");
		MobileRecharge.rechargeMobile(9742872820L);
	}

}

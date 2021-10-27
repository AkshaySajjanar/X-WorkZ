package com.xworkz.arrayOfObject;

public class PhonePayV001 {
	String name;
	String version;
	int releaseYear;

	public PhonePayV001(String name, String version, int releaseYear) {
		this(name);
		System.out.println("Parameter constucotr");
		this.name = name;
		this.version = version;
		this.releaseYear = releaseYear;
	}

	public PhonePayV001() {
		System.out.println("NO parameter Constructor");
	}

	public PhonePayV001(String name) {
		this();
		System.out.println("One parameter constrctor");
	}

	public void login() {
		System.out.println("Login successfull");
	}

	public void logout() {
		System.out.println("Logout Successfull");
	}

	public void scanAndPay() {
		System.out.println("Payment successfull");
	}

	public void moneyTransfer() {
		System.out.println("Transfer successfull");
	}

	public void electricity() {
		System.out.println("Electricity Bill payment successfull");
	}

}

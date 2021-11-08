package com.xworkz.polymorphism;

public class Bank {

	String name;
	String branchCode;
	Address address;

	public Bank(String name, String branchCode, Address address) {
		this.address = address;
		this.branchCode = branchCode;
		this.name = name;
	}

	public void display() {
		System.out.println(address.area);
		System.out.println(address.pincode);
		System.out.println(address.stage);
	}

}

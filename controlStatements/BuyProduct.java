package com.xworkz.controlStatements;

public class BuyProduct {

	public static void main(String[] args) {

		short yearOfMaunufactured = 2017;
		short price = 3000;

		if (yearOfMaunufactured >= 2019 && price <= 3000) {
			System.out.println("continue shopping");
		} else {
			System.out.println("shopping denied");
		}
	}

}
package com.xworkz.controlStatements;

public class IphonePriceInformation {

	public static void main(String[] args) {
		String model = "Iphone11";

		if (model == "IphoneSE") {
			System.out.println("The price of the "+model+ " is Rs.34,500");

		} else if (model == "IphoneX") {
			System.out.println("The price of the "+model+ " is Rs.88,000");

		} else if (model == "Iphone11") {
			System.out.println("The price of the "+model+ " is Rs.50,900 for 64Gb and Rs.60,000 for 128Gb");

		} else if (model == "Iphone11ProMax") {
			System.out.println("The price of the "+model+ " is Rs.1,00,000");

		} else if (model == "Iphone12ProMax") {
			System.out.println("The price of the "+model+ " is Rs.1,18,000");

		} else {
			System.out.println(model+ " information is not available");

		}
	}

}

package com.xworkz.controlStatements;

public class GSTCalculator {

	public static void main(String[] args) {
		int price = 30000;
		double taxAmount;
		String typeofIndustry = "manufacture";
		if (typeofIndustry == "edu") {
			taxAmount = price * 0.05;
			System.out.println("Tax amount is " + taxAmount);
		} else if (typeofIndustry == "sales") {
			taxAmount = price * 0.08;
			System.out.println("Tax amount is " + taxAmount);
		} else if (typeofIndustry == "health") {
			taxAmount = price * 0.12;
			System.out.println("Tax amount is " + taxAmount);
		} else if (typeofIndustry == "manufacture") {
			taxAmount = price * 0.15;
			System.out.println("Tax amount is " + taxAmount);
		} else {
			System.out.println("Tax is not applicable");
		}

	}

}

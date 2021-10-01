package com.xworkz.oops;

public class WaterPurifier {

	String brand;
	int price;
	int serialNumber;
	int model;

	public WaterPurifier(String brand, int price, int serialNumber, int model) {
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.price = price;

		System.out.println("Water purifier invoked");
	}

	public void fillWater() {
		System.out.println("Filling water");
	}

	public void purify() {
		System.out.println("Purifying water");
	}

}

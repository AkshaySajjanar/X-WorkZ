package com.xworkz.constructor;

public class UPSInverter {
	String brand;
	int price;
	int capacity;
	int standby;

	public UPSInverter() {
		System.out.println("UPS inverter started");

	}

	public UPSInverter(String brand, int price, int capacity, int standby) {
		System.out.println("UPS inverter started");
		this.brand = brand;
		this.price = price;
		this.capacity = capacity;
		this.standby = standby;

	}

	public void switchOn() {
		System.out.println("UPS switched on");
	}

	public void switchOff() {
		System.out.println("UPS switched off");
	}

	public void charges() {
		System.out.println("Batttery charges");
	}

	public void discharges() {
		System.out.println("Battery dischrges");
	}
	
	public void displayInfo() {
		System.out.println("brand = "+this.brand);
		System.out.println("price = "+this.price);
		System.out.println("capacity = "+this.capacity);
		System.out.println("standby = "+this.standby);
	}

}

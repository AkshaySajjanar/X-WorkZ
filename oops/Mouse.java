package com.xworkz.oops;

public class Mouse {

	String brand;
	String model;
	int batteryLife;
	String connectivity;
	int price;
	int buttons;
	String connectorType;

	public void connect() {
		System.out.println("Mouse connects to laptop wirelessly or wired");
	}

	public void sensitivity() {
		System.out.println("It changes the sensitivity of cursor");
	}

	public void disconnect() {
		System.out.println("mouse disconnects from the laptop");
	}

}

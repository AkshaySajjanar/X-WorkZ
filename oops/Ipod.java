package com.xworkz.oops;

public class Ipod {
	String brand;
	int price;
	int imeiNumber;
	int batteryCapacity;
	int ram;
	boolean isSupportedFingerPrint;
	String color;
	int processor;
	
	Ipod(String brand, int price, int imeiNumber) {
		System.out.println("Ipod Constructor called");
		this.brand = brand;
		this.imeiNumber = imeiNumber;
		this.price = price;
	}
	
	public void swtichOn() {
		System.out.println("Ipod switching on");
	}
	
	public void playMusic() {
		System.out.println("Playing music");
	}
	
	public void swtichOff() {
		System.out.println("Ipod switching off");
	}
	
	public void displayIpodInfo() {
		System.out.println();
	}
	
	

}

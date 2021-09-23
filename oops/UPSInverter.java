package com.xworkz.oops;

public class UPSInverter {
	String Brand;
	int price;
	int capacity;
	int standby;
	
	
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

}

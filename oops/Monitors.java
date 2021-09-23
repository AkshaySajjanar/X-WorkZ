package com.xworkz.oops;

public class Monitors {

	String brand;
	int price;
	int dimension;
	String resolution;
	int noOfPorts;
	int refreshRate;

	public void switchOn() {
		System.out.println("monitor switched on");
	}

	public void switchOff() {
		System.out.println("monitor switched off");
	}

	public void changesresolution() {
		System.out.println("Monitor adjusts the resolution");
	}

	public void adjustRefreshRate() {
		System.out.println("Monitor adjust the refresh rate ");
	}

}

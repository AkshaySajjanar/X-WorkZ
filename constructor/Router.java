package com.xworkz.constructor;

public class Router {

	int SerialNumber;
	String brand;
	String bandwidth;
	int speed;
	int noOfConnections;
	
	public Router() {
		System.out.println("No Parameter constructor invoked");
	}
	
	Router(int serialNumber) {
		System.out.println("one arg constructor called");
		this.SerialNumber = serialNumber;
	}

	public Router(int SerialNumber, String brand, String bandwidth, int speed, int noOfConnections) {
		System.out.println("Parameter constructor invoked");
		this.SerialNumber = SerialNumber;
		this.brand = brand;
		this.bandwidth = bandwidth;
		this.noOfConnections = noOfConnections;
		this.speed = speed;
	}

	public void on() {
		System.out.println("Router switch on");
	}

	public void off() {
		System.out.println("Router switch off");
	}
	
	public void displayInfo() {
		System.out.println(this.brand);
		System.out.println(this.SerialNumber);
		System.out.println(this.speed);
		System.out.println(this.bandwidth);
		System.out.println(this.noOfConnections);
	}
}

package com.xworkz.constructor;

public class Tablets {
	int price;
	String brand;
	int storage;
	int ram;
	String OperatingSystem;
	int camera;

	public Tablets() {
		System.out.println("Tablet constructor without parameter invoked");
	}

	public Tablets(int price, String brand, int storage, int ram, String OperatingSystem, int camera) {
		System.out.println("Tablet constructor with the parameters invoked");
		this.brand = brand;
		this.price = price;
		this.storage = storage;
		this.ram = ram;
		this.OperatingSystem = OperatingSystem;
		this.camera = camera;
	}

	public void videoCall() {
		System.out.println("video calling a friend");
	}

	public void playingVideo() {
		System.out.println("Playing a video");
	}

	public void playingGames() {
		System.out.println("Playing video games");
	}

	public void displayInfo() {
		System.out.println("brand = " + this.brand);
		System.out.println("Price = " + this.price);
		System.out.println("storage =" + this.storage);
		System.out.println("ram = " + this.ram);
		System.out.println("Operating system = " + this.OperatingSystem);
		System.out.println("Camera = " + this.camera);
	}

}

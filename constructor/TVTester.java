package com.xworkz.constructor;

public class TVTester {

	public static void main(String[] args) {

		TV television = new TV();
		television.brand = "Moto";
		television.price = 40000;
		television.size = 43;
		television.resolution = "4K";
		television.OS = "Android 11";
		television.sound = "DolbyAtmos";
		television.displayInfo();

		System.out.println();

		TV tele = new TV("Moto", 400000, 43, "4K", "Android 11", "DolbyAtmos");
		tele.displayInfo();

	}

}

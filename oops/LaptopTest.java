package com.xworkz.oops;

public class LaptopTest {

	public static void main(String[] args) {

		Laptop Sony = new Laptop();
		Sony.brand = "Sony";
		Sony.color = "Black";
		Sony.graphicsCard = 4;
		Sony.hdd = 128;
		Sony.processor = "i5";

		System.out.println(Sony.brand);
		System.out.println(Sony.color);
		System.out.println(Sony.graphicsCard);
		System.out.println(Sony.hdd);
		System.out.println(Sony.processor);

		Sony.swithON();
	}

}

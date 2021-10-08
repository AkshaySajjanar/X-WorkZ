package com.xworkz.constructor;

public class TabletsTester {

	public static void main(String[] args) {

		Tablets tabs = new Tablets();
		tabs.price = 20000;
		tabs.brand = "Apple";
		tabs.storage = 128;
		tabs.ram = 8;
		tabs.OperatingSystem = "IpadOS";
		tabs.camera = 12;
		tabs.displayInfo();

		System.out.println();
		
		String tab1 = tabs.brand;
		tab1.length();
		int a = tab1.length();
		System.out.println(a);
		System.out.println();
		
		Tablets tab = new Tablets(20000, "Apple", 128, 8, "IpadOS", 12);
		tab.displayInfo();

	}

}

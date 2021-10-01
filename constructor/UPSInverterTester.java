package com.xworkz.constructor;

public class UPSInverterTester {

	public static void main(String[] args) {

		UPSInverter inverter = new UPSInverter();
		inverter.brand = "Luminous";
		inverter.price = 20000;
		inverter.capacity = 150;
		inverter.standby = 15;
		inverter.displayInfo();
		
		System.out.println();

		UPSInverter ups = new UPSInverter("Luminous", 20000, 150, 15);
		ups.displayInfo();

	}

}

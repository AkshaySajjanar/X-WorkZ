package com.xworkz.methods;

public class AC {
	// On, Off, TemperatureIncrease, TempDecrease
	public static void on() {
		System.out.println("Ac is ON");
	}

	public static void off() {
		System.out.println("AC is OFF");
	}

	public static void tempIncrease() {
		System.out.println("Increasing Temparature");
	}

	public static void tempDecrease() {
		System.out.println("Decreasing Temparature");
	}

	public static void main(String[] args) {
		AC.on();
		AC.tempIncrease();
		AC.tempDecrease();
		AC.off();
	}

}

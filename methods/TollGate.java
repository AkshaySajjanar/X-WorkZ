package com.xworkz.methods;

public class TollGate {

	public static void openGate() {
		System.out.println("Gate opened");
	}

	public static void collectMoney() {
		System.out.println("Paid money");
	}

	public static void closeGate() {
		System.out.println("Gate closed");
	}

	public static void main(String[] args) {

		System.out.println("Arrived at toll gate");
		TollGate.collectMoney();
		TollGate.openGate();
		System.out.println("Exit the gate");
		TollGate.closeGate();
	}

}

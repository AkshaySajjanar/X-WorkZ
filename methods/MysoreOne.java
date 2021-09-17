package com.xworkz.methods;

public class MysoreOne {

	public static void getNotification() {
		System.out.println("Office will shift to new place " + "Address will be updated");
	}

	public static String electricityBill(String custID, int amount) {
		String confirmMessage = "Electricity bill paid succesfully for " + custID;
		return confirmMessage;
	}

	public static String updateName(long aadharNumber, String NameToBeUpdated) {
		return "Nmae updated successfullt to " + NameToBeUpdated;
	}

	public static void main(String[] args) {
		System.out.println("Beginning of program");
		MysoreOne.getNotification();
		String confirmMessage = MysoreOne.electricityBill("5696691273", 1200);
		System.out.println(confirmMessage);
		MysoreOne.updateName(589079653607L, "Akshay");
		System.out.println("End of program");

	}

}

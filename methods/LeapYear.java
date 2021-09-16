package com.xworkz.methods;

public class LeapYear {

	public static void findLeapYear(int year) {
		if (year % 4 == 0) {
			System.out.println(year + " is a leap year");
		} else if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

	public static void main(String[] args) {

		int year = 2016;
		LeapYear.findLeapYear(year);
	}

}

package com.xworkz.string;

public class Validation {

	public String valid() {
		String name = "Akshay";
		String phoneNo = "7406017289";
		String place = "Bagalkot";
		String pincode = "587103";
		String email = "akshay.xworkz@gmailcom";

		String num[] = { "0", "1", "2", "3", "4", "5", };
		if (name.isEmpty() || name.length() <= 4) {
			System.out.println("Invalid Name");
			return "Validation Unsuccessfull";
		}

		for (int i = 0; i < num.length; i++) {
			if (phoneNo.isEmpty() || phoneNo.startsWith(num[i]) || phoneNo.length() < 10) {
				System.out.println("Invalid Phone Number");
				return "Validation Unsuccessfull";
			}
			
		}
		
		if(place.isEmpty() || place.length() < 4) {
			System.out.println("Enter a valid city name");
			return "Validation Unsuccessfull";
		}
		
		if (pincode.isEmpty() || pincode.length() < 6) {
			System.out.println("Enter a valid Zip Code");
			return "Validation Unsuccessfull";
		}
		
		if(email.contains(".com") && email.contains("@")) {
			
		} else {
			System.out.println("Invalid Email ID");
			return "Validation Unsuccessfull";
		}

		return "Validation Succesfull";
	}

}

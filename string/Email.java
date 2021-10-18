package com.xworkz.string;

public class Email {

	public boolean mail() {
		String mailId = "akshay.sajjanar@gmail.com";
		boolean flag = true;
		if (mailId.isEmpty()) {
			System.out.println("Please Enter a Valid Email ID");
			return false;
		} else if (mailId.length() < 11) {
			System.out.println("Email should contain more than 10 characters ");
			return false;
		} else if (!(mailId.endsWith("@gmail.com"))) {
			System.out.println("Enter valid provider name");
			return false;
		} else {
			System.out.println("Email ID is valid");
		}

		return flag;
	}
}

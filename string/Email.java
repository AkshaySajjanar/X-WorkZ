package com.xworkz.string;

public class Email {
	String mail = "akshay.sajjanar@gmail.com";

	public String mailVerify() {

		if (mail.contains("@") && mail.endsWith(".com")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}

}

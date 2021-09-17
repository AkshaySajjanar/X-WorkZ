package com.xworkz.methods;

public class LogIn {
	public static boolean logIn(String userName, String password) {
		boolean login;
		String name = "Akshay";
		String pwd = "123456";
		if (userName == name && password == pwd) {
			System.out.println("Login successfull.");
			login = true;
		} else {
			System.out.println("Invalid username and password.");
			login = false;
		}
		return login;
	}

	public static void main(String[] args) {
		System.out.println(LogIn.logIn("Akshay", "123456"));
	}

}

package com.xworkz.polymorphism;

public class SignUp {

	public SignUp() {
		System.out.println("Inside the Sign Up");
	}

	public void userSignUp(String email, String password) {
		System.out.println("Inside the email signup method");

		System.out.println("Sign up thrugh email successfull!!");
	}
	
	public void userSignUp(Long phoneNumber, String passsword) {
		System.out.println("Inside the phone signup method");

		System.out.println("Sign up thrugh email successfull!!");
	}
}

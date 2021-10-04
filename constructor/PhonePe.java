package com.xworkz.constructor;

public class PhonePe {
	long mobileNo;
	String panNo;
	long aadharNo;
	String place;
	String name;
	String email;

	public PhonePe() {
		System.out.println("No parameter constrcutor invoked");
	}

	public PhonePe(String name, long mobileNo, String place) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.place = place;
	}

	public PhonePe(String name, long mobileNo, String place, long aadharNo) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.place = place;
		this.aadharNo = aadharNo;
	}

	public PhonePe(String name, long mobileNo, String place, long aadharNo, String panNo) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.place = place;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	public PhonePe(String name, String email, long mobileNo, String place, long aadharNo, String panNo) {
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.place = place;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	public void displayInfo() {
		System.out.println(this.name);
		System.out.println(this.email);
		System.out.println(this.mobileNo);
		System.out.println(this.place);
		System.out.println(this.aadharNo);
		System.out.println(this.panNo);
	}

}

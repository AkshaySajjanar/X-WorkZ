package com.xworkz.polymorphism;

public class Printer {

	public Printer() {
		System.out.println("Inside Printer");
	}

	public void print() {
		System.out.println("Inside print method");
		System.out.println("Print the document in default settings");
	}

	public void print(String size) {
		System.out.println("Inside print method");
		System.out.println("Print the document based on size");
	}
	
	public void print(int startIndex, int endIndex) {
		System.out.println("Inside print method");
		System.out.println("Print the document from "+startIndex+ " to "+endIndex);
	}
}

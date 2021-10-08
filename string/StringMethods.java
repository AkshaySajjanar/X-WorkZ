package com.xworkz.string;

public class StringMethods {

	public static void main(String[] args) {

//		Constant variable
		
		final double pi = 3.14;
		System.out.println(pi);
		
//		pi = 5.5;(cannot initialize constant variable it gives error)               
//		System.out.println(pi);
		String userName = "Akshay";
		String name = new String("Akshay");

		int length = userName.length();
		System.out.println(length);

		char charAt = userName.charAt(3);
		System.out.println(charAt);

		int indexOf = userName.indexOf(charAt);
		System.out.println(indexOf);

		String concat = userName.concat(" Sajjanar");
		System.out.println(concat);

		boolean contains = userName.contains("Aksha");
		System.out.println(contains);

		boolean empty = userName.isEmpty();
		System.out.println(empty);

		char[] charArray = userName.toCharArray();
		System.out.println(charArray[0]);

		boolean startsWith = userName.startsWith("Ak");
		System.out.println(startsWith);

		boolean endsWith = userName.endsWith("ay");
		System.out.println(endsWith);

		if (userName.equals(name)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}

}

package com.xworkz.string;

public class StringIndexMethods {

	public static void main(String[] args) {

		String userName = "Akshay";

		int indexOf = userName.indexOf(3);
		System.out.println(indexOf);

		int indexOf2 = userName.indexOf('s');
		System.out.println(indexOf2);

		int indexOf3 = userName.indexOf(0, 0);
		System.out.println(indexOf3);

		int indexOf4 = userName.indexOf('a', 3);
		System.out.println(indexOf4);
	}

}

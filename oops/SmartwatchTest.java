package com.xworkz.oops;

public class SmartwatchTest {

	public static void main(String[] args) {

		System.out.println(Smartwatch.brand);
		Smartwatch smartWatch = new Smartwatch();
		smartWatch.model = "Xtend";
		smartWatch.color = "black";
		smartWatch.modes = 20;
		smartWatch.price = 2000;

		System.out.println(smartWatch.brand);
		System.out.println(smartWatch.model);
		System.out.println(smartWatch.color);
		System.out.println(smartWatch.modes);
		System.out.println(smartWatch.price);

	}

}

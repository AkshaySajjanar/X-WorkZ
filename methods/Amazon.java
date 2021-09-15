package com.xworkz.methods;

public class Amazon {

	public static void viewProduct() {
		System.out.println("Phones");
		System.out.println("Gadgets");
		System.out.println("Clothes");
		System.out.println("Footware");
		System.out.println("Home accessories");
	}

	public static void order() {
		System.out.println("Order placed successfully");
	}

	public static void payment() {
		System.out.println("Payment done successfully");
	}

	public static void addToCart() {
		System.out.println("Item added to cart");
	}

	public static void addToWishList() {
		System.out.println("Item added to wish list");
	}

	public static void main(String[] args) {
		System.out.println("Login to Amazon");
		Amazon.viewProduct();
		Amazon.addToCart();
		Amazon.addToWishList();
		Amazon.order();
		Amazon.payment();
		System.out.println("Logout from Amazon");
	}

}

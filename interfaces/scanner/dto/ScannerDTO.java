package com.xworkz.interfaces.scanner.dto;

public class ScannerDTO {

	private String brand;
	private String type;
	private int price;
	private String color;

	public ScannerDTO(String brand, String type, int price, String color) {
		System.out.println("Inside scanner dto");
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

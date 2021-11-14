package com.xworkz.dataTransfer_dataAccess.clock.dto;

public class ClockDto {

	private String brand;
	private int price;
	private String type;
	private String color;

	public ClockDto(String brand, int price, String type, String color) {
		System.out.println("Inside clock dto");
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

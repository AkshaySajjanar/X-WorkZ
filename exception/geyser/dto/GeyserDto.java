package com.xworkz.exception.geyser.dto;

public class GeyserDto {

	private String brand;
	private int price;
	private String type;

	public GeyserDto(String brand, int price, String type) {
		System.out.println("Inside geyser dto");
		this.brand = brand;
		this.price = price;
		this.type = type;
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

}

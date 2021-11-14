package com.xworkz.dataTransfer_dataAccess.microoven.dto;

public class MicroovenDto {
	private String brand;
	private String color;
	private int price;
	private int capacity;

	public MicroovenDto(String brand, String color, int price, int capacity) {
		System.out.println("Microoven dto created");
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}

package com.xworkz.dataTransfer_dataAccess.mobile.dto;

public class MobileDTO {

	private String brand;
	private String color;
	private int ram;
	private int price;

	public MobileDTO(String brand, String color, int ram, int price) {
		System.out.println("Mobile DTO created");
		this.brand = brand;
		this.color = color;
		this.ram = ram;
		this.price = price;
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

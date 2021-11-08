package com.xworkz.dataTransfer_dataAccess.bulb.dto;

public class BulbDTO {
	private int serialNumber;
	private String brand;
	private int price;
	private int volt;
	private String color;

	public BulbDTO(int serialNumber, String brand, int price, int volt, String color) {
		System.out.println("Inside bulb constructor");
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
		this.volt = volt;
		this.color = color;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
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

	public int getVolt() {
		return volt;
	}

	public void setVolt(int volt) {
		this.volt = volt;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

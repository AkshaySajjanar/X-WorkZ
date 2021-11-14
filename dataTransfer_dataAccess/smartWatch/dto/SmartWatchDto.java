package com.xworkz.dataTransfer_dataAccess.smartWatch.dto;

public class SmartWatchDto {
	private int serialNumber;
	private String brand;
	private String color;
	private int price;

	public SmartWatchDto(int serialNumber, String brand, String color, int price) {
		System.out.println("Smart Watch Created");
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.color = color;
		this.price = price;
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
	
	
}

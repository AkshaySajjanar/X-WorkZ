package com.xworkz.dataTransfer_dataAccess.powerbank.dto;

public class PowerBankDTO {
	private String brand;
	private int price;
	private int mAh;
	private String color;

	public PowerBankDTO(String brand, int price, int mAh, String color) {
		System.out.println("Inside powerbank DTO");
		this.brand = brand;
		this.price = price;
		this.mAh = mAh;
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

	public int getmAh() {
		return mAh;
	}

	public void setmAh(int mAh) {
		this.mAh = mAh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}

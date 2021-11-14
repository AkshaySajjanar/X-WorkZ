package com.xworkz.dataTransfer_dataAccess.inverter.dto;

public class InverterDto {

	private String brand;
	private int price;
	private int capcaity;

	public InverterDto(String brand, int price, int capcaity) {
		System.out.println("Inverter DTO created");
		this.brand = brand;
		this.price = price;
		this.capcaity = capcaity;
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

	public int getCapcaity() {
		return capcaity;
	}

	public void setCapcaity(int capcaity) {
		this.capcaity = capcaity;
	}

}

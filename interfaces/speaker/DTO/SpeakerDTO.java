package com.xworkz.interfaces.speaker.DTO;

public class SpeakerDTO {

	private String brand;
	private int price;
	private String color;
	private int watt;

	public SpeakerDTO(String brand, int price, String color, int watt) {
		System.out.println("Inside speaker DTO");
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.watt = watt;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}
	
	

}

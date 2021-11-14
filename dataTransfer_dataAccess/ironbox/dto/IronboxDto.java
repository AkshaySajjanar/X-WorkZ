package com.xworkz.dataTransfer_dataAccess.ironbox.dto;

public class IronboxDto {
	private String brand;
	private int serialNumber;
	private int watt;

	public IronboxDto(String brand, int serialNumber, int watt) {
		System.out.println("Inside ironbox dto");
		this.brand = brand;
		this.serialNumber = serialNumber;
		this.watt = watt;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getWatt() {
		return watt;
	}

	public void setWatt(int watt) {
		this.watt = watt;
	}

}

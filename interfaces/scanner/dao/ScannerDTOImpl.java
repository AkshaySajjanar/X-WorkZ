package com.xworkz.interfaces.scanner.dao;

import com.xworkz.interfaces.scanner.dto.ScannerDTO;

public class ScannerDTOImpl extends ScannerDTO implements ScannerDAO {

	public ScannerDTOImpl(String brand, String type, int price, String color) {
		super(brand, type, price, color);
		System.out.println("Inside a DAO constructor");
	}

	public ScannerDTO createScannerObject(String brand, String type, int price, String color) {
		System.out.println("Inside create method");
		ScannerDTO scannerDTO = new ScannerDTO(brand, type, price, color);
		return scannerDTO;
	}

	public ScannerDTO updateTypeByBrandName(ScannerDTO obj, String type) {
		System.out.println("Inside update method");
		obj.setType(type);
		return obj;
	}

	public void displayInfo(ScannerDTO obj) {
		System.out.println("Inside the display method");
		System.out.println(obj.getBrand());
		System.out.println(obj.getType());
		System.out.println(obj.getPrice());
		System.out.println(obj.getColor());
	}

}

package com.xworkz.interfaces.scanner.dao;

import com.xworkz.interfaces.scanner.dto.ScannerDTO;

public interface ScannerDAO {

	public void displayInfo(ScannerDTO obj);
	public ScannerDTO createScannerObject(String brand, String type, int price, String color);
	public ScannerDTO updateTypeByBrandName(ScannerDTO obj, String type);
	
	
}

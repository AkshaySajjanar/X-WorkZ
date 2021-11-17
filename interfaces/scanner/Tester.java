package com.xworkz.interfaces.scanner;

import com.xworkz.interfaces.scanner.dao.ScannerDTOImpl;
import com.xworkz.interfaces.scanner.dto.ScannerDTO;

public class Tester {
	public static void main(String[] args) {
		
		ScannerDTOImpl scannerDTOImpl = new ScannerDTOImpl("Samsung", "Cartilage", 15000, "Black");
		scannerDTOImpl.displayInfo(scannerDTOImpl);
		
		ScannerDTO updateTypeByBrandName = scannerDTOImpl.updateTypeByBrandName(scannerDTOImpl, "Null");
		scannerDTOImpl.displayInfo(updateTypeByBrandName);
		
		
	}
}

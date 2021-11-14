package com.xworkz.dataTransfer_dataAccess.inverter;

import com.xworkz.dataTransfer_dataAccess.inverter.dao.InverterDao;
import com.xworkz.dataTransfer_dataAccess.inverter.dto.InverterDto;

public class Tester {

	public static void main(String[] args) {
		
		InverterDao inverterDao = new InverterDao();
		InverterDto okaya = inverterDao.createObject("Okaya", 18000, 150);
		inverterDao.saveDto(okaya);
		InverterDto luminous = inverterDao.createObject("Luminous", 19500, 180);
		inverterDao.saveDto(luminous);
		InverterDto vguard = inverterDao.createObject("V-Guard", 20000, 200);
		inverterDao.saveDto(vguard);
		
		inverterDao.displayInfo();
		
		inverterDao.displayByBrandName("Okaya");
		
		inverterDao.updateBrandNameByBrandName("Okaya", "Microtek");
		inverterDao.displayByBrandName("Microtek");
		
		inverterDao.updatePriceByBrandName("Microtek", 17500);
		inverterDao.displayByBrandName("Microtek");
		
		inverterDao.deleteByBrandName("V-Guard");
		
		inverterDao.displayInfo();
		

		
	}
}

package com.xworkz.dataTransfer_dataAccess.smartWatch;

import com.xworkz.dataTransfer_dataAccess.smartWatch.dao.SmartWatchDao;
import com.xworkz.dataTransfer_dataAccess.smartWatch.dto.SmartWatchDto;

public class Tester {

	public static void main(String[] args) {
		SmartWatchDao smartWatchDao = new SmartWatchDao();
		SmartWatchDto mi = new SmartWatchDto(123254, "MI", "Black", 2000);
		smartWatchDao.saveDTO(mi);
		SmartWatchDto samsung = new SmartWatchDto(145620, "Smasung", "red", 20000);
		smartWatchDao.saveDTO(samsung);
		SmartWatchDto oneplus = new SmartWatchDto(45654, "Oneplus", "Silver", 15000);
		smartWatchDao.saveDTO(oneplus);
		SmartWatchDto noise = new SmartWatchDto(454545, "Noise", "Grey", 10000);
		smartWatchDao.saveDTO(noise);
		SmartWatchDto fossil = new SmartWatchDto(78889, "fossil", "Black", 10000);
		smartWatchDao.saveDTO(fossil);
//		smartWatchDao.displayInfo();
		
		System.out.println("Before update");
		
		smartWatchDao.displayByBrandName("fossil");

		smartWatchDao.updateBy("fossil", 12000);
		System.out.println("After update");
		smartWatchDao.updateBrandNameByBrandName("fossil", "Fossil Pro");
		smartWatchDao.displayByBrandName("Fossil Pro");
		
		smartWatchDao.deleteBySerialNumber(123254);
		smartWatchDao.displayByBrandName("Oneplus");


		

	}
}

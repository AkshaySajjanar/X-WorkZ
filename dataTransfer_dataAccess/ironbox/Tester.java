package com.xworkz.dataTransfer_dataAccess.ironbox;

import com.xworkz.dataTransfer_dataAccess.ironbox.dao.IronboxDao;
import com.xworkz.dataTransfer_dataAccess.ironbox.dto.IronboxDto;

public class Tester {
	public static void main(String[] args) {
		IronboxDao ironboxDao = new IronboxDao();
		IronboxDto philips = ironboxDao.createObj("Philips", 123456, 1000);
		ironboxDao.saveDto(philips);

		IronboxDto usha = ironboxDao.createObj("Usha", 3320, 1100);
		ironboxDao.saveDto(usha);

		IronboxDto bajaj = ironboxDao.createObj("Bajaj", 4562, 1200);
		ironboxDao.saveDto(bajaj);

		ironboxDao.displayInfo();

		ironboxDao.displayByBrandName("Usha");

		ironboxDao.updateWattByBrandName("Philips", 1199);
		ironboxDao.displayByBrandName("Philips");

		ironboxDao.deleteBySerialNumber(4562);
		ironboxDao.displayInfo();
	}
}

package com.xworkz.dataTransfer_dataAccess.microoven;

import com.xworkz.dataTransfer_dataAccess.microoven.dao.MicroovenDao;
import com.xworkz.dataTransfer_dataAccess.microoven.dto.MicroovenDto;

public class Tester {

	public static void main(String[] args) {

		MicroovenDao microovenDao = new MicroovenDao();
		MicroovenDto sam = microovenDao.createObject("sam", "red", 7000, 10);
		microovenDao.saveDto(sam); // microoven[0]

		MicroovenDto samsung = microovenDao.createObject("Samsung", "Black", 5000, 5);
		microovenDao.saveDto(samsung);// microoven[1]
		MicroovenDto philips = microovenDao.createObject("Philips", "Grey", 7000, 10);
		microovenDao.saveDto(philips);// microoven[2]
		MicroovenDto bajaj = microovenDao.createObject("Bajaj", "Silver", 6000, 15);
		microovenDao.saveDto(bajaj);// microoven[3]

		microovenDao.displayByBrandName("sam");

		microovenDao.updateBrandNameByBrandName("Samsung", "IFL");
		microovenDao.displayByBrandName("IFL");

		microovenDao.updatePriceByBrandName("IFL", 10000);
		microovenDao.displayByBrandName("IFL");

		microovenDao.deleteByBrandName("IFL");
		microovenDao.displayByBrandName("Philips");

		microovenDao.deleteByPrice(10000);
		microovenDao.displayByBrandName("Philips");

	}

}

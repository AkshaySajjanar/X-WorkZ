package com.xworkz.dataTransfer_dataAccess.mobile;

import com.xworkz.dataTransfer_dataAccess.mobile.dao.MobileDAO;
import com.xworkz.dataTransfer_dataAccess.mobile.dto.MobileDTO;

public class Tester {

	public static void main(String[] args) {

		MobileDAO mobileDAO = new MobileDAO();
		MobileDTO iphone = mobileDAO.createMobileObject("Iphone", "blue", 4, 80000);
		MobileDTO samsung = mobileDAO.createMobileObject("samsung", "black", 8, 100000);
		MobileDTO mi = mobileDAO.createMobileObject("Xiomi", "gold", 6, 8000);
		MobileDTO motorola = mobileDAO.createMobileObject("Moto", "silver", 8, 10000);
		MobileDTO lg = mobileDAO.createMobileObject("LG", "red", 4, 25000);

		MobileDTO mobileArray[] = { iphone, samsung, mi, motorola, lg };

		mobileDAO.displayMobileDTO(iphone);
		System.out.println("--------------------");
		mobileDAO.displayMobileDAO(mobileArray);
		System.out.println("--------------------");
		mobileDAO.filterMobileDAO(mobileArray, 3);
	}
}

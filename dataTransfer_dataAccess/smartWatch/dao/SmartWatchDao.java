package com.xworkz.dataTransfer_dataAccess.smartWatch.dao;

import com.xworkz.dataTransfer_dataAccess.smartWatch.dto.SmartWatchDto;

public interface SmartWatchDao {

	public void displayInfo();

	public void saveDTO(SmartWatchDto dto);

	public void displayByBrandName(String brandName);

	public void updateBy(String brand, int newPrice);

	public void updateBrandNameByBrandName(String brand, String newBrandName);

	public void deleteBySerialNumber(int serialNumber);
}

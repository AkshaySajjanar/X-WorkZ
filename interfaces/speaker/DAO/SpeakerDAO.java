package com.xworkz.interfaces.speaker.DAO;

import com.xworkz.interfaces.speaker.DTO.SpeakerDTO;

public interface SpeakerDAO {

	public void saveSpeakerDto(SpeakerDTO obj);

	public void displayInfo();

	public void deleteByBrand(String brand);

	public void updatePriceByBrandName(String brand, int price);

	public void updateByBrand(String brand, int watt);
}

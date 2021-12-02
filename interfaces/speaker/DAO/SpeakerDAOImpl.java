package com.xworkz.interfaces.speaker.DAO;

import com.xworkz.interfaces.speaker.DTO.SpeakerDTO;

public class SpeakerDAOImpl implements SpeakerDAO {

	SpeakerDTO speakers[] = new SpeakerDTO[4];
	int temp = 0;
	
	public void saveSpeakerDto(SpeakerDTO obj) {
		for (int i = 0; i < speakers.length; i++) {
			speakers[temp] = obj;
			temp++;
		}
		
	}

	@Override
	public void displayInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByBrand(String brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateByBrand(String brand, int watt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatePriceByBrandName(String brand, int price) {
		// TODO Auto-generated method stub
		
	}

}

package com.xworkz.encapsulation;

public class Medicine {

	private String name;
	private String mfd;
	private String expDate;
	private double mg;
	private int price;

	public void cureDisease() {
		System.out.println("Disease cured");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setMfd(String mfd) {
		this.mfd = mfd;
	}

	public String getMfd() {
		return this.mfd;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getExpDate() {
		return this.expDate;
	}

	public void setMg(double mg) {
		if (mg < 100) {
			this.mg = mg;

		} else {
			System.out.println("Please initialise valid value");
		}
	}

	public double getMg() {

		return this.mg;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

}

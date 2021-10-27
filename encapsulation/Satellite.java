package com.xworkz.encapsulation;

public class Satellite {
	private String name;
	private String place;
	private int height;
	private int cost;
	private String launch;
	
	public void launch() {
		System.out.println("Satellite launched successfully");
	}
	
	public void track() {
		System.out.println("tracking satellite position");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPlace(String place) {
		this.place = place;
	}
	
	public  String getPlace() {
		return this.place;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	
}

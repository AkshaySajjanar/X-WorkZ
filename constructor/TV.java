package com.xworkz.constructor;

public class TV {
	String brand;
	int price;
	int size;
	String resolution;
	String OS;
	String sound;

	public TV() {
		System.out.println("TV constructor without parameter invoked");
	}

	public TV(String brand, int price, int size, String resolution, String OS, String sound) {
		System.out.println("TV constructor with parameter invoked");
		this.brand = brand;
		this.price = price;
		this.size = size;
		this.resolution = resolution;
		this.OS = OS;
		this.sound = sound;

	}

	public void tvON() {
		System.out.println("TV is on");
	}

	public void tvOFF() {
		System.out.println("TV is off");
	}

	public void streamVideo() {
		System.out.println("video is streaming");
	}

	public void playingAudio() {
		System.out.println("Audio is playing");

	}

	public void displayInfo() {
		System.out.println("Brand = " + this.brand);
		System.out.println("Price = " + this.price);
		System.out.println("size = " + this.size);
		System.out.println("Resolution = " + this.resolution);
		System.out.println("OS = " + this.OS);
		System.out.println("sound = " + this.sound);
	}
}

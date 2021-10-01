package com.xworkz.oops;

public class Train {

	int trainId;
	String name;
	int noOfSeats;
	boolean isAcSupported;

	Train(int trainId, String name, int noOfSeats) {
		System.out.println("Train constuctor invoked");
		this.name = name;
		this.trainId = trainId;
		this.noOfSeats = 10;
	}

	public void transport() {

		System.out.println(this.name + " Transporting");
		this.stop();

	}

	public void start() {
		System.out.println(this.name + " train started");
		this.transport();
	}

	public void stop() {
		System.out.println(this.name + " Train stopped");
	}

}

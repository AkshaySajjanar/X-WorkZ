package com.xworkz.exception;

public class Event {

	public Event() {
		System.out.println("Inside Event");
	}

	public void createEvent(boolean status) throws Throwable {
		if (status) {
			Throwable throwable = new Throwable();
			throw throwable;
		} else {
			System.out.println("Event has not created");
		}
	}

	public void frame1() throws Throwable {
		System.out.println("Inside frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("Inside frame2");
		this.frame3();

	}

	public void frame3() throws Throwable {
		System.out.println("Inside frame3");
		this.frame4();

	}

	public void frame4() throws Throwable {
		System.out.println("Inside frame4");
		this.frame5();
	}

	public void frame5() throws Throwable {
		this.createEvent(true);
	}

}

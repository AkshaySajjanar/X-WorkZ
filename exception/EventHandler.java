package com.xworkz.exception;

public class EventHandler {

	public EventHandler() {
		System.out.println("Event handler's object");
	}

	public void createEvent() throws Throwable {
		System.out.println("Insdie create event");
		Throwable throwable = new Throwable();
		throw throwable;
	}
		
}

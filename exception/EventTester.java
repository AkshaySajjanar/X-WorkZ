package com.xworkz.exception;

public class EventTester {

	public static void main(String[] args) throws Throwable {
		
		EventHandler eventHandler = new EventHandler();
		eventHandler.createEvent();
		
		Event event = new Event();
		event.frame1();
	}
}

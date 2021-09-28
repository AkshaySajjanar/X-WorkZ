package com.xworkz.oops;

public class EventTesting {

	public static void main(String[] args) {

		Event event = new Event();

		event.eventId = 123;
		event.date = 1;
		event.name = "send off";
		event.organizer = "JK";
		event.sponsor = "Fresh min event management";

		System.out.println(event.eventId);
		System.out.println(event.date);
		System.out.println(event.name);
		System.out.println(event.organizer);
		System.out.println(event.sponsor);

		Event event2 = new Event();

		event2.eventId = 345;
		event2.date = 3;
		event2.sponsor = "MJ";
		event2.organizer = "Bloom event management";
		event2.name = "Anniversary";

		System.out.println(event2.eventId);
		System.out.println(event2.date);
		System.out.println(event2.name);
		System.out.println(event2.organizer);
		System.out.println(event2.sponsor);
	}

}

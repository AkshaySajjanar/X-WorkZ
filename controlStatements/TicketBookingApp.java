package com.xworkz.controlStatements;

public class TicketBookingApp {

	public static void main(String[] args) {
		short availableSeats = 19;
		
		if(availableSeats >=1) {
			System.out.println("You can book your tickets");	
		}
		else {
			System.out.println("There are no seats are available at the moment");
		}
		
	}

}

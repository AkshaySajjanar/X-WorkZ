package com.xworkz.methods;

public class TrainInfo {

	public static String train(int trainNumber, String time) {
		return "Train Number " + trainNumber + " arrives at " + time + ".";
	}

	public static String availableSeats() {
		return "There are total 8 seats available in S3 coach for Booking.";
	}

	public static String ticketBooking(String coach, String berth, int seatNUmber) {
		return "Your ticket for coach " + coach + ", berth " + berth + " and Seat Number " + seatNUmber
				+ " Booked succesfully.";
	}

	public static void main(String[] args) {

		String trainInfo = TrainInfo.train(88950, "7.45PM");
		System.out.println(trainInfo);
		String seatsAvailable = TrainInfo.availableSeats();
		System.out.println(seatsAvailable);
		String bookingConfirmation = TrainInfo.ticketBooking("S3", "Middle", 22);
		System.out.println(bookingConfirmation);
	}

}

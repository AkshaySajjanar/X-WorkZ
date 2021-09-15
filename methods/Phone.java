package com.xworkz.methods;

import java.util.Date;

public class Phone {
	// calls, SMS, calender, Apps, videoStreaming,
	public static void call() {
		System.out.println("Unkown is calling");
	}

	public static void sms() {
		System.out.println("You have received 4 messages");
	}

	public static void calender() {
		System.out.println(new Date());
	}

	public static void apps() {
		System.out.println("Displaying Apps");
		System.out.println("Whatsapp, Youtube, YoutubeMusic, AmazonMusic, PrimeVideo");
	}

	public static void videoStreaming() {
		System.out.println("Video is streaming from Youtube");
	}

	public static void main(String[] args) {
		Phone.calender();
		Phone.call();
		Phone.sms();
		Phone.apps();
		Phone.videoStreaming();
	}

}

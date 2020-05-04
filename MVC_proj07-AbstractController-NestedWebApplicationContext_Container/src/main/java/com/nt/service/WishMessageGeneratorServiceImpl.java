package com.nt.service;

import java.util.Calendar;

public class WishMessageGeneratorServiceImpl implements WishMessageGeneratorService {

	public String generateWishMessage() {
		Calendar cal = null;
		int hour = 0;
		String message = null;
		// get hour of the day
		cal = Calendar.getInstance();
		// get current hour
		hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour > 12)
			message = "Good Morning";
		else if (hour > 16)
			message = "Good Afternoon";
		else if (hour > 20)
			message = "Good Evening";
		else
			message = "Good Night";
		return message;
	}

}

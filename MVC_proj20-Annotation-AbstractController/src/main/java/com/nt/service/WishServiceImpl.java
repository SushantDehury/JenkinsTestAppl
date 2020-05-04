package com.nt.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class WishServiceImpl implements WishService {

	public String generateWishMsg() {
		Calendar cal=null;
		int hour=0;
		//get Calendar class obj
		cal=Calendar.getInstance();
		//get current hour of the day
		hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<12)
			return "Good Morning...";
		else if(hour<16)
			return "Good AfterNoon...";
		else if(hour<20)
			return "Good Evening...";
		else
			return "Good Night...";
	}

}

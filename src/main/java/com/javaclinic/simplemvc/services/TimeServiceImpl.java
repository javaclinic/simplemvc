package com.javaclinic.simplemvc.services;

import java.util.Date;

public class TimeServiceImpl implements TimeService {

	@Override
	public Date getCurrentDate() {
		Date now = new Date();
		return now;
	}

	@Override
	public String getCurrentTimestamp() {
		Date now = new Date();
		return now.toString();
	}

}

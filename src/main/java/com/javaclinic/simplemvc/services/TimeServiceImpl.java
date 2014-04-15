package com.javaclinic.simplemvc.services;

import java.util.Date;
import java.util.logging.Logger;

/**
 * TimeService implementation. It returns the current timestamp, as Date and as String.
 * 
 * @author nevenc
 *
 */
public class TimeServiceImpl implements TimeService {

	private static final Logger LOGGER = Logger.getLogger(TimeServiceImpl.class.getCanonicalName());

	/*
	 * Constructor.
	 */
	public TimeServiceImpl() {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + "() constructor method. Instantiating service.");
	}
	
	/*
	 * Implementing business service method.
	 * 
	 * (non-Javadoc)
	 * @see com.javaclinic.simplemvc.services.TimeService#getCurrentDate()
	 */
	@Override
	public Date getCurrentDate() {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".getCurrentDate() business method. Processing business call.");
		Date now = new Date();
		return now;
	}

	/*
	 * Implementing business service method. 
	 * 
	 * (non-Javadoc)
	 * @see com.javaclinic.simplemvc.services.TimeService#getCurrentTimestamp()
	 */
	@Override
	public String getCurrentTimestamp() {
    	LOGGER.info("Inside " + this.getClass().getSimpleName() + ".getCurrentTimestamp() business method. Processing business call.");
		Date now = new Date();
		return now.toString();
	}

}

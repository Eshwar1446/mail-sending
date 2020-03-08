package com.xworkz.mail.exception;

import org.apache.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Component;

@Component
public class SericeException extends Exception{
	
	private static Logger logger = Logger.getLogger(ServiceException.class);

	private String message = ("Exception has occured" + this.getClass().getSimpleName());

	public SericeException() {
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public SericeException(String message) {
		this.message = message;
		logger.info("inside getMessage()...Created :" + this.getClass().getSimpleName());
	}

	public String getMessage() {
		logger.info("inside getMessage()..." + message);
		return message;
	}
}

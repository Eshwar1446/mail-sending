package com.xworkz.mail.dto;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class UserDTO{
	
private static Logger logger = Logger.getLogger(UserDTO.class);
	
	private String emailId;
	private String subject;
	private String body;
	
	public UserDTO() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "UserDTO [emailId=" + emailId + ", subject=" + subject + ", body=" + body + "]";
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		UserDTO.logger = logger;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
}

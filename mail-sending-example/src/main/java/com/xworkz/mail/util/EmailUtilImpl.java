package com.xworkz.mail.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.xworkz.mail.exception.UtilException;
import com.xworkz.mail.service.EmailService;

@Service
public class EmailUtilImpl  implements EmailUtil{
	private static Logger logger = Logger.getLogger(EmailUtilImpl.class);

	@Autowired
	private EmailService service;
	@Autowired
	private JavaMailSender mailSender;

	public EmailUtilImpl() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	public boolean sendMail(String toEmailId, String body, String subject) throws UtilException {

		logger.info("invoked sendMail()...");

		boolean status = false;

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(toEmailId);
		message.setSubject(subject);
		message.setText(body);
		mailSender.send(message);

		return true;
	}


}

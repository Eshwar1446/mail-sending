package com.xworkz.mail.service;

import com.google.protobuf.ServiceException;

public interface EmailService {

	public boolean sendMailToUser(String toEmailId, String subject, String body) throws ServiceException;
}

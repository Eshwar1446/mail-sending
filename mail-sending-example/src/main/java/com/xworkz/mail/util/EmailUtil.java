package com.xworkz.mail.util;

import com.xworkz.mail.exception.UtilException;

public interface EmailUtil {
	public boolean sendMail(String toEmailId, String body, String subject) throws UtilException;
}

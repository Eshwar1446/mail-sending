package com.xworkz.mail.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Email")
public class UserEntity {
	
	private static Logger logger = Logger.getLogger(UserEntity.class);

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "mailId")
	private String emailId;
	@Column(name = "subject")
	private String subject = "Greetings";
	@Column(name = "body")
	private String body = "Welcome";

	public UserEntity() {
		logger.info("inside getMessage()...Invoked :" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", emailId=" + emailId + ", subject=" + subject + ", body=" + body + "]";
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		UserEntity.logger = logger;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

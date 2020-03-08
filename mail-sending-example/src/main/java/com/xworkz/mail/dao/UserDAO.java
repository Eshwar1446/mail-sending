package com.xworkz.mail.dao;

import java.io.Serializable;

import com.xworkz.mail.entity.UserEntity;

public interface UserDAO {
	public Serializable save(UserEntity entity);

}

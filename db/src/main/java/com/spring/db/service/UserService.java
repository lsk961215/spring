package com.spring.db.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.db.dao.UserDAO;

@Service
public class UserService {
	@Autowired
	private UserDAO userDAO;

	public Map<String,Object> getUserInfo(int userSeq) {
		return userDAO.getUserInfo(userSeq);
	}
}

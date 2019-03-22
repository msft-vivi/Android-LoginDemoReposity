package com.zhangwei.service;

import com.zhangwei.dao.UserDAO;
import com.zhangwei.entity.UserInfo;

public class UserService {
	
	UserDAO userDAO = new UserDAO();
	public boolean login(String username, String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername(username);
		userInfo.setPassword(password);
		return userDAO.queryUser(userInfo);
	}
	
}

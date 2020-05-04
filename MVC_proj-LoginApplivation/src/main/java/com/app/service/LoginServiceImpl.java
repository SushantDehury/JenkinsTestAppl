package com.app.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LoginDAO;
import com.app.dto.User;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO dao;

	@Override
	public String verifiedUser(User user) {
		int count=0;
		com.app.bo.User userBO=new com.app.bo.User();
		BeanUtils.copyProperties(user, userBO);
		count=dao.varified(userBO);
		if(count==0)
			return "Username and password is not valid...";
		else
			return "Username and password is  valid...";
	}

}

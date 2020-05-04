package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.UserBO;
import com.nt.dao.LoginDAO;
import com.nt.dto.UserDTO;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDAO dao;

	@Override
	public String validate(UserDTO dto) {
		UserBO bo = null;
		int count = 0;
		// get bo class obj
		bo = new UserBO();
		// convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		count = dao.authenticate(bo);
		if (count == 0)
			return "Invalid UserName and Passeord...";
		else
			return "Valid credention..";
	}

}

package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService service;

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String showForm(Map<String, Object> map) {
		UserCommand cmd = null;
		cmd = new UserCommand();
		cmd.setUser("sushant");
		cmd.setPwd("dehury");
		map.put("userCmd", cmd);
		return "login";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String processForm(Map<String, Object> map, @ModelAttribute("userCmd") UserCommand cmd,BindingResult errors) {
		String result = null;
		UserDTO dto = new UserDTO();
		BeanUtils.copyProperties(cmd, dto);
		result = service.validate(dto);
		map.put("result", result);
		return "login";
	}

}

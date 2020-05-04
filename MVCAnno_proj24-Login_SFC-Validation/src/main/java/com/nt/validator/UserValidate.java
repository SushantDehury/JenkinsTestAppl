package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.UserCommand;

@Component
public class UserValidate implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object cmmd, Errors errors) {
		UserCommand cmd=(UserCommand)cmmd;
		if(cmd.getUser()==null || cmd.getUser().trim().equals("") || cmd.getUser().length()==0)
			errors.rejectValue("user", "user.required");
		if(cmd.getPwd()==null || cmd.getPwd().trim().equals("") || cmd.getPwd().length()==0)
			errors.rejectValue("pwd", "pwd.required");
	}

}

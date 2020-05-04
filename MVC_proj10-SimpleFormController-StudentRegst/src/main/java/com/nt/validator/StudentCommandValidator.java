package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentCommandValidator implements Validator {

	public boolean supports(Class<?> clza) {

		return clza.isAssignableFrom(StudentCommand.class);
	}

	public void validate(Object command, Errors errors) {
		//get Command class obj
		StudentCommand cmd=(StudentCommand) command;
		if(cmd.getSname()==null || cmd.getSname().trim().length()==0 || cmd.getSname().equals("")) 
			errors.rejectValue("sname", "sname.required");
		
		if(cmd.getArdss()==null || cmd.getArdss().trim().length()==0 || cmd.getArdss().equals("")) 
			errors.rejectValue("ardss", "addrs.required");
		else if(cmd.getArdss().length()<4 || cmd.getArdss().length()>17) 
			errors.rejectValue("ardss", "addrs.minlength");
		
		if(cmd.getCource()==null || cmd.getCource().trim().length()==0 || cmd.getCource().equals("")) 
			errors.rejectValue("cource", "course.required");
		
		if(cmd.getAge()==null || cmd.getAge()==0 || cmd.getAge().equals("")) 
			errors.rejectValue("age", "age.required");
		else if(cmd.getAge()<=0 || cmd.getAge()>150) 
			errors.rejectValue("age", "age.minlength");
			
	}

}

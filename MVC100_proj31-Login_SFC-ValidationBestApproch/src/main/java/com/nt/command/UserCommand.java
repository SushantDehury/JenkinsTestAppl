package com.nt.command;

import org.hibernate.validator.constraints.NotEmpty;

public class UserCommand {
	@NotEmpty(message="Username is required")
	private String  user;
	@NotEmpty(message="Password is required")
	private String pwd;
	public UserCommand() {
		System.out.println("UserCommand 0-param constructor");
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}

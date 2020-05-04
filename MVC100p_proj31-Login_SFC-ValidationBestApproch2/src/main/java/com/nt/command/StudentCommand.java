package com.nt.command;

import javax.validation.constraints.NotEmpty;

public class StudentCommand {
	@NotEmpty(message = "Name must be Required")
	private String name;
	@NotEmpty(message = "Address must be Required")
	private String address;
	@NotEmpty(message = "Name must be Required")
	private String phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

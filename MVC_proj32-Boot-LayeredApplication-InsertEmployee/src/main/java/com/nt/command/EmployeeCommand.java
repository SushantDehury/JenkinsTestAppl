package com.nt.command;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class EmployeeCommand {
	@NotEmpty(message="Employee name is Required")
	private String ename;
	@NotEmpty(message="Employee job is Required")
	private String job;
	@Min(value = 100,message="Employee sal minimun 101 Required")
	private float sal;
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}

}

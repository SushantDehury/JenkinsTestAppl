package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private String ename;
	private String job;
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

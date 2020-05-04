package com.nt.command;

import java.util.Date;

public class EmployeeCommand {
	
	private Integer eno;
	private String ename;
	private Date dob;
	private Date doj;
	private Date  mgr;
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getMgr() {
		return mgr;
	}
	public void setMgr(Date mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [eno=" + eno + ", ename=" + ename + ", dob=" + dob + ", doj=" + doj + ", mgr=" + mgr
				+ "]";
	}
	

}

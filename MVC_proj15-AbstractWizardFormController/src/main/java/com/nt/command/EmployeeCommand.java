package com.nt.command;

import java.util.Date;

public class EmployeeCommand {
	private int eno;
	private String ename;
	private String address;
	private Date dob;
	private String qlfy;
	private int experiance;
	private String desg;
	private int sal;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getQlfy() {
		return qlfy;
	}
	public void setQlfy(String qlfy) {
		this.qlfy = qlfy;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [eno=" + eno + ", ename=" + ename + ", address=" + address + ", dob=" + dob + ", qlfy="
				+ qlfy + ", experiance=" + experiance + ", desg=" + desg + ", sal=" + sal + "]";
	}
	
	

}

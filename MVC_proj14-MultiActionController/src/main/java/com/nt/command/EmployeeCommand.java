package com.nt.command;

public class EmployeeCommand {
	private int sno;
	private String sname;
	private String adrs;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	@Override
	public String toString() {
		return "EmployeeCommand [sno=" + sno + ", sname=" + sname + ", adrs=" + adrs + "]";
	}
	

}

package com.nt.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable{
	private String sname;
	private String ardss;
	private String cource;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getArdss() {
		return ardss;
	}
	public void setArdss(String ardss) {
		this.ardss = ardss;
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	

}

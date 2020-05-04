package com.nt.command;

import java.util.Date;
import java.util.List;

public class StudentCommand {
	private int no;
	private String name;
	private List<String>  course;
	private String gender;
	private Date dob;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "StudentCommand [no=" + no + ", name=" + name + ", course=" + course + ", gender=" + gender + ", dob="
				+ dob + "]";
	}

}

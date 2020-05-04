package com.nt.dto;

public class EmployeeResultDTO extends EmployeeDTO {
	private int mgr;
	private int deptno;
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}


}

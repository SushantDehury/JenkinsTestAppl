package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String GET_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,MGR,DEPTNO FROM EMP WHERE (EMPNO IS NOT NULL AND EMPNO=?) OR (ENAME IS NOT NULL AND ENAME=?) OR (JOB IS NOT NULL AND JOB=?) OR (SAL IS NOT NULL AND SAL=?) ORDER BY ENAME";
	@Inject
	private JdbcTemplate jt;

	@Override
	public List<EmployeeResultBO> getEmployee(EmployeeBO bo) {
		List<EmployeeResultBO> listRBO = null;
		listRBO = jt.query(GET_EMP_DETAILS, rs -> {
			List<EmployeeResultBO> listRBO1 = new ArrayList();
			while (rs.next()) {
				EmployeeResultBO rbo = new EmployeeResultBO();
				rbo.setEmpno(rs.getInt(1));
				rbo.setEname(rs.getString(2));
				rbo.setJob(rs.getString(3));
				rbo.setSal(rs.getInt(4));
				rbo.setMgr(rs.getInt(5));
				rbo.setDeptno(rs.getInt(6));
				listRBO1.add(rbo);
			}
			return listRBO1;
		}, bo.getEmpno(), bo.getEname(), bo.getJob(), bo.getSal());

		return listRBO;
	}

}

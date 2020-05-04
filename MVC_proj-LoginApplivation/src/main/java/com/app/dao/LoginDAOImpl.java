package com.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.bo.User;
@Repository
public class LoginDAOImpl implements LoginDAO {
	private static final String query = "SELECT COUNT(*) FROM USERTAB WHERE PASSWORD=? AND USERNAME=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public int varified(User user) {
		int count = 0;
		count = jt.queryForObject(query, Integer.class, user.getPwd(), user.getUser());
		return count;
	}

}

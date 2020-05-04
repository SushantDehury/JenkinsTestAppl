package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
@ComponentScan("com.nt.dao")
public class PersistenceConfig {
	
	@Bean
	public DataSource getDS() {
		JndiDataSourceLookup lookup=null;
		lookup=new JndiDataSourceLookup();
		DataSource ds=lookup.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}
	@Bean
	public JdbcTemplate getJT() {
		JdbcTemplate templet=null;
		templet=new JdbcTemplate(getDS());
		return templet;
	}

}

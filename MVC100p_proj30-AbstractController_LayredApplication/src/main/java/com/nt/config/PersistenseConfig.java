package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jndi.JndiObjectFactoryBean;

@Configuration
@ComponentScan(basePackages= "com.nt.dao")
public class PersistenseConfig {
	
	@Bean
	public JndiObjectFactoryBean getBean() {
		JndiObjectFactoryBean factory=null;
		factory= new JndiObjectFactoryBean();
		factory.setJndiName("java:/comp/env/DsJndi");
		return factory;
	}
	
	@Bean
	public DataSource getData() {
		return (DataSource) getBean().getObject();
	}
	@Bean
	public JdbcTemplate getTemplete() {
		JdbcTemplate jt=null;
		jt=new JdbcTemplate();
		jt.setDataSource(getData());
		return jt;
	}
	

}

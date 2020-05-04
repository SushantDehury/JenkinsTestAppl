package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.ParameterizableViewController;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
@EnableWebMvc
public class WebMvcAppConfig {
	
	/*@Bean
	public HandlerMapping getMapping() {
		RequestMappingHandlerMapping mapping=null;
		mapping=new RequestMappingHandlerMapping();
		return mapping;
	}
*/
	@Bean
	public HandlerMapping getMappi() {
		SimpleUrlHandlerMapping mapping=null;
		Properties prop=null;
		prop=new Properties();
		prop.setProperty("/home.htm","pvc");
		mapping=new SimpleUrlHandlerMapping();
		mapping.setMappings(prop);
		return mapping;
	}

	
	@Bean("pvc")
	public ParameterizableViewController getPVC() {
		ParameterizableViewController ctrl=null;
		ctrl=new ParameterizableViewController();
		ctrl.setViewName("welcome");
		return ctrl;
	}
	
	@Bean
	public ViewResolver getResolver() {
		InternalResourceViewResolver resolver=null;
		resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}

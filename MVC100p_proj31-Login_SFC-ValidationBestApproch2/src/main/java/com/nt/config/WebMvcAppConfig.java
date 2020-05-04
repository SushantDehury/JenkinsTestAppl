package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.nt.controller")
@EnableWebMvc
public class WebMvcAppConfig implements WebMvcConfigurer{
	
	/*@Bean
  	public RequestMappingHandlerMapping getRMHM() {
		RequestMappingHandlerMapping mapping=null;
		mapping=new RequestMappingHandlerMapping();
		mapping.setInterceptors(new DoublePostingInterseptor());
		return mapping;
	}*/
	
	@Bean
	public ViewResolver getIRVR() {
		InternalResourceViewResolver resolver=null;
		resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean("messageSource")
	public ResourceBundleMessageSource getRBMS() {
		ResourceBundleMessageSource source=new ResourceBundleMessageSource();
		source.setBasename("com/nt/commons/validate");
		return source;
	}
	
}
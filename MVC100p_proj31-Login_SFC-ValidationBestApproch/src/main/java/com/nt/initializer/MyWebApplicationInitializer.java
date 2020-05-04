package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		AnnotationConfigWebApplicationContext parent, child = null;
		ContextLoaderListener listener = null;
		DispatcherServlet servlet = null;
		ServletRegistration.Dynamic register = null;
		// congugure congiguration file
		parent = new AnnotationConfigWebApplicationContext();
		parent.register(RootAppConfig.class);
		child = new AnnotationConfigWebApplicationContext();
		child.register(WebMvcAppConfig.class);

		listener = new ContextLoaderListener(parent);
		servlet = new DispatcherServlet(child);
		register = sc.addServlet("dispatcher", servlet);
		sc.addListener(listener);
		register.addMapping("*.htm");
		register.setLoadOnStartup(2);
	}

}

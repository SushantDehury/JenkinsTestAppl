package com.nt.initializar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

public class MyWebApplicationInitializar implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		AnnotationConfigWebApplicationContext parent = null, child = null;
		ContextLoaderListener listner = null;
		DispatcherServlet servlet = null;
		ServletRegistration.Dynamic register = null;
		// create Root ApplicationContext Container
		parent = new AnnotationConfigWebApplicationContext();
		parent.register(RootAppConfig.class);
		// create child container
		child = new AnnotationConfigWebApplicationContext();
		child.register(WebMvcAppConfig.class);

		// create contextloaderlistner
		listner = new ContextLoaderListener(parent);
		// create DispatcherServlet
		servlet = new DispatcherServlet(child);
		register = sc.addServlet("dispatcher", servlet);
		register.addMapping("*.htm");
		sc.addListener(listner);
		register.setLoadOnStartup(2);

	}

}

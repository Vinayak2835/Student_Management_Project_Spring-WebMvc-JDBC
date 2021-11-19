package com.saleniumexpress.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] configClass = {StudentAppConfig.class};
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		
		String[] mapping = {"/"};
		return mapping;
	}

}

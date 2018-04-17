package com.spring.core;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Spring bean
 * 
 */
public class HelloWorld implements InitializingBean,DisposableBean {
	private String name;

	private HelloWorld() {
		System.out.println("Private Constructor...>");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printHello() {
		System.out.println("Spring 3 : Hello ! " + name);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("HelloWorld --afterPropertiesSet()");
	}

	public void destroy() throws Exception {
		System.out.println("HelloWorld --destroy()");
	}
}
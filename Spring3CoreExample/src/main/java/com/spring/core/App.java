package com.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
		System.out.println("Obj=-->"+obj);
		HelloWorld obj2 = (HelloWorld) context.getBean("helloBean2");
		System.out.println("Obj2=-->"+obj2);
		obj2.printHello();
		context.close();
	}
}

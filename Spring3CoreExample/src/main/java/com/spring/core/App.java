package com.spring.core;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.listener.CustomEventPublisher;

public class App {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

		// Let us raise a start event.
		context.start();
		// HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		// obj.printHello();
		// Let us raise a start event.
//		context.refresh();
		// System.out.println("Obj=-->" + obj);
		// HelloWorld obj2 = (HelloWorld) context.getBean("helloBean2");
		// System.out.println("Obj2=-->" + obj2);
		// obj2.printHello();

		CustomEventPublisher publisher = context.getBean("customEventPublisher", CustomEventPublisher.class);
		publisher.publish();
		// Let us raise a stop event.
		context.stop();
	}
}

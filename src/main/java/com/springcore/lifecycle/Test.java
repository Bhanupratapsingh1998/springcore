package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/cycleconfig.xml");
		/*
		 * Car c = (Car)context.getBean("c1"); System.out.println(c);
		 * context.registerShutdownHook();
		 */

		bike b = (bike) context.getBean("b1");
		System.out.println(b);
		context.registerShutdownHook();
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);
	}
}

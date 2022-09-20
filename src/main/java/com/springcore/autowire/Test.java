package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.ref.A;

public class Test {
	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autoconfig.xml");
		  Emp temp = (Emp) context.getBean( "emp");
		  System.out.println(temp);
	}
}

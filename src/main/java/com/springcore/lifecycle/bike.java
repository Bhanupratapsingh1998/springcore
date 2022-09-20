package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class bike implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public bike() {
		super();
	}

	@Override
	public String toString() {
		return "bike [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("init bean initialization using interface");
	}

	public void destroy() throws Exception {
		// destroy
		System.out.println("destroy objects using interface");
		
	}

}

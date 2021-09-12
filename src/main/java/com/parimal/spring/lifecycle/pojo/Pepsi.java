package com.parimal.spring.lifecycle.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean{

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void destroy() throws Exception {
		System.out.println("-------------Destroy method called-------"+this.getClass().getName());	
		
	}

	public void afterPropertiesSet() throws Exception {
		
		System.out.println("-------------Init method called--------"+this.getClass().getName());
		
	}
	
	
	
}

package com.parimal.spring.lifecycle.pojo;

public class Samosa {

	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void init() {
		System.out.println("-------------Init method called-------"+this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("-------------Destroy method called-----"+this.getClass().getName());
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	
}

package com.parimal.xmlconfiguration.pojo;

public class Machine {

	int mid;
	double price;
	
	Description desc;

	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Description getDesc() {
		return desc;
	}

	public void setDesc(Description desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Machine [id=" + mid + ", price=" + price + ", desc=" + desc + "]";
	}
	
	
}

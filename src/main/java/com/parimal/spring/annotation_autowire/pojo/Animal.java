package com.parimal.spring.annotation_autowire.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Animal {

	int id;

	// @Autowired
	private DetailInfo detailInfo;
	
	@Autowired
	public void setDetailInfo(DetailInfo detailInfo) {
		System.out.println("Setter method called");
		this.detailInfo = detailInfo;
	}

	public Animal(DetailInfo detailInfo) {
		System.out.println("Constructor calling");
		this.detailInfo = detailInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public DetailInfo getDetailInfo() {
		return detailInfo;
	}

	

	@Override
	public String toString() {
		return "Animal [id=" + id + ", detailInfo=" + detailInfo + "]";
	}

}

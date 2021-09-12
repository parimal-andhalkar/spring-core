package com.parimal.xmlconfiguration.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {
	
	String name;
	
	Set<String> colors;
	List<String> model;
	Map<String, Double> prices;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getColors() {
		return colors;
	}
	public void setColors(Set<String> colors) {
		this.colors = colors;
	}
	public List<String> getModel() {
		return model;
	}
	public void setModel(List<String> model) {
		this.model = model;
	}
	public Map<String, Double> getPrices() {
		return prices;
	}
	public void setPrices(Map<String, Double> prices) {
		this.prices = prices;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", colors=" + colors + ", model=" + model + ", prices=" + prices + "]";
	}
	
	
	
	
	

}

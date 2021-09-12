package com.parimal.xmlconfiguration.pojo;

public class Description {
	
	
	String info;
	String purpose;
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "Description [info=" + info + ", purpose=" + purpose + "]";
	}
}

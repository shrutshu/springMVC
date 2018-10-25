package com.cg.springmvcone.dto;

public class Mobile {
	Integer mobileId;
	String mobileName;
	Double mobilePrice;
	String mobileCategory;
	
	public Mobile(){
		
	}
	public Mobile(Integer mobileId, String mobileName, Double mobilePrice,
			String mobileCategory) {
		super();
		this.mobileId = mobileId;
		this.mobileName = mobileName;
		this.mobilePrice = mobilePrice;
		this.mobileCategory = mobileCategory;
	}
	
	public Integer getMobileId() {
		return mobileId;
	}
	public void setMobileId(Integer mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public Double getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(Double mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	public String getMobileCategory() {
		return mobileCategory;
	}
	public void setMobileCategory(String mobileCategory) {
		this.mobileCategory = mobileCategory;
	}
	
	

	

}

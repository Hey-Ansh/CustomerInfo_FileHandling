package com.CustomerInfo_FileHandling;

import java.io.Serializable;

public class Address implements Serializable
{

	private String HouseNo;
	private String LandMark;
	private String zipCode;
	private String City;
	private String District;
	private String State;
	private String Country;
	
	public String getHouseNo() {
		return this.HouseNo;
	}
	public void setHouseNo(String HouseNo) {
		this.HouseNo=HouseNo;
	}
	
	public String getLandMark() {
		return this.LandMark;
	}
	public void setLandMark(String LandMark) {
		this.LandMark=LandMark;
	}
	
	public String getzipCode() {
		return this.zipCode;
	}
	public void setzipCode(String zipCode) {
		this.zipCode=zipCode;
	}
	
	public String getCity() {
		return this.City;
	}
	public void setCity(String City) {
		this.City=City;
	}
	
	public String getDistrict() {
		return this.District;
	}
	public void setDistrict(String District) {
		this.District=District;
	}
	
	public String getState() {
		return this.State;
	}
	public void setState(String State) {
		this.State=State;
	}
	
	public String getCountry() {
		return this.Country;
	}
	public void setCountry(String Country) {
		this.Country=Country;
	}
}

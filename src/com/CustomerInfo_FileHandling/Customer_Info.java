package com.CustomerInfo_FileHandling;

import java.io.Serializable;
import java.util.List;

public class Customer_Info implements Serializable
{

	private String FullName;
	private String customerId;
	private String DOB;
	private String Gender;
	private String email;
	private String phoneNo;
	private Address Address;
	private List<PreferencE> preference;
	
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getDOB() {
		return this.DOB;
	}
	public void setDOB(String DOB) {
		this.DOB=DOB;
	}
	
	public String getGender() {
		return this.Gender;
	}
	public void setGender(String Gender) {
		this.Gender=Gender;
	}
	
	public String getemail() {
		return this.email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	
	public String getphoneNo() {
		return this.phoneNo;
	}
	public void setphoneNo(String phoneNo) {
		this.phoneNo=phoneNo;
	}
	
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		Address = address;
	}
	public List<PreferencE> getPreference() {
		return preference;
	}
	public void setPreference(List<PreferencE> preference) {
		this.preference = preference;
	}
	

}

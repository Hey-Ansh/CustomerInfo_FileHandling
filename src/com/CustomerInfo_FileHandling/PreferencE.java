package com.CustomerInfo_FileHandling;

import java.io.Serializable;

public class PreferencE implements Serializable {
	private String preferencECategory;
	private String customerPreferencE;
	
public String getCustomerPreferencE() 
{
	return customerPreferencE;
}
public void setCustomerPreferencE(String customerPreferencE) 
{
	this.customerPreferencE = customerPreferencE;
}

public String getPreferencECategory() 
{
	return preferencECategory;
}
public void setPreferencECategory(String preferencECategory) 
{
	this.preferencECategory = preferencECategory;
}
}

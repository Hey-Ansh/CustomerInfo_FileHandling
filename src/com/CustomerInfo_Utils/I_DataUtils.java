package com.CustomerInfo_Utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.CustomerInfo_FileHandling.Customer_Info;


public interface I_DataUtils 
{
	
public Customer_Info createCutomer(Customer_Info c) throws IOException ;
public Customer_Info readCustomer(String Id) throws FileNotFoundException, IOException, ClassNotFoundException;
public Customer_Info readCustomerByName(String name);
public Customer_Info updateCustomer(String ID,Customer_Info c);
public boolean deleteCustomer(String Id);


}

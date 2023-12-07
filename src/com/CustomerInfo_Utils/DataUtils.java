


package com.CustomerInfo_Utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.CustomerInfo_FileHandling.*;

	public class DataUtils implements I_DataUtils 
	{
		@Override
		public Customer_Info createCutomer(Customer_Info c1) throws IOException 
		{
			c1.setCustomerId(UUID.randomUUID().toString().substring(0, 6));
			
			File file = new File("./data/Customer.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			FileOutputStream fis= new FileOutputStream(file);
			ObjectOutputStream oos= new ObjectOutputStream(fis);
			oos.writeObject(c1);
			return c1;

			
			
			
			
			
			/*
			 * this is solution/method 1
			 * 
			Customer_Info ci=new Customer_Info();
			ci.setFullName("Anshuman Pradhan");
			ci.setCustomerId(UUID.randomUUID().toString().substring(0, 6));
			ci.setDOB("02/06/1996");
			ci.setGender("Male");
			ci.setemail("ansh096@yahoo.com");
			ci.setphoneNo("8847853541");
			
			Address a=new Address();
			a.setLandMark("Near chowk");
			a.setHouseNo("12");
			a.setzipCode("760011");
			a.setCity("Berhampur");
			a.setDistrict("Ganjam");
			a.setState("Orissa");
			a.setCountry("Bharat");
			
			PreferencE pf=new PreferencE();
			pf.setCustomerPreferencE("Travelling");
			pf.setPreferencECategory("Adventure");
			
			List<PreferencE> prf=new ArrayList<>();
			prf.add(pf);
			ci.setAddress(a);
			ci.setPreference(prf);
			
			File file=new File("./data/Customer.txt");
			
			if(!file.exists())
			{
				file.createNewFile();
				System.out.println("File created    :");
			}
			
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ci);
			
			return ci;
			*/
			
			
						
		}

		@Override
		public Customer_Info readCustomer(String Id) throws IOException, ClassNotFoundException 
		{
			File file = new File("./data/Customer.txt");
			FileInputStream fos= new FileInputStream(file);
			ObjectInputStream ois = ObjectInputStream(fos);
			Customer_Info c=(Customer_Info) ois.readObject();
			
			return c;
			
			
			/*
			 * this is the first solution/method
			 * 
			File file=new File("./data/Customer.txt");
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream obj=new ObjectInputStream(fis);
			
			Customer_Info cif=(Customer_Info) obj.readObject();
			
			System.out.println("Customer Name   :  "+cif.getFullName());
			System.out.println("Customer Id     :  "+cif.getCustomerId());
			System.out.println("Customer DOB    :  "+cif.getDOB());
			System.out.println("Customer Gender :  "+cif.getGender());
			System.out.println("Customer Email  :  "+cif.getemail());
			System.out.println("Customer Phone  :  "+cif.getphoneNo());
		
		*/
			
			/*
			File ad_file=new File("./data/Customer.txt");
			FileInputStream ad_fis =new FileInputStream(ad_file);
			ObjectInputStream ad_obj=new ObjectInputStream(ad_fis);
			
			Address ad=(Address) ad_obj.readObject();
			
			System.out.println(ad_obj);
	*/
			
		}

		private ObjectInputStream ObjectInputStream(FileInputStream fos) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Customer_Info readCustomerByName(String name) {
			
			return null;
		}

		@Override
		public Customer_Info updateCustomer(String ID, Customer_Info c) {
			
			return null;
		}

		@Override
		public boolean deleteCustomer(String Id) {
			
			return false;
		}
		
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			/*
			 * this is the first method/solution
			 * 
			DataUtils du=new DataUtils();
			du.createCutomer(null);
			du.readCustomer(null); 
			
		   */
			
			/**
			 * this is the 2nd method
			 * 
			Scanner sc=new Scanner(System.in);
			
			DataUtils du=new DataUtils();
			Customer_Info ci=new Customer_Info();
			
			System.out.println("Enter your FullName :");
			ci.setFullName(sc.nextLine());
			System.out.println("Enter your DOB :");
			ci.setDOB(sc.nextLine());
			System.out.println("Enter your Gender :");
			ci.setGender(sc.nextLine());
			System.out.println("Enter your Email :");
			ci.setGender(sc.nextLine());
			System.out.println("Enter your Phone Number :");
			ci.setphoneNo(sc.nextLine());
			du.createCutomer(ci);
			*/
		
			
			// this is the 3rd method
			DataUtils du=new DataUtils();
			Customer_Info cst = du.readCustomer("");
			
			System.out.println("Customer full name  :"+cst.getFullName());
			System.out.println("Customer DOB		:"+cst.getDOB());
			System.out.println("Customer gender		:"+cst.getGender());
			System.out.println("Customer email		:"+cst.getemail());
			System.out.println("Customer phone no	:"+cst.getphoneNo());
			System.out.println("Customer Id no		:"+(UUID.randomUUID().toString().subSequence(0, 5)));
			
		}

	}

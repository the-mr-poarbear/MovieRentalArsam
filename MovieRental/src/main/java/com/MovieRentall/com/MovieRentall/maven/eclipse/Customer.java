package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private String address;
	private int ID ;
	private int instanceID = 0;
	private List<Rental> RentalList  ;
	Customer(String name, String email,String phone, String address){
		this.name = name ;
		this.email = email;
		this.phone = phone;
		this.address = address;
		int ID = instanceID;
		AddID();
		RentalList = new ArrayList<Rental>();
	}
	
	private void AddID() {
		ID++;
	}
	
	public int GetID() {
		return ID;
	}
	
	public String GetName() {
		return name;
	}
	public String GetEmail() {
		return email;
	}
	public String GetPhone() {
		return phone;
	}
	public String GetAddress() {
		return address;
	}
	public List<Rental> GetRental() {
		return RentalList ;
	}
	public void AddRental(Rental rental) {
		RentalList.add(rental);
	}
	void ShowRental() {
		for(Rental rental : RentalList) {
			System.out.println(rental.GetItem().GetTitle());
		}
	
	}
	
	String Show() {
		return "name : " + name + "email : " + email + "phone : " + phone ; 
	}
}

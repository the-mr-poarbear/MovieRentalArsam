package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private String address;
	private int id ;
	private List<Rental> rentals  ;
	Customer(String name, String email,String phone, String address , int id){
		this.name = name ;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.id = id;
		rentals = new ArrayList<Rental>();
	}
	
	Customer(int id){
		this.id = id ;
	}
	
	private void AddID() {
		id++;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public List<Rental> getRental() {
		return rentals ;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setRental(List<Rental> rentals) {
		this.rentals = rentals ;
	}
	public void AddRental(Rental rental) {
		rentals.add(rental);
	}
	void ShowRental() {
		for(Rental rental : rentals) {
			System.out.println(rental.GetItem().getTitle());
		}
	
	}
	
	String Show() {
		return "name : " + name + "email : " + email + "phone : " + phone ; 
	}
}

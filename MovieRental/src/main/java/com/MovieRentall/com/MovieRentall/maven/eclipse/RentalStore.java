package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalStore {
	static int id = 1;
	private List<Customer> RegisteredPpl = new ArrayList<Customer>();
	private List<Item> ItemList = new ArrayList<Item>();
	private Customer customer;
	void Register(Customer customer) {
		RegisteredPpl.add(customer);
		
	}
	void AddItem(Item item) {
		ItemList.add(item);
	}
	void RemoveItem(Item item) {
		int i ;
		for(i = 0 ; i < ItemList.size() ; i++) {
			if(ItemList.get(i).equals(item)) {
				ItemList.remove(i);
			}
		}
	}
	public List<Item> GetAvailableItems() {
		List<Item> AvailableItemList = new ArrayList<Item>();
		for(int i = 0 ; i < ItemList.size() ; i++) {
			if(ItemList.get(i).IsAvailable()) {
				AvailableItemList.add(ItemList.get(i));
			}
		}
		return AvailableItemList;
	}
	void RentItem(Item item , Customer customer ) {
		Customer temp = new Customer(customer.getId());
		id++;
		Rental rental = new Rental(item , temp , id);
		item.setAvailable(false);
		customer.AddRental(rental);
		
	}
	
	void ReturnItem(Rental rental) {
		Item item = rental.GetItem();
		Customer customer = rental.GetCustomer();
		item.setAvailable(true);
		for(int i = 0 ; i < customer.getRental().size() ; i++) {
			if(customer.getRental().get(i).equals(rental)) {
				customer.getRental().remove(i) ;
			}
		}
	}
	
	public Customer GetCustomerByID(int ID ) {
		for(int i = 0 ; i < RegisteredPpl.size() ; i++ ) {
			if(RegisteredPpl.get(i).getId()== ID) {
				return RegisteredPpl.get(i);
			}			
		}
		return null;
		
	}
	
	public Item GetItemByID(int ID) {
		for(int i = 0 ; i < ItemList.size() ; i++ ) {
			if(ItemList.get(i).getId()== ID) {
				return ItemList.get(i);
			}			
		}
		return null;
		
	}
	
	void ShowItemList() {
		for(Item item : this.GetAvailableItems()) {
			System.out.println(item.Show()); 
		}
	}
	
	public List <Item> GetItemList(){
		return ItemList;
	}
	
}

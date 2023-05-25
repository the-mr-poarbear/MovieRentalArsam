package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalStore {
	private List<Customer> RegisteredPpl = new ArrayList<Customer>();
	private List<Item> ItemList = new ArrayList<Item>();
	private Customer customer;
	void Register(Customer customer) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		System.out.println("Enter your email : ");
		String email = s.nextLine();
		System.out.println("Enter your phone : ");
		String phone = s.nextLine();
		System.out.println("Enter your address : ");
		String address = s.nextLine();
		customer = new Customer(name , email , phone , address);
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
		Rental rental = new Rental(item , customer);
		item.SetAvailable(false);
		customer.AddRental(rental);
		
	}
	
	void ReturnItem(Rental rental) {
		Item item = rental.GetItem();
		Customer customer = rental.GetCustomer();
		item.SetAvailable(true);
		for(int i = 0 ; i < customer.GetRental().size() ; i++) {
			if(customer.GetRental().get(i).equals(rental)) {
				customer.GetRental().remove(i) ;
			}
		}
	}
	
	public Customer GetCustomerByID(int ID ) {
		for(int i = 0 ; i < RegisteredPpl.size() ; i++ ) {
			if(RegisteredPpl.get(i).GetID()== ID) {
				return RegisteredPpl.get(i);
			}			
		}
		return null;
		
	}
	
	public Item GetItemByID(int ID) {
		for(int i = 0 ; i < ItemList.size() ; i++ ) {
			if(ItemList.get(i).GetID()== ID) {
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

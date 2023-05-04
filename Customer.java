package MovieRentall;

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
}

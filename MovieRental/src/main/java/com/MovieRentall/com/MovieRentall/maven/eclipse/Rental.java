package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.text.ParseException; 
import java.util.Date;
import java.text.SimpleDateFormat;  
public class Rental {
	private Item rentedItem ;
	private Customer renter ;
	private int ID  ;
	private int instanceID = 0;
	private Date rentalDate ;
	private Date returnDate ;
	String rentalDateStr;
	String returnDateStr;
	SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
	Rental(Item rentedItem,Customer renter ){
		this.rentedItem = rentedItem;
		this.renter = renter ;
		int ID = instanceID;
		AddID();
		
		rentalDate = new Date();
		rentalDateStr = obj.format(rentalDate);
		
	}
	private void AddID() {
		ID++;
	}
	public int GetID() {
		return ID ;
	}
	
	public Item GetItem() {
		return rentedItem ;
	}
	public Customer GetCustomer() {
		return renter ;
	}
	public Date GetRentalDate() {
		try {
		Date rentalDate = obj.parse(rentalDateStr);
		return rentalDate;
		}
		 catch (ParseException excep) {   
	            excep.printStackTrace();   
	        }
		return null;   
	}
	
	 public long FindDateDiff(String rentalDateStr, String returnDateStr)   
	    {   
	        // Create an instance of the SimpleDateFormat class  
	        SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");   
	        // In the try block, we will try to find the difference  
	        long days_difference = 0;
	        try {   
	            // Use parse method to get date object of both dates  
	            Date date1 = obj.parse(rentalDateStr);   
	            Date date2 = obj.parse(returnDateStr);   
	            // Calucalte time difference in milliseconds   
	            long time_difference = date2.getTime() - date1.getTime();  
	            // Calucalte time difference in days  
	            days_difference = (time_difference / (1000*60*60*24)); 
	            
	        }   
	        // Catch parse exception   
	        catch (ParseException excep) {   
	            excep.printStackTrace();   
	        }
	        return days_difference ; 
	    }   
	
	public Date GetReturnDate() {
		returnDate = new Date();
		return returnDate;
	}
	double CalculateLateFee(float feeRate){
		rentalDateStr = obj.format(GetRentalDate());
		returnDateStr = obj.format(GetReturnDate());
		long dateDiffrence = FindDateDiff(rentalDateStr, returnDateStr);
		if(dateDiffrence>=30) {
			return dateDiffrence * feeRate ;
		}else {
			return 0 ;
		}
		
	}
	
}

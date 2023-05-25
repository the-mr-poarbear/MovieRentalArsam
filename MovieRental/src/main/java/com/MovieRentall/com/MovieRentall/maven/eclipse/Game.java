package com.MovieRentall.com.MovieRentall.maven.eclipse;

public class Game extends Item {
	
	String manufacturer ;
	String director ;
	
	public Game( String title , String releaseDate , String genre , String manufacturer , int id  , boolean isAvalable , String director) {
		this.title = title ;
		this.releaseDate = releaseDate;
		this.genre = genre ;
		this.manufacturer = manufacturer;
		this.id = id ;
		this.isAvailable = isAvalable;
		this.director = director ;
	}
	
	public String GetManufacturer(){
		return this.manufacturer;
	}
	
	public String GetDirector() {
		return this.director;
	}
	
	public void SetManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void SetDirector(String director) {
		this.director = director;
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " release date : " + releaseDate + "company" + manufacturer;
	}
}

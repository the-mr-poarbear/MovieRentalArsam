package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.Date;
import java.util.Random;

public abstract class Item {
	Random random = new Random();
	protected String title ;
	protected String genre;
	protected String releaseDate;
	protected boolean isAvailable ;
	int id;
	
	public String getTitle() {
		return title;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public String getReleaseDate() {
		return releaseDate;
	}
	
	public boolean IsAvailable() {
		return isAvailable;
	}
	
	void setAvailable(boolean status){
		isAvailable = status ;
	}
	
	public int getId(){
		return id;	
	}
	
	public void setTitle(String title ) {
		this.title = title;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setId(int id) {
		this.id = id ;
	}
	
	
	
	abstract String Show();
	
	int GenerateRandomID() {
		return random.nextInt();
	}
	
	
}

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
	
	public String GetTitle() {
		return title;
	}
	
	public String GetGenre() {
		return genre;
	}
	
	public String GetReleaseDate() {
		return releaseDate;
	}
	
	public boolean IsAvailable() {
		return isAvailable;
	}
	
	void SetAvailable(boolean status){
		isAvailable = status ;
	}
	
	public int GetID(){
		return id;	
	}
	
	public void SetTitle(String title ) {
		this.title = title;
	}
	
	public void SetGenre(String genre) {
		this.genre = genre;
	}
	
	public void SetReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void SetID(int id) {
		this.id = id ;
	}
	
	
	
	abstract String Show();
	
	int GenerateRandomID() {
		return random.nextInt();
	}
	
	
}

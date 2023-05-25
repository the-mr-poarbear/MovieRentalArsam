package com.MovieRentall.com.MovieRentall.maven.eclipse;

public class Book extends Item {
	
	private String writer;
	
	
	public Book( String title , String releaseDate , String genre , String writer , int id , boolean isAvailable ) {
		this.title = title ;
		this.releaseDate = releaseDate;
		this.genre = genre ;
		this.writer = writer;
		this.id = id ;
		this.isAvailable = isAvailable;
	}
	
	public String GetWriter() {
		return writer ;
	}
	
	public void SetWriter(String writer) {
		this.writer = writer ;
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " release date : " + releaseDate + "author" + writer;
	}

}

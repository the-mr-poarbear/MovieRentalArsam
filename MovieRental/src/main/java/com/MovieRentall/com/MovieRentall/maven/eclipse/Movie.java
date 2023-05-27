package com.MovieRentall.com.MovieRentall.maven.eclipse;

public class Movie extends Item {

	private String director;
	private String cast;
	Movie(String title,String genre,String director,String cast,String releaseDate , boolean isAvailable){
		this.title = title ;
		this.genre = genre ;
		this.director = director;
		this.cast = cast;
		this.releaseDate = releaseDate;
		this.id = id ;
		this.isAvailable = isAvailable ;
		
		
	}
	
	
	public String getCast() {
		return cast;
	}
	
	public String getDirector() {
		return director ;
	}
	
	public void setCast(String cast ) {
		this.cast = cast ;
	}
	
	public void setDirector(String director) {
		this.director = director;
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " director : " + director + " release date : " + releaseDate ; 
	}
	
}

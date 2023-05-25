package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.util.ArrayList;

public class AllModules {
	
	public ArrayList<Game> games ;
	public ArrayList<Book> books ;
	public ArrayList<Movie> movies ;
	public ArrayList<Customer> customers ;
	
	public ArrayList<Game> Getgames(){
		return games;
	}
	
	public ArrayList<Book> GetBooks(){
		return books;
	}
	
	public ArrayList<Movie> GetMovies(){
		return movies;
	}
	
	public ArrayList<Customer> GetCustomers(){
		return customers;
	}
	
	public void SetGames( ArrayList<Game> games){
		this.games = games;
	}
	
	public void SetBooks(ArrayList<Book> books){
		this.books = books ;
	}
	
	public void SetMovies(ArrayList<Movie> movies){
		this.movies = movies;
	}
	
	public void SetCustomers(ArrayList<Customer> customers){
		this.customers = customers;
	}
	
}

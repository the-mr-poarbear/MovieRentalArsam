package com.MovieRentall.com.MovieRentall.maven.eclipse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Gson gson = new Gson(); // create a new Gson object
		Reader reader = new FileReader("C:\\Users\\arsam\\eclipse-workspace\\MovieRental\\src\\test\\TestYourFork.json"); // open the input file
		
		AllModules allModulesList = gson.fromJson(reader, new
		TypeToken<AllModules>(){}.getType()); // deserialize the JSON data into a
		reader.close();
		
		
	}
	
	
	
}
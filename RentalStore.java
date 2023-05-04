package MovieRentall;

import java.util.ArrayList;
import java.util.List;

public class RentalStore {
	private List<Customer> RegisteredPpl = new ArrayList<Customer>();
	private List<Movie> MovieList = new ArrayList<Movie>();
	
	void Register(Customer customer) {
		RegisteredPpl.add(customer);
		
	}
	void AddMovie(Movie movie) {
		MovieList.add(movie);
	}
	void RemoveMovie(Movie movie) {
		int i ;
		for(i = 0 ; i < MovieList.size() ; i++) {
			if(MovieList.get(i).equals(movie)) {
				MovieList.remove(i);
			}
		}
	}
	public List<Movie> GetAvailableMovies() {
		List<Movie> AvailableMovieList = new ArrayList<Movie>();
		for(int i = 0 ; i < MovieList.size() ; i++) {
			if(MovieList.get(i).IsAvailable()) {
				AvailableMovieList.add(MovieList.get(i));
			}
		}
		return AvailableMovieList;
	}
	void RentMovie(Movie movie , Customer customer ) {
		Rental rental = new Rental(movie , customer);
		movie.SetAvailable(false);
		customer.AddRental(rental);
		
	}
	
	void ReturnMovie(Rental rental) {
		Movie movie = rental.GetMoive();
		Customer customer = rental.GetCustomer();
		movie.SetAvailable(true);
		for(int i = 0 ; i < customer.GetRental().size() ; i++) {
			if(customer.GetRental().get(i).equals(rental)) {
				customer.GetRental().remove(i) ;
			}
		}
	}
	
	public Customer GetCustomerBtID(int ID ) {
		for(int i = 0 ; i < RegisteredPpl.size() ; i++ ) {
			if(RegisteredPpl.get(i).GetID()== ID) {
				return RegisteredPpl.get(i);
			}			
		}
		return null;
		
	}
	
	public Movie GetMovieByID(int ID) {
		for(int i = 0 ; i < MovieList.size() ; i++ ) {
			if(MovieList.get(i).GetID()== ID) {
				return MovieList.get(i);
			}			
		}
		return null;
		
	}
	
	void ShowMovieList() {
		for(Movie movie : this.GetAvailableMovies()) {
			System.out.println(movie.ShowMovie()); 
		}
	}
	
	public List <Movie> GetMovieList(){
		return MovieList;
	}
	
}

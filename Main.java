package MovieRentall;
import java.util.Scanner;
public class Main {
	static RentalStore rentalStore = new RentalStore();
	static Customer customer;
	static Rental rental;
	public static void main(String[] args) {
		Movie harrypotter = new Movie("harrypotter" , "fantasy" , "mmd ","idk" , "idk");
		Movie shawshang = new Movie("btbbtb" , "fadbtbdy" , "mdtbdd ","idbdk" , "idtbdbk");
		rentalStore.AddMovie(harrypotter);
		rentalStore.AddMovie(shawshang);
		boolean quit = false ;
		while(!quit) {
			System.out.println("welcome to movie rental store \n what I can do for you ?");
			System.out.println("1)Register    2)Rent a movie    3)Return a movie \n 4)add movie  5) see movie by id   6)see customer with id \n 7)remove movie    8)quit");
			String n ; 
			Scanner s = new Scanner(System.in);
			boolean accepted = false ;
			while(!accepted) {
				n = s.nextLine();
				int num =Integer.parseInt(n);
				switch(num) {
				case 1 :
					Register();
					accepted = true;
					break;
				case 2 :
					RentMovie();
					accepted = true;
					break;
				case 3 :
					ReturnMovie();
					accepted = true;
					break;
				case 4 :
					AddMovie();
					accepted = true;
					break;
				case 5:
					ViewMovieByID();
					accepted = true ;
					break;
				case 6:
					ViewCustomerByID();
					accepted = true ;
					break;
				case 7:
					RemoveMovie();
					accepted = true ;
					break;	
				case 8:
					quit = true ;
					accepted = true ;
					break;
				default :
					accepted = false ;
					break;
				}
			}
		}
		
		
		
	}
	
	
	
	static void Register() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		System.out.println("Enter your email : ");
		String email = s.nextLine();
		System.out.println("Enter your phone : ");
		String phone = s.nextLine();
		System.out.println("Enter your address : ");
		String address = s.nextLine();
		customer = new Customer(name , email , phone , address);
		rentalStore.Register(customer);
		System.out.println("You registered secssusfully");
		
	
	}
	
	static void RentMovie() {
		rentalStore.ShowMovieList();
		System.out.println("Enter the title of the Movie");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		for(int i = 0 ; i < rentalStore.GetAvailableMovies().size() ; i++) {
			if(rentalStore.GetAvailableMovies().get(i).GetTitle().equals(name)) {
				Movie movie = rentalStore.GetAvailableMovies().get(i);
				rental = new Rental(movie ,customer );
				customer.AddRental(rental);
				movie.SetAvailable(false);
			}
		}
	}
	
	static void ReturnMovie() {
		System.out.println("Enter the title of the Movie");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		for(int i = 0 ; i < customer.GetRental().size() ; i++) {
			if(customer.GetRental().get(i).GetMoive().GetTitle().equals(name)) {
				Rental rental = customer.GetRental().get(i);
				rental.GetMoive().SetAvailable(true);
				double fee = rental.CalculateLateFee(5);
				customer.GetRental().remove(i);
				System.out.println("your late fee" + fee);
			}
		}
	}
	static void AddMovie() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter title : ");
		String title = s.nextLine();
		System.out.println("Enter director : ");
		String director = s.nextLine();
		System.out.println("Enter genre : ");
		String genre = s.nextLine();
		System.out.println("Enter cast : ");
		String cast = s.nextLine();
		System.out.println("Enter release date : ");
		String releaseDate = s.nextLine();
		Movie movie = new Movie(title , genre , director , cast , releaseDate);
		rentalStore.AddMovie(movie);
		System.out.println("Movie was secuessfully added");
	}
	static void RemoveMovie() {
		System.out.println("Enter the title of the Movie");
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		for(int i = 0 ; i < rentalStore.GetMovieList().size() ; i++) {
			if(rentalStore.GetMovieList().get(i).GetTitle().equals(name)) {
				Movie movie = rentalStore.GetMovieList().get(i);
				rentalStore.RemoveMovie(movie);
			
			}
		}
	}
	static void ViewMovieByID() {
		
	}
	static void ViewCustomerByID() {
		
	}
}

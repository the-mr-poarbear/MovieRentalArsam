package MovieRentall;
import java.util.Scanner;
public class Main {
	static RentalStore rentalStore = new RentalStore();
	static Customer customer;
	static Rental rental;
	public static void main(String[] args) {
		Movie harrypotter = new Movie("harrypotter" , "fantasy" , "mmd ","idk" , "idk");
		Movie shawshang = new Movie("btbbtb" , "fadbtbdy" , "mdtbdd ","idbdk" , "idtbdbk");
		rentalStore.AddItem(harrypotter);
		rentalStore.AddItem(shawshang);
		boolean quit = false ;
		while(!quit) {
			System.out.println("welcome to movie rental store \n what I can do for you ?");
			System.out.println("1)Register    2)Rent an item    3)Return an item \n 4)add item  5) see item by id   6)see customer with id \n 7)remove item    8)quit");
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
					RentItem();
					accepted = true;
					break;
				case 3 :
					ReturnItem();
					accepted = true;
					break;
				case 4 :
					AddItem();
					accepted = true;
					break;
				case 5:
					ViewItemByID();
					accepted = true ;
					break;
				case 6:
					ViewCustomerByID();
					accepted = true ;
					break;
				case 7:
					RemoveItem();
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
		rentalStore.Register(customer);
		System.out.println("You registered secssusfully");
		
	
	}
	
	static void RentItem() {
		rentalStore.ShowItemList();
		System.out.println("Enter the number of the item");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		rentalStore.RentItem(rentalStore.GetAvailableItems().get(num - 1) , customer); 
	}
	
	static void ReturnItem() {
		customer.ShowRental();
		System.out.println("Enter the number of the item");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		rentalStore.ReturnItem(customer.GetRental().get(num - 1));		
		
	}
	static void AddItem() {
		System.out.println("what tou want to add ? /n 1) movie   2) book   3)game  ");
		Scanner n = new Scanner(System.in);
		int num = n.nextInt();
		switch (num) {
		case 1 :
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
			rentalStore.AddItem(movie);
			System.out.println("Movie was secuessfully added");
			break;
		case 2 :
			Scanner c = new Scanner(System.in);
			System.out.println("Enter title : ");
			String titleB = c.nextLine();
			System.out.println("Enter author : ");
			String author = c.nextLine();
			System.out.println("Enter genre : ");
			String genreB = c.nextLine();
			String releaseDateB = c.nextLine();
			Book book = new Book( titleB ,  releaseDateB ,  genreB ,  author);
			rentalStore.AddItem(book);
			System.out.println("Book was secuessfully added");
			break;
		case 3 :
			Scanner d = new Scanner(System.in);
			System.out.println("Enter title : ");
			String titleG = d.nextLine();
			System.out.println("Enter genre : ");
			String genreG = d.nextLine();
			String releaseDateG = d.nextLine();
			String companyG = d.nextLine();
			Game game = new Game(  titleG ,  releaseDateG ,  genreG ,  companyG );
			rentalStore.AddItem(game);
			System.out.println("Game was secuessfully added");
			break;
		default:
			
		}
		
	}
	static void RemoveItem() {
		rentalStore.ShowItemList();
		System.out.println("Enter the number of the item");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		rentalStore.RemoveItem(rentalStore.GetItemList().get(num-1));
	}
	static void ViewItemByID() {
		System.out.println("Enter ID of the Item");
		Scanner s = new Scanner(System.in);
		int ID = s.nextInt();
		System.out.println(rentalStore.GetItemByID(ID).Show()); 
	}
	static void ViewCustomerByID() {
		System.out.println("Enter ID of the Customer");
		Scanner s = new Scanner(System.in);
		int ID = s.nextInt();
		System.out.println(rentalStore.GetCustomerByID(ID).Show()); 
	}
}

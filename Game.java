package MovieRentall;

public class Game extends Item {
	
	String company ;
	
	public Game( String title , String releaseDate , String genre , String company ) {
		this.title = title ;
		this.releaseDate = releaseDate;
		this.genre = genre ;
		this.company = company;
		ID = GenerateRandomID();
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " release date : " + releaseDate + "company" + company;
	}
}

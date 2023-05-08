package MovieRentall;

public class Book extends Item {
	
	private String author;
	
	public Book( String title , String releaseDate , String genre , String author ) {
		this.title = title ;
		this.releaseDate = releaseDate;
		this.genre = genre ;
		this.author = author;
		ID = GenerateRandomID();
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " release date : " + releaseDate + "author" + author;
	}

}

package MovieRentall;

public class Movie extends Item {

	private String director;
	private String cast;
	Movie(String title,String genre,String director,String cast,String releaseDate){
		this.title = title ;
		this.genre = genre ;
		this.director = director;
		this.cast = cast;
		this.releaseDate = releaseDate;
		ID = GenerateRandomID();
		
	}
	
	
	public String GetCast() {
		return cast;
	}
	
	public String GetDirector() {
		return director ;
	}
	
	String Show() {
		return " title : " + title + " genre : " + genre + " director : " + director + " release date : " + releaseDate ; 
	}
	
}

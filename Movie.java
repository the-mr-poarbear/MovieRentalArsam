package MovieRentall;

public class Movie {
	private String title ;
	private String genre;
	private String director;
	private String cast;
	private String releaseDate;
	int ID;
	private boolean isAvailable ;
	private int instanceID = 0;
	Movie(String title,String genre,String director,String cast,String releaseDate){
		int ID = instanceID;
		AddID();
	}
	
	private void AddID() {
		ID++;
	}
	
	public int GetID(){
		return ID;	
	}
	public String GetTitle() {
		return title;
	}
	public String GetGenre() {
		return genre;
	}
	public String GetCast() {
		return cast;
	}
	public String GetDirector() {
		return director ;
	}
	public String GetReleaseDate() {
		return releaseDate;
	}
	public boolean IsAvailable() {
		return isAvailable;
	}
	void SetAvailable(boolean status){
		isAvailable = status ;
	}
	
	String ShowMovie() {
		return " title : " + title + " genre : " + genre + " director : " + director + " release date : " + releaseDate ; 
	}
	
}

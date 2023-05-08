package MovieRentall;

import java.util.Random;

public abstract class Item {
	Random random = new Random();
	protected String title ;
	protected String genre;
	protected String releaseDate;
	protected boolean isAvailable ;
	int ID;
	
	public String GetTitle() {
		return title;
	}
	
	public String GetGenre() {
		return genre;
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
	
	public int GetID(){
		return ID;	
	}
	
	abstract String Show();
	
	int GenerateRandomID() {
		return random.nextInt();
	}
	
	
}

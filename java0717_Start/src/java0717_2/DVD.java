package java0717_2;

public class DVD extends Media {
	private String director;
	
	public DVD(String id, String title, String director) {
		super(id, title);
		this.director = director;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}

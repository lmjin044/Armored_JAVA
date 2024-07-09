package java0709;

public class Game {
//게임 제목, 장르(액션, 롤플레잉, fps등), 플랫폼(pc, 플4, 스위치, 엑박 등)
	
	private String name;
	private String genre;
	private String flatporm;
	
	public Game() {}
	public Game(String name, String genre, String flatporm) {
		this.name = name;
		this.genre = genre;
		this.flatporm = flatporm;
	}
	
	@Override
	public String toString() {
		return name+", "+genre+", "+flatporm;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getFlatporm() {
		return flatporm;
	}
	public void setFlatporm(String flatporm) {
		this.flatporm = flatporm;
	}
	
}

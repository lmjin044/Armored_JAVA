package java0709;

public class Game {
//���� ����, �帣(�׼�, ���÷���, fps��), �÷���(pc, ��4, ����ġ, ���� ��)
	
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

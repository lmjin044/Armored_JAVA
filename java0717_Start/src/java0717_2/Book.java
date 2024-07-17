package java0717_2;

public class Book extends Media{
	private String author;	//저자
	
	public Book(String id, String title, String author) {
		super(id, title);
		//부모클래스에서 형성한 메서드와 변수, 그리고 여기서 생성한 변수까지 
		//()안에 밀어넣고, 부모에게서 물려받았다는 내용을 super 안에 넣으면 되거든
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

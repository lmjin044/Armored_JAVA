package Modifier;

public class book {
	public static int count=0;
	
	private String title;
	private String author;
	private int page;
	
	
	public book() {}
	public book(String title, String author, int page){
		this.title = title;
		this.author = author;
		this.page = page;
		
	}
	@Override
	public String toString() {
		return this.title+" "+this.author+" "+this.page;
	}
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		book.count = count;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
}

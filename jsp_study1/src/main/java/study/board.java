package study;

public class board {
	private String title;
	private String writer;
	private String content;
	private int hit;

	public board() {}
	public board(String title, String writer, String content, int hit) {
		this.title=title;
		this.writer=writer;
		this.content=content;
		this.hit=hit;
	}
	
	
	public String getTitle() {
	return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

}
	
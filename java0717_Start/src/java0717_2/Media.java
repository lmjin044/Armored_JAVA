package java0717_2;

public class Media {
	private String id;//도서, dvd 번호
	private String title;//도서, dvd 제목
	
//	public Media() {} //원래는 생성자 메서드를 생성해야 하는데 이번엔 안 함
	public Media(String id, String title) {
		this.id = id;
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+
				"번호 : "+id+ ", 제목 : "+title;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}

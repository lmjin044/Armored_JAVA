package java0717_2;

public class Book extends Media{
	private String author;	//����
	
	public Book(String id, String title, String author) {
		super(id, title);
		//�θ�Ŭ�������� ������ �޼���� ����, �׸��� ���⼭ ������ �������� 
		//()�ȿ� �о�ְ�, �θ𿡰Լ� �����޾Ҵٴ� ������ super �ȿ� ������ �ǰŵ�
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}

package java0709;

public class Movie {
	//�ν��Ͻ� ������ �����ڴ� private
	//�Ʒ��� �ν��Ͻ� ������.
	private String title;	//��ȭ����
	private String director;//����
	private int viewAge;	//���� ����
	
	//private ������ �ν��Ͻ������� ���� get, set �޼��� ����?
	//�� ���� �ۼ� �� ��Ŭ�� > source > generate getters and setters
	// > ���� ���� �� generate
	
	//private �����ڴ� Ŭ���� ����(�ش� �߰�ȣ ��)������ ��밡���ϱ� �����̸�
	//�޼���� ���� ������ �Ǽ��� ������ �����ϰų� ���ʿ��� �κ��� ���߱� ���ؼ���.
	//ȥ���ϸ� �� �𸦱� �ٸ� ������̶� ���� �Ѵٴ��� �ϸ�...

	//Ŭ���� ��ü���ο� �ν��Ͻ� �����͸� �����ϴ� ��� : 
	//1)set�޼��带 ���� ������ ����
	//2)������ �޼���� �����͸� ����. �Ʒ��� �� ������.
	
	public Movie(){}
		//������ �޼����� Ʋ�� ���� �����ϰ�
	public Movie(String title, String director, int viewAge){
		this.title = title;
		this.director = director;
		this.viewAge = viewAge;
	} 
	//������ �̸����� �Ű������� �����Ͽ� �ش� �Ű������� ������ ������ �޼��带 ����
	//���� �޼��忡�� �Է��ϴ� ��ҵ��� �ش� ������� �ǹ�

//�Ʒ��� ��ü�� �ν��Ͻ� ������ ���� ����ϱ� ���� �޼��� 
//����� java�� ��κ� Ŭ������ ����

	@Override
	public String toString() {
		return title+", "+director+", "+viewAge;
	}
//�̷��� �ϸ� ���� Ŭ�������� ����� ��û�� �� �� ������� ����.
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
	
	//���߿��� ���̺귯���� �̿��� ������� �ڵ� �����ǹǷ� ������ ���鿹����.
}

package java0702_2;

public class Study_0702_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 �Ʒ��� ���Ҽ� �۰����� ������ ����, �Ҽ� ��Ƚ���� ���� ����Ʈ��.
 �ش� ������ ������ �� �ִ� Ŭ������ �������ϰ� ������ �Է� �� ����Ͻÿ�.
 (�Ű����� �ִ� ������ �޼���� 2�� �̻� ���� �� ��)
 (�̸�, ����Ʈ, ���� ��)
 ��ǿ�, 4580, 4.3
 �����, 3485, 4.1
 �����, 90930, 2.7
 ������, 19200, 3.1
  
 */
	class Writter{
		String name;
		int point;
		float grade;
		
		
		Writter(String name, int point, float grade){
			this.name = name;
			this.point = point;
			this.grade = grade;
		
		}
		
	public String toString() {
		return name+"��, "+point+"��, "+grade;
	}
	//�����͸� �Է��ص� ���� ��µǵ��� �ϰ� �ʹٸ� �̷��� �� ��.
	//return ���� ���� �ؽ�Ʈ�� ó���ϴ� ����.
		
		
	}
	
	Writter writter1 = new Writter("��ǿ�", 4580, (float) 4.3f);
	Writter writter2 = new Writter("�����", 3485, (float) 4.1f);
	Writter writter3 = new Writter("�����", 90930, (float) 2.7f);
	Writter writter4 = new Writter("������", 19200, (float) 3.1f);

	System.out.println(writter1);
	System.out.println(writter2);
	System.out.println(writter3);
	System.out.println(writter4);
	
	/*	
	System.out.println(writter1.name+"���� "+writter1.point+"����Ʈ, ���� "+writter1.grade+"�Դϴ�.");
	System.out.println(writter2.name+"���� "+writter2.point+"����Ʈ, ���� "+writter2.grade+"�Դϴ�." );
	System.out.println(writter3.name+"���� "+writter3.point+"����Ʈ, ���� "+writter3.grade+"�Դϴ�.");
	System.out.println(writter4.name+"���� "+writter4.point+"����Ʈ, ���� "+writter4.grade+"�Դϴ�.");
		*/
	}
	


}

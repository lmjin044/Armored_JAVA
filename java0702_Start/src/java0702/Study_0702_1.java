package java0702;

import java.util.Arrays;

public class Study_0702_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//���� �� Ŭ���� Ÿ���� ������ ����.
//������ ������ �����͸� ����.
//Ŭ���� Ÿ������ ������ ���� = �ν��Ͻ�(or��ü)

		Member member1 = new Member();	//Ŭ������ Member �ν��Ͻ��� Member1
		Member member2 = new Member();	//������ �޼��� new Member.
			//�� ����� Ŭ������ ���� �ν��Ͻ��� ������ �޼��带 ȣ���Ѵٴ� ���.
		
		member1.name = "�̼���";
		member1.age = 20;
			//.�� ���� ������ : �ϴܿ� �ۼ��� name, age �������� ���δ�.
		member2.name = "������";
		member2.age = 34;
		
		System.out.println(member1.name);
		System.out.println(member2.age);
		System.out.println();
//-------------------------------------------------------
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "Java";
		book1.page = 495;
		
		book2.title = "�޸�����ȭ���";
		book2.page = 893;
		
		System.out.println(book1.page);
		System.out.println(book2.title);
		System.out.println();
//-------------------------------------------------------
//q. ����Ʈ���� ��ǰ��, �ü��, �޸� ũ�⿡ ���� ������ �� �ִ� 
//	 Ŭ������ ���� �� �ν��Ͻ��� ���� �� ����Ͻÿ� (����Ʈ���� 3����)
		
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.product = "����������5";
		phone1.os = "�ȵ���̵�";
		phone1.ram = "12GB";
		
		phone2.product = "iPhone15";
		phone2.os = "iOS 17.0";
		phone2.ram = "6GB";
			
		phone3.product = "ASUS ROG Ally";
		phone3.os = "Window 11 Home";
		phone3.ram = "16GB";
			
		System.out.println(phone1.product);
		System.out.println(phone2.os);
		System.out.println(phone3.ram);
		System.out.println();
//-------------------------------------------------------		
	}
}
	

		class Member{		//class= ����� ���� ������ Ÿ��, Member��� �̸��� Ŭ���� ����
			String name;	//�̸�
			int age;		//����
		}
		
//-------------------------------------------------------
		class Book{	//1)
			String title;
			int page;
		}
//-------------------------------------------------------
		class Phone{
			String product;
			String os;
			String ram;
		}
		

/*������ ���� : Ŭ����

���� : ���� ������(Ÿ��)�� ������ �� �ִ�.
�迭 : �ټ��� �����͸� ������ �� ������, ������ Ÿ���̿��� �Ѵ�.
	���� - ������ �߰��� �ܼ��ϰ� �ټ��� �����͸� ó���ϱ⿡ �ð��� �ɸ�
����ü : ���� �ٸ� ������ Ÿ���� �� ������ �� �̸����� ��� ǥ�� ����(C���)
Ŭ���� : ����ü���� ���׷��̵�� ����
	  -������ �빮�ڷ� �� ex)Scanner, String, Arrays
	  -���赵, �ؾƲ�� ���� ������ �� >> ��ü�� Ŭ������ ���� ���� ��ǰ, �ؾ
	  
	 ����
	 
	  ������ Class movie{ 
	 	���� String ����;
	 	���� String �帣;
	 	���� String ����;
	 	���� int[] ������;
	 	���� int ������;
	 	���� long �Ѽ���;
	 	
	 	}
	 	�޼���1 : ��ü ���
	 	�޼���2 : ������ ���
	 	�޼���3 : ... 
*/

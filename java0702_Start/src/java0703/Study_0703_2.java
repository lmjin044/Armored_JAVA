package java0703;

import java.util.Scanner;

//������ ��ǥ : Ŭ������ �̿��� ������� ���� 2���� �Է� �޾� ���� ����غ���! 	
public class Study_0703_2 {
	
	public static void main(String[] args) {

	Calc calc = new Calc(); 
		//Ŭ���� Calc���� �ִ� ��ü�� �ҷ�����
		//�׷��� Calc Ŭ������ �ҷ����� ���� calc�� �̸��� ������.
		//�ν��Ͻ� �޼���(or ����)�� �ν��Ͻ�(=��ü)�� ���� �����
		//Ŭ���� �޼���(or ����)�� Ŭ���� �̸����� �����.
//--------------------------------------------------------
		calc.sum(); 	 // 1) : 1)�޼��� ����
		calc.sum(40, 10);// 2) : �� ��쿡�� �̹� �����Ͱ� �ԷµǾ����� = ���� ��¸� �ϸ� ��. 
		System.out.println();
//--------------------------------------------------------
		int kor=89, eng=74, mat=43; //3)
		calc.sum(kor, eng, mat);	
		System.out.println();
//--------------------------------------------------------
		calc.easy(); //4) : ȣ���� ���ǰ� �̰� ȣ�� �����. 
					 //  = class calc �ȿ� �ִ� �ν��Ͻ� �޼��� easy�� ȣ���ض�.
		System.out.println();
//--------------------------------------------------------
		calc.view(); //5)
		System.out.println();
//--------------------------------------------------------
		calc.candy(); //6)
		System.out.println();
//--------------------------------------------------------
	testMethod test = new testMethod();	
	
		String dog = "��縮Ʈ����";
		String notice="2024-07-01";

		test.animalFarm(dog, notice);
		System.out.println();
//--------------------------------------------------------	
	//8)���ڿ� subString Ȥ�� split�� ����� ���ڿ� �޼��忡�� ��, �ϸ� ����Ͻÿ�.
		String examDate = "2024-08-13"; 
		String month= examDate.substring(5,7);
		String day = examDate.substring(8,10);
		
		test.testDate(month, day);
		System.out.println();

	//8-1)split���� �̿����� ���
		test.dayPrint(examDate);
		
		System.out.println();
		System.out.println();
//--------------------------------------------------------	
	//9) �� ����� ���� ��� ��(����)�� ���Ͽ� ����� ��
		int ���=31, ����=23, ����=28, ���=31;
		test.ava(���, ����, ����, ���);
		System.out.println();
//--------------------------------------------------------	

	}
}




//--------------------------------------------------------	
class testMethod{
//--------------------------------------------------------		
	void ava(int ���, int ����, int ����, int ���) {//9)
		int ava = (���+����+����+���)/4;
		System.out.printf("�� ����� ���� ����� %d�� �Դϴ�.", ava);
	}
//--------------------------------------------------------	
	void testDate(String month, String day) {//8)
		System.out.printf("���� ���ڴ� %s�� %s�� �Դϴ�.", month, day);
	}
	//Ȥ�� �̷��� �ص� ��.
	void dayPrint(String date) {//8-1)
		String[] dDay = date.split("-");
		System.out.printf("���� ���ڴ� %s�� %s�� �Դϴ�.",dDay[1], dDay[2]);
	}
//--------------------------------------------------------
	void animalFarm(String dog, String notice) {//7)
		System.out.println("ǰ�� : " + dog);
		System.out.println("�Ծ������ : "+notice);
	}
}
//--------------------------------------------------------
class Calc{
//--------------------------------------------------------	
	void candy() {//6)
		String name = "�̹���";
		int age = 30;
		System.out.println("�̸� : "+name+"/ ���� : "+age);
	}
//--------------------------------------------------------	
	void view() {//5)
		int a=10, b=20;
		System.out.println("a�� ���� "+a+"�̰� b�� ���� "+b);
	}
//--------------------------------------------------------	
	void easy() {//4)
		System.out.println("�޼��� �󽱳�");
	}
//--------------------------------------------------------		
	void sum(int k, int e, int m){//3)
		int result = k+e+m;
		System.out.println("�� ���� ���� : " + result);
		}
//--------------------------------------------------------	
	void sum(int num1, int num2) {//2)
		//�� �� ��쿡�� �Ű������� �޴� ���
		int result =num1+num2; 
		System.out.println("�ι�° ����� �� : "+result);
	}
//--------------------------------------------------------	
	void sum(){//1)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է��ϼ��� >> ");
		int num1 = scan.nextInt();
		
		System.out.println("�� ��° ������ �Է��ϼ��� >> ");
		int num2 = scan.nextInt();
		
		int result = num1+num2;
		System.out.println("ù��° ����� �� : "+result);
	}
}
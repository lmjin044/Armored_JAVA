package java0626;

import java.util.Scanner;

public class Study_0626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ڹ����");
			//system.in : �Է�
			//�Է¹޴� ���� Ŭ���� : Scanner
		
		Scanner scan = new Scanner(System.in);
			//�� import�� �̿��� ��� ������ ����� ��.
			//������ �Է��� �� ���� Scanner �Ʒ� ���� ���� �� ������ �װ��� Ŭ���� import 'Scanner'Ŭ��
		
		//int a = scan.nextInt();
			//float Ÿ�� : nextFloat();
			//double Ÿ�� : nextDouble();
			//byte Ÿ�� : nextByte();
			//short Ÿ�� : nextShort();
			//�� ���� ���� �޼ҵ� ������δ� '����' ����� ����.
			//	>> nextLine, next()�� ����'��'�� ����
		
		//System.out.println(a);
		
	//int ramen, kimbob, milk;

	//System.out.print("��Զ�� ���� : ");
	//ramen = scan.nextInt();
	//System.out.print("�ﰢ��� ���� : ");
	//kimbob = scan.nextInt();
	//System.out.print("�ٳ������� ���� : ");
	//milk = scan.nextInt();
	
	//int total = ramen+kimbob+milk;
	//System.out.println("���ɰ� : "+total+"��");
		//Ȥ�� : system.out.printf("���ɰ� : %d�� \n", ���ұݾ�);
		
		
	int floor = 5;
	float sec = 3.4f;
	int dbway = 4;
	
	float total = (floor-1)*sec*dbway;
	
	System.out.println(total);
	
	/*
	 ���α׷� �ۼ� �� : 
		1) ���������� ���� �Ǵ� ���� �⺻�̴�.
		2) ���� ���� ����� ����
			-int num : ���� Ÿ�� ����
			-double dnum : �Ǽ� Ÿ�� ����
			-char ch : ���� Ÿ�� ����
			-boolean bool : �� ���� ����
		3) ���� �ʱ�ȭ
			int num =10; << ���� ����� �Բ� �����͸� ����
		4) ��� : 
			System.out.println(��³���);
			System.out.print(��³���);
			System.out.printf(��³���);
			 - printf�� ��� ����������(%d ��)�� �Բ� ����� �� �ִ�.
			 - �� ���� : ����(d, u), �Ǽ�(f), ����(c), s(���ڿ�)
			 - ���� ;
			 int age = 28;
			 System.out.printf("%s������ �ִ� %d�� %c��", "�ڵ���", age, "��");
			 
		5) �Է� ��� :
			Scanner Ŭ���� ��ü�� �ʿ�
			Scanner�� ���� �ܺ�Ŭ�����̹Ƿ� import ��Ұ� �ʿ���
			Scanner ���� = new Scanner(System.in);
				����.next~? : Int() int Ÿ�� / Byte() byte Ÿ��
							 Short() short Ÿ�� / Long() long Ÿ��
							 	������ ������ �Է�
							 Float() float Ÿ��/ Double() double Ÿ��
							 	�� ���� �Ǽ��� �Է�
							 () �׷��ϱ� �׳� next(); / Line();
							 	�� ���� ���ڿ� �Է�
							 ��'����' ��ü�� �Է� �� ��!
							 
		���� ����� ���� �� ����
		
	 
	 */
	
	
	
	}
}

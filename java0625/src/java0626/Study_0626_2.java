package java0626;

import java.util.Scanner;

public class Study_0626_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
		String name = new String();
		name = scan.nextLine();

		String part = new String();
		part = scan.next();

		int money;
		float pay = 0.08f;
		
		money = scan.nextInt();
		
		float loss = money*pay;
		float after = money-loss;
		
System.out.println(part+"�μ� "+ name+" ������� �ݿ� �� ���ɾ��� "+after+"���� �Դϴ�.");
		//part�� ���� �ߴ��� ���� ó�� ������ name ���� �߱� ������ �Է��� name���� �޴´�.
		*/
		
		String name, dept;
		int money;
		float tex = 0.08f;
		
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("�μ� : ");
		dept = scan.nextLine();
		
		System.out.print("�� �޿� : ");
		money = scan.nextInt();
		
		int salary = (int)(money-(money*tex));
			//������� ���� �κ��� �����̱� ������ int�� ���� �� ����
			//��������ȯ : �� ��츦 ���÷� �����.
			//Ÿ�Ը� ������ = (��ȯ�ϰ��� �ϴ� Ÿ��)(��� ����);
			//�������� �Ǽ��� �ڵ����� ���������� �Ǽ����� �����δ� ����ȯ �ʿ�
		
		
		//�ƴ� �� Ŀ���� �ȵǴ°žߤ�����������
		//�� ������ Ŀ��©�� �Ǿ�����ääää�
	}

}

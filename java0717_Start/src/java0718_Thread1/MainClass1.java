package java0718_Thread1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MyThread th = new MyThread(); //����� ��ü ����	
	//�̴�θ� �ϸ� �����尡 ������� �ʾƼ� ���� ������ �Ʒ� �޼��带 �߰��ؾ� �Ѵ�.
	th.start();
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("���� �Է� : ");
//	int num = sc.nextInt();
//	System.out.println(num);
//		//�Է��� �Է´�� �ϰ� �ݺ����� �ݺ������ ��µǴ� ������.
		
		
	}
}


class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+"��° �ݺ��ϴ� ���� �������Դϴ�.");
		try {	//�̷��� �ϸ� 1�ʿ� 1���� ����� ������.
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}	
	
	

/*
���μ��� = cpu�� ���� ram�� �ε� �Ǿ��ִ� ���α׷�
	  = �������� ���α׷��� ����ִ� ��
	  = 102���� ���μ����� �� 102���� �������� ���α׷��̶�� ��.
 �ؽ��� �� ���μ��� Ȯ���ϴ� ���
 	1)�۾������ڿ��� '���μ���' �� ����
 	2)���������Ʈ�� ������ cmd�� �Է��� �� tasklist �Է�.
 		�����μ��� ����� taskkill Ȥ�� pid[pid��] �Է��ص� ��
 
 ������ = ���μ��� �ȿ��� ���� ������ �����ϴ� ����
      = ������ �߰��ϸ� ������ ���� ������ ������ �� �ִ�.
   - �ڹ� �������� ������ ������ ����ϴ� ���
   	1) Thread() : ���ο� ������ ��ü �Ҵ�.
   	2) Thread("�̸�") : ���ο� ������ ��ü�� �Ҵ��ϸ鼭 �̸��� �ο�
*/
package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String>st = new Stack<>();
//		
//		st.add("�̼���");		
//		st.push("������");	//stack ���� �޼���.
//		st.push("������");
//		st.push("�庸��");
//		st.push("������");
//		
//		System.out.println(st);	
//			//�迭�� �������� ��µ� = 0~4�� �ε���.
//			//�̼����� ���� �Ʒ��� ����Ǿ� ����.
//		System.out.println(st.pop());
//			//���� ��� �޼���. ���� ���� �ִ� ���� �����°�.
//		System.out.println(st);
//			//�׷��� �� �������� �ٽ� Ȯ���ϸ� ��µ� �������� �迭���� �����.
//		System.out.println(st.search("������"));
//			//�����ߴ� 2�� �ε���(3���ڸ�)�� ������ Ȯ��.
//		System.out.println(st.size());
//			//st.size�� ������ �ε��� ũ�⸦ Ȯ���ϴ°�.
//			//���� '������'�� �������� pop�޼��带 �� �� �����ؾ� �ϴ��� �˾ƾ� ��.
//		
//		System.out.println(st.isEmpty());
//			//��� ������ true, �ƴϸ� false�� ����ϴ� �޼���.
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		
		String now = "���̹�";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�̵������� �Է� (1. ��, 2. ��)");
			String temp = sc.nextLine();
			if(temp.equals("1")&& !back.isEmpty() ) {	//���� ������ �̵�
				pre.push(now);	//���� �������� ���� ���ÿ� ����.
				now = back.pop();
				
			}else if(temp.equals("2")&& !pre.isEmpty()) {//�� ������ �̵�
				back.push(now);
				now = pre.pop();
				
			}else if(!(temp.equals("1") || temp.equals("2") )){	//�� ������ �̵�
				back.push(now);
				pre.clear();	//������ ���� �޼���(Ŭ������ Vector)
				now = temp;
			}
			System.out.println("���� ������ : " + now);
			System.out.println("back ������ ��� : " + back);
			System.out.println("pre ������ ��� : "  + pre);
		}
		
		
		
		
		
		
		
		
		
	}

}

/*
Stack? : �Ա�(������ ����)�� �ⱸ(���)�� ����.
 		 �� ������ ����� ����� �̷������ ����.
 		 FILO = First In Last Out
 		      = ���� ó���� ���� ���� ���� �������� ������.
 		      = �������� �Է��� �̸� �����ϼ��� ��� ������ ���� ������.
	

*/
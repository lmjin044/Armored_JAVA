package java0627;

import java.util.Scanner;

public class Study_0627_1 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	//���ǹ� : if, switch
	//if���� ���ǽ� : �񱳿����ڿ� �������ڷ� ���� ������
	//			   �̻�~����(<= , >=), ��ġ(==)
	//			   �� ���� �������� ���� �� �ִ� ���� �ǹ�
	//	���� : '�Ǹ����� ��ǰ�鸸 ����Ѵ�'�� �ϸ� >> ��ǰ���� == �Ǹ�, ������>0 ���� ����. 
	
	int tall = 135;
	if(tall>=150){
		//Ű�� 150�̻��� ��� ������ �� ���ΰ�?
	}else {
		//Ű�� 150�� �ƴ϶�� ������ �� ���ΰ�?
	}
	
	//���� : �հ�(60�̻�), ���հ�(60�̸�)
	/*
	score = 72;
	if(score >=60) {
		System.out.print("�հ��Դϴ�.");
	}else {
		System.out.print("���հ��Դϴ�.");
	}
	//�ϳ��� ���ǿ� 2���� ������ ���� �� ����սô�.
	
	score = 89;
	if(score>=90) {
		System.out.print("a");
	}else if(score>=80){
		System.out.print("b");
	}else {
		System.out.print("c");
	}
	*/
	//90���� �۰�(ù��° ������ ����) 80���ٴ� Ŭ ��(�ι�° ������ ��) b�� ���
	//80�̸��̸� (�� ���� ��� ����) c�� ���

	//���� : A��� �̻� = 90�̻�, B��� = 80�̻�, C��� = 70�̻�, �ƴϸ� D�� ���
	
	System.out.print("���� : ");
	int level = scan.nextInt();
	if(level>=90) {
		System.out.print("A����Դϴ�.");
	}else if(level>=80) {
		System.out.print("B����Դϴ�.");
	}else if(level>=70) {
		System.out.print("C����Դϴ�.");
	}else {
		System.out.print("D����Դϴ�.");
	}
	

	//switch ���� ���� �˾ƺ���.
	//���� ������ case�� ������ case�� ��ġ�ϴ� ���� ��� �ߵ��Ǵ� ���ǹ�
	//������ũ ���� �����
	//	�̵� : w(��), a(��), s(�Ʒ�), d(����)
	//	��Ÿ : p(�Ͻ�����), o(����ϱ�), i(ó������ �ٽý���), ctrl+s(����)
	/*
	switch(Ű���尪) {
		case 'w' :
		case 'a' :
		case 's' :
		case 'd' :
		case 'p' :
		case 'o' :
		case 'i' :
		case 'ctrl':
			switch(Ű2) {
				case 's' :
			}
		}	
		switch(menu) {
			case "open" :
			case "save" :
			case "build" :
			case "git" :
			case "exit" :
		}
	*/
		//���ǽ� �����ڿ� == �� ���ȴٸ� switch�� ���� �ɼ��� �� �� �ִ�.
	
		String button = "����";
		
		switch(button) {
			case "����" :
				System.out.println("���� ����");
				break;
			case "�ڵ�����" :
			case "����" :
				System.out.println("���� ����");
				break;
			case "����" :
				System.out.println("���� ����");	
		}
		
		//����, ������ ���̸� Ű����� �Է��Ͻÿ�
		//�� �� �ϳ��� ���������� ũ�� �����簢��
		//���ο� ������ ���̰� ���ٸ� ���簢������
		//�� if���� �ƴ� switch������ �� ��.
		
		int width = 0;
		int height = 0;
				
		System.out.print("������ ���̴� : ");
		width = scan.nextInt();
		System.out.print("������ ���̴� : ");
		height = scan.nextInt();

		int res = width - height; 
		
		switch(res) {
			case 0:	
				System.out.println("���簢��");
				break;
				//���ο� ���ΰ� ���ٸ� ������ ���� �� 0�� ����
			default :	
			 //default = switch������ 1���� ��밡��
			 //		     switch������ case�� ��ġ�ϴ� ���� ���� �� �����
			 //			 �־��� case�� ��ġ�ϴ°� ���� �� default�� ���� ��, �����
			 //			 �׷��� switch�� �� �������� ��ġ(break�� �� ��)
				System.out.println("�����簢��");
				//���ο� ���ΰ� �ٸ��Ƿ� ������ ���� �� 0�� �ƴ� ���� ����
				//res�� Ÿ���� int�� �����߱� ������ !0(=0�� �ƴϴ�)�� �����Ϸ��� �ص� �ȵ�
				
		}
				
		
		
		
	}
		
	
	
	
	
	
	
	}

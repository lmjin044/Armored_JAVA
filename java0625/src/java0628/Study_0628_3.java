package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class Study_0628_3 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//���ڹ迭�� �����ϴ� ������ �ǸŰ��� Ű����� �Է��Ͽ� ������ ��
	//����� �ǸŰ����� ���հ� ����� ���Ͻÿ�.
	/*
	int[] snack= new int[5];
	for(int i=0; i<snack.length; i++) {
		System.out.print((i+1)+"��° ���� ������ : ");
		snack[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i=0; i<snack.length; i++) {
		sum = sum + snack[i];
	}
	
	int ava = sum/snack.length;

	System.out.printf("���ڰ� ������ %d��, ���ڰ� ����� %d�� �Դϴ�.", sum, ava);
	//������ tall �迭�� 6���� Ű�� ������ ���̴�.
	//Ű�� 175�̸��� ��츦 ����Ͻÿ�.
	float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
	
	for(int i=0; i<tall.length; i++) {
		if(tall[i]<175)
			System.out.println(tall[i]);
		//
	}
	
	//���� : name �迭�� ���ڿ� ��, �̼���, ������, ������, �ֿ��� first �迭�� �����ϰ� ����Ͻÿ�.
	String[] name = new String[] {
			"�̼���", "������", "�庸��", "�̼���", "������", "������", "�ֿ�", "�縸��"};
	
	String[] first = new String[4];
	
	System.arraycopy(name, 3, first, 0, 4);
		//�ε��� 3��(=4��°) �ڸ��� �̼��谡 �ְ�
		//�̼��踦 �������� first�� 0��(=1��°) �ڸ����� 4���� �����͸� �����Ѵٴ� �Ҹ�
	System.out.println(Arrays.toString(first));
	
	String word = "I like banana.";
	System.out.println(word.indexOf("i"));
		//indexOf = ���ڿ����� Ư�� ����~���ڿ��� ��ġ ã��(�ε��� �������)
		//			��ҹ��ڸ� �����ϹǷ� ���� i���� �빮�� I�� 0, �ҹ��ڴ� 3�� ����
		//			���⵵ �迭�� ���ϱ� ������ �� �� ���� �ؾ� ��.
	
	System.out.println(word.contains("bn"));
		//contains = ���ڿ����� Ư�� ����~���ڿ��� ���� ����
		//			 b�� n�� banana �ȿ� ������ �̰� �پ� �ִ� ���ظ� �˾ƺ�.
	
	String[] a = new String[] {"banana", "orange"};
	a[0].indexOf("na");	
	a[1].indexOf("ge");
	
	
	String[]t =new String[] {
			"������", "�Ѽ���", "�縸��", "������", "������",
			"�����", "�̼���", "�̻��", "�̻��", "�Ѱ���"};
	
	System.out.print("�̸� �˻� : ");
	String search = scan.nextLine();
	
	for(int i=0; i<t.length; i++) {
		if(t[i].contains(search)) {
			System.out.println("�˻� ��� : "+t[i]);
		}
	}
	*/	
	//���� : ���Ḧ �˻��Ͽ� �� ������ �̸��� �ݾ��� ��µǵ��� �Ͻÿ�. 
	
	String[] menu = new String[] {
			"�Ƹ޸�ī�� : 2000��", "ȭ��Ʈ �Ƹ޸�ī�� : 2800��", "ī��� : 3000��", 
			"��ü�� : 3800��", "ī���ī : 3800��", "�����ֽ� : 4000��", 
			"��� ���̽�Ƽ : 2900��", "������ ���̽�Ƽ : 2800��", "�ڵ� ���̽�Ƽ : 2800��",
			"���ڿ��̵� : 3500��", "�����̵� : 3500��", "û�������̵� : 3500��"
			};
	
	System.out.print("���� �˻� : ");
	String find = scan.nextLine();
	
	boolean isDrink = true;	//isDrink��� ������ ���� ��츦 ������. 
	for(int i=0; i<menu.length; i++) {
		if(menu[i].contains(find)) {
			System.out.println(menu[i]);
			isDrink=false;
		}
		
		
		}if(isDrink) {//���̸� �������� �ʴ´ٴ� �ǹ�
			System.out.print("�˼��մϴ�. �غ��� �Դϴ�.");
		
		
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}

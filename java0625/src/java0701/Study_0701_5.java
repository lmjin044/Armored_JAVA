package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class Study_0701_5 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

/*
 String Ŭ���� : 
  - �ڹٿ��� ���ڿ��� ����ϰ��� �ϸ� �̰� �̿��ؾ� �Ѵ�
  - ���������� char �⺻ ������Ÿ��(*�����迭�̴�)�� �迭�� ������
  - ���α׷��� 70% �̻��� �����ϴ� ���� ���ڿ� �������̹Ƿ� �ݵ�� ������ ��
*/
		
String word = "I like banana";

System.out.println(word);

//(�߿�!!)1)���ڿ� ���ϱ� : equals
System.out.println("equals : "+word.equals("i like orenge"));
	//�� ���縵�� ��ġ���θ� ������ ���� �ƴ϶� ��ü���� ���ڿ� �񱳸� �ϱ⿡ ������� false�� ����

//(�߿�!!)2)���ڿ� ���Կ��� : contains
System.out.println("contains : "+word.contains("banana"));
	//word�� ����� ���ڿ��� banana�� �ִ����� Ȯ���ϰ� ������ true, ������ false�� ����

//3)���� �ٸ� ���ڿ� ��ġ�� : +, .concat()
System.out.println(word+"��ġ��");
	//������ ���ڿ� ������ �� Ȥ�� �ڷ� +"������ �ϴ� �ؽ�Ʈ"�� �̿��ϸ� �ȴ�.
System.out.println(word.concat("��ġ��"));
	//Ȥ�� .concat("�߰��ϰ��� �ϴ� �ؽ�Ʈ")�� �̿��ص� �ȴ�.

//4)Ư�� ����(��)�� ��ġ ã�� : indexOf
System.out.println("indexOf : "+word.indexOf("orange"));
	//word�� ����� ���ڿ��� orange�� �ִ����� Ȯ���ϰ� ������ �ش� ���ڿ��� ���۵Ǵ� ù �ε�������, ������ -1�� ����
System.out.println("indexOf : "+word.indexOf("banana"));
	//�׷��� banana�� ���۵Ǵ� b�� �ε��� ���� 7�� ��ȯ�Ѵ�.
System.out.println("lastIndexOf : "+word.lastIndexOf("a"));
	//������ ���ڿ��� �ڿ������� ã����, �ڿ��� �����ϴ� �������� a�� �ε������� ��ȯ�Ѵ�.

//5)���ڿ����� Ư�� ���ڸ� �����ϱ� : charAt
System.out.println(word.charAt(5));
	//I like banana���� 5��° �ε����� e�� �׷��� ��µ�

	//5-1)Ű����� '����'�� �Է� �ޱ�
	//System.out.println("���ĺ� �ϳ� �Է��ϱ� : ");
	//char alp = scan.nextLine().charAt(0);
	 //0�� �ε����� �� ������ ���� �� ���� �ǹ��ϱ� ������ �Է��� ���ڿ��� charAt�� �� ���� �ε������� �����Ѵ�.
	//System.out.println("�Է��� ���� : " + alp);
			
	//char ch = 65;
	//System.out.println(ch);
	//char�� ���ڸ� �Է��ϸ� �� ���ڿ� �´� �ƽ�Ű�ڵ尡 ��µȴ�.
	
//6)���ڿ��� ���� ���� : .length()
System.out.println(".length(��ȣ�� ������ ���� ����Դϴ�.) : " + word.length());
		
//7)��-�ҹ��� ��ȯ : .toUpperCase(), .toLowerCase(); 
//				 ������ ����ڰ� �Ǽ��� �ҹ��ڷθ� �Է��ؾ��ϰų� �� �� ó���� ����
String �빮�� = word.toUpperCase();
String �ҹ��� = word.toLowerCase();

System.out.println(�빮��);
System.out.println(�ҹ���);
		
//8)�� �ڰ������� : trim() 7)�� ���������� �� �� ������ ����� �һ�� ������
String word2 = " I hate you. ";
System.out.println(word2.trim());	
		
//(�߿�!!)9)���ڿ� ���� :.split(" ")
System.out.println(Arrays.toString(word.split(" ")));
	//word�� ����� ������ ������ �������� ���� : I, like, banana 
	//Arrays.toString�� ����� ������ ������ �� �ֵ�, �ش� �޼ҵ�� ������ �迭�̴�.
String name ="�̼���@������@������@";
String[] names = name.split("@");
System.out.println(names[2]);
	//�� ������ ���� ���ڿ��� �迭�� ��ȯ�ϸ� @�� �������� ���ڿ��� ��������.
	//���� ���� �������� ���� ���ڿ��� �ƴ� �ٸ� ���ڿ��� �ڸ��ϸ� �װ� ��� �� �Ѵ�.

//10)���ڿ� �ڸ���(=����) : .substring(�ε�����ȣ);
System.out.println(word.substring(2));
	//�� ���� like banana�� ��µȴ�. : 2�� �ε������� �����
System.out.println(word.substring(6));
	//���� ������ ������ 6�� �ε������� ���������� ����ǵ��� �ϴ� ��
System.out.println(word.substring(2,6));
	//�����ϸ� ������ �ε������� ���� �ε������� �������� �� Ư�� �ܾ �����ϴ� �͵� ����

//11)���ڿ� ��ȯ : .replace(All)("�����ϰ� ���� ���ڿ�", "������ ���ڿ�",
//				-replace(); : 
//				-replaceAll; : ����ǥ���� ��� ����
/*	������ǥ���� : ���α׷��� ������ ���ڿ��� ������ ������ ǥ���ϴ� ������ ���ľ��
	 ����:
		1)^ : ���ڿ��� ����
		2)$ : ���ڿ��� ����
		3). : ������ ���� �ϳ�
		4)* : �չ����� ������ ������� �� ���ڷ� ������ �ܾ �ǹ�(ex. *�� : ���� ������ �ܾ� ����)
		5)+ : �� ���ڰ� �ϳ� �̻�
		6)? : �� ���ڰ� ���ų� �ϳ��ִ�
		7)[] : ������ ����~����
		8){} : Ƚ���� ����
		9)() :�Ұ�ȣ�� ���ڸ� �ϳ��� ���ڷ� �ν�
		10)| : ���� �ȿ��� or������ ����
		11)\s : ���鹮��
		12)\S : ���鹮�ڰ� �ƴ� ������ ����
		13)\w : ���ĺ��̳� ����
		14)\W : ���ĺ��̳� ���ڰ� �ƴ� ������ ����
		15)\d : ����
		16)\D : ���ڰ� �ƴ� ������ ����
		
		���ڿ����� ���ڸ� �����ϴ� ǥ����? : replace("[0-9]","");
		����ó ǥ�� : ^010-\d{4}-\d{4}&
		�ѱ۸� �ۼ� Ȯ�� : ^[��-Ŝ] 
*/
	String a = "abc123def456gh";
	System.out.println(a.replaceAll("[0-9]", ""));
		//�� [0-9]�ĸ� 10�������� ����ϴ� ������ ��� ������ ����. 0~9�� ����ϴ� ���ڸ� ��� �� �������� ǥ����
	System.out.println(a.replaceAll("\\d",""));
		//Ȥ�� �̷��� ǥ�����൵ �ȴ�. �� \��ü�� Ư�����ڱ� ������ \+\d��� �������� ����.
	System.out.println(a.replaceAll("\\D", ""));
		//������ �ݴ�� ���ڸ� �츮�� ����ǥ�����̴�.
	
	
	

String �ǻǻ� = "�ƺ��� ����� �� �ǻǻ� ������ �Ⱦ��൵ "+"�ǻǻ� ������ �ݰ��ٰ� �ǻǻ�";
String ���� = �ǻǻ�.replace("�ǻǻ�", "������" );
System.out.println(����);

���� = ����.replaceAll("������", "�̻̻�");
System.out.println(����);
		
		
		
		
		
		
		
		
		
		
		
	}
}

package java0701;

import java.util.Arrays;

import java.util.Scanner;

public class Study_0701_1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//�迭�� 20�� ���� ����(������ 1~30) 
		//�� �� 5����� ��ΰ�?
		
		int[] number = new int[20];//1)������ ���� 20���� ����, number�̸��� �迭�� �����
		
		for(int i=0; i<number.length; i++) {	//2)30���� ������ ���ڸ� �迭�� �ִ´�.
			number[i] = (int)(Math.random()*30)+1;			
		}
		
		int count = 0;//3)5�� ����� ī��Ʈ�Ͽ� ������ ������ ���Ѵ�.
		
		for(int i=0; i<number.length; i++) { //4)5�� ����� ���ϴ� ��
			if(number[i]%5 == 0)
				count++;
		}

		System.out.println(Arrays.toString(number));
		System.out.println("5�� ����� "+count+"��");

	}

}

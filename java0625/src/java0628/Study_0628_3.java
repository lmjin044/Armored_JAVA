package java0628;

import java.util.Scanner;

public class Study_0628_3 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//���ڹ迭�� �����ϴ� ������ �ǸŰ��� Ű����� �Է��Ͽ� ������ ��
	//����� �ǸŰ����� ���հ� ����� ���Ͻÿ�.
	
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
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

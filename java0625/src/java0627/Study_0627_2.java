package java0627;

import java.util.Scanner;

public class Study_0627_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		//�ݺ��� : for, while, do-while �� ���� �˾ƺ���.
		//���� : for(�ʱⰪ; ���ǽ�; ������){
		//			�ݺ��� ����}
		//		�����̸� �߰�ȣ{}�� ���� ���� �� ��
		//		�ݴ�� ���� ��� = 
		//			�ʱⰪ > (���ǽ� �� > �� Ȯ�� > �߰�ȣ �� ���� ���� > ������)
		//			���� ������ �� ������ ��ȣ()�� ���� �ݺ� �� ����
		int i;
		
		for(i=1; i<10; i++) {
			int k = 2*i-1;
			System.out.println(k+"�� �ݺ� ��....");
		}
		//Ȥ�� ������ for(i=1; i<=17; i+=2){~}�� �����ص� �ȴ�.
		//�ƴϸ� k�� ������ ����� �ߴµ� �� ���೻���� ���� �Űܵ� �ǰų�.
		
		/*
		int num =1;
		int a=1;

		num = num+a;
		System.out.println(num);
		a++;
		
		
		
		for(a=1; a<=3; a++) {
			num = num+a;
			System.out.println(num);
		}
		
		*/
		//1���� ���� �Է��� ������ �� ���� ���Ͻÿ�.

		System.out.println("���ڸ� �Է��Ͻÿ� : ");
		int num = scan.nextInt();
		
		int sum=0;
		for(int a=1; a<=num; a++) {
			sum = sum+a;
		}
		System.out.print("������ : "+sum);
	
	
	}
	

}

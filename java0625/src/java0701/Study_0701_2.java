package java0701;

import java.util.Scanner;

public class Study_0701_2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

/*
 �迭��.... ��������� �����͸� �����ϰ� �� �����͸� �����ϰų� ��±��� �غ���
 �迭�� ���� : (���������� �۾��Ѵٴ� ���� �Ʒ�) ����!

 ���� ����� ���� : 
 1) 25�� ũ�⸦ ������ �迭�� �����ϱ�
 2) �迭�� ������ ���ڸ� ������ ��
 	-1)���ڰ� �ߺ����� �ʵ���
 	-2)5X5 �迭�� ������ ��
 3) ���ڸ� ȭ�鿡 ���
 4) ������ ������ ���ڸ� �����Ѵ�(�Է�)
 5) ������ ���ڸ� �� ���ڰ� ��ġ�� �ڸ��� ǥ���ϱ�
 6) ���� �����Ǿ��ٸ� �� ���� �� ������ ī��Ʈ
 7) �������� ȭ�鿡 ���
 


	int[] bingo = new int[25]; //1)
	
	for(int i=0; i<bingo.length; i++) {	//2
		bingo[i] = (int)(Math.random()*50)+1;
		for(int k=0; k<i; k++) {		//2-1 
			if(bingo[k] == bingo[i]) {	//i�ε����� �ִ� ���� k�ε����� �ִ� ���� ���� ������(=�ߺ��Ǹ�)
				i--; break;				//i�ε����� ��ġ�� �ٽ� �����ϵ��� �ֻ����� i���� ��� ������ -���� �߰�
	//���򰥸��� ������, ���� �� ������ ������ ��ü�� �ٲٴ°� �ƴ϶� �����Ͱ� �ڸ��� '��ġ'�� �ٲٴ°Ŵ�.
				
			}
		}	
	}
while(true) {
	for(int i=0; i<bingo.length; i++) {		//2-2)
		if(i%5==0) {
			System.out.println();
		}
		if(bingo[i]==0)
			System.out.printf("%2c", '��');//%c�� ���� ���
		else
			System.out.printf("%2d", bingo[i]);	
	}
	
		System.out.print("\n���� ���ڸ� �Է��ϼ��� : "); //3)
		int num = scan.nextInt();				   //4)
		
		for(int i=0; i<bingo.length; i++) {
			if(num==bingo[i]) {
				bingo[i]=0; break;				//5) : �Է��� ���ڰ� ���� ������ 0���� �ٲٱ�
			}
		}
	}

	int ���� =0; 
	int ���� =0;
	int �밢��1=0;
	int �밢��2=0;
	int end=0;									//6)

	for(int i =0; i<5; i++) {
		for(int k=0; k<5; k++) {
			if (bingo[i*5+k] ==0) ����++;
			if (bingo[k*5+i] ==0) ����++;
		}
		if(bingo[i*6] ==0 ) �밢��1++;
		if(bingo[i*4+4] ==0 )�밢��2++;
		
		
		if(�밢��1 ==5) end++;
		if(�밢��2 ==5) end++;
		if(���� == 5) end++;	//���� 1���� �Ǿ��� �� end�� 1�� ����
		if(���� == 5) end++;
		
		����=0;
		����=0;
		


	if(end ==5) {
		System.out.println("5�ٺ��� �ϼ�");		//7)
		break;
	}
 */




}

}

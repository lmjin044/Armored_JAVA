package java0628;

import java.util.Scanner;

public class Study_0628_1 {
	
static Scanner scan = new Scanner(System.in);
		//�ۺ� ����ƽ ���̵� ���� �Ʒ��� ������ �ַ��� �տ� static�� �ٿ���
	public static void main(String[] args) {

		
		/*
		for(int i=1; true; i++) {
			System.out.println(i);
		}
		�̷��� ���������� 1�� �߰��Ǵ� ���ѷ��� �ߵ�(�����ؼ� ���� ���� �� ���Դ´�)
		
		�عݺ��� �ۼ� ���
			1)�ݺ����� '����'������ ���� ����ؾ� ��
			2)�� ȸ �ݺ��� �� ����Ǿ�� �ϴ��� ������ ��.
			3)for, while, do-while ��� �ݺ� ����ñ⸦ ã�� ���ϸ� �ۼ� �Ұ�
				(���ѷ���, nȸ �ݺ� ��� �ش�)
			
			���� �� ���� �������� 10000���� �ݺ��ϰ� �ʹٰ� �ϸ�?
			for(int i=1; true; i++) {
				if(i>10000) break;			<<�� ���� ������ �����ؾ� �Ѵ�.
				System.out.println(i);
			}
		
		
		
		for(;true;) {
			System.out.print("���� �Է� : ");
			int num= scan.nextInt();
			if(num == 0)break;
		}
		 
		  ���� ���� �����ϴ� ���
		  	1)if ���ǽ��� '��'�� �Ǿ��� �� break�� ����
		  	2)�ݺ����� ���ǽĿ� true ���� ���
		  	3)return ��� : �ݺ����ڵ尡 �ִ� �޼��带 �����ϹǷ� �ݺ����� ������
		  		��break : �ݺ���, switch�� ��밡��(if�� �ܵ����δ� �Ұ�)
		  		��continue : ���� �ݺ������� �Ѿ��	  		
		  
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"��° �ݺ� ����");
			if(i%3==0) continue;
			System.out.println(i+"��° �ݺ� ������");
			System.out.println(i+"��° �ݺ����� ������");
			
			�̷��� 1��° ����, ������, ������ ������ 1����Ŭ�� ������ 2, 3... ���ķε� ����
		}
		
		//�ڹ��� ����
		
		int random = (int)(Math.random()*50)+1;
			//Ÿ���� �����ؾ� �ڹٿ����� �������� ��밡��
		for(;true;) {
				//���Ƿ� 50������ �� ������ �ݺ������� ���ڸ� ����ؾ� �ϹǷ� ���ѷ����� �Ǵ�
			int num1 = (int)(Math.random()*50)+1;
				//Math.floor�� ������� �ʾƵ� ������ int�� ���� ������ ��������ȯ�� �ȴ�
				//int num1 =Integer.parseInt(Math.floor(Math.random()*50)+1);
				//parseInt�� ���ڿ��� ������ ������ �� ���(�Ǽ� �Ұ�)
			if(num1%11==0)break;
				//11�� ����� ã�ƾ� �ϹǷ� num1�� 11�� ������ �� �������� 0�� ���� ã�´�.
			System.out.println(num1);
		}
		
		
		//up&down?
		//��ǻ�Ͱ� �����ϴ� ���ڸ� ���� ��(������ 20~100)
		
		System.out.println("20���� 100���� ������ ���ڰ� ���õ˴ϴ�. ���纸����!");
		int com = (int)(Math.random()*81)+20;
			//�̷��� 100���� ���� ���´�.
		for(;;) {
			System.out.print("���� �����ϴ� ���ڴ�? >> ");
			int user = scan.nextInt();
			if(user == com){
				System.out.println("����! "+com+"�̾����ϴ�!");
				break;
			}else if(user > com) {
				System.out.println("Down!");
			}else {
				System.out.println("UP!");
			}
		}
		*/
		
		//�ڹ� ��ũ��Ʈ���� �� �ߴ� for��?(�ڵ� �м��� ��ư� ����� ���̶� �ֿ��� ��������)
		
		int sum =0;

		
		���ϱ�:for(int i=1; i<=10; i++) {//�� for���� �̸��� ���� '���ϱ�'�Դϴ�.
			for(int k=1; k<=4; k++) {
				if(sum+k>=40)break ���ϱ�;
				//���� 40�̻� �ѱ�� �׸� ����ϰ� ����.
				//�� �ι�° for�� �ȿ����� ������ �ִ� break��.
				//������ �̸��� ������!
				sum = sum+k;
				System.out.println(i+" "+k);
				//�̰� ���� ���ϸ� ���������δ� 100�� ��.
				}
			System.out.println(i);
			sum=sum+i;
			//�׷��� ù��° for���� �ش��ϴ� �� ��ɾ�� ������� break�� ������ ���� �ʴ´�.
			//�̸��� �����Ǿ��� ������ �ι�° for������ �̸��� ������ ������ ������ �޴´�.
			}
		
		if(sum<40){
			System.out.println("sum ��� : " + sum);
		}
			
		
		//����Ų��� ���� 
		//���� ��ǻ�� ���� �����ư��� 1���� 31���� �Է�(31�� �Է��ϴ� ���� �й�)
		//�ѹ��� ������ �� �ִ� ���ڴ� 1~3��.
		
		
		int num=1;
		����Ų:
		for(;;){//= while(true)
			System.out.println("�� ���ڴ� �� ��? : ");//���� �迭�� ǥ����
			int user = scan.nextInt();
			System.out.print("�� : ");

			for(int u=1; u<=user; u++) {
				System.out.print(num+" ");
				if(num==31) break ����Ų;
					//���⼭ �̸��� �������� ���� for������ break�� �ǵ��� ����
				num++;
			}
			System.out.println();
			
			int com = (int)(Math.random()*3)+1;
			System.out.print("	  com : ");
			
			for(int u=1; u<=com; u++) {
				System.out.print(num+" ");
				if(num==31) break ����Ų;
				num++;
			}
			System.out.println();
		}
	
	
	}
}

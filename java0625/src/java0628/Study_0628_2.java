package java0628;

import java.util.Arrays;

public class Study_0628_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 �迭 : 
 	�ڹٽ�ũ��Ʈ ver.- ������ ������ �̷���� ������ ���� ����
 				 - ���ȣ�� ǥ����
 	
 	�ڹ� ver. - ������ ������ �̷���� ���� ������ Ÿ���� ���� ����
 	  		-�߰�ȣ�� ǥ����. 
 	  		-���� �迭 �������� ���� �����͸� ���� ����
 */
	int[] a ={10,20,30};
	System.out.println(a[0]+"  "+a[1]);
		//�ڹٽ�ũ��Ʈ�� ���������� ù��° �ε����� 0���� ǥ��ȴ�.
	System.out.println(a);
		//�׳� �迭�� a�� �� ��� �ܼ��� ����� �ּҸ� ��µȴ�.
	System.out.println(Arrays.toString(a));
		//tostring = �ڹٿ� ����� ���ڿ�
		//�׷��Ƿ� Arrays.toString(a)�� �迭 a�� ������ �����͸� ���ڿ��� �����޶�� ��ɾ���
	int[] b = {40,50,60};
	
	int[] arr = new int[10];
		//�ڹٿ��� �迭�� ����� �������� ���
		//�̷��� ����� : �迭 �� �� ������ 10���� ����(�ڹٽ�ũ��Ʈ�� newArray�� ����)
		//�迭 �� ������ ���� �� ���� �� int�� ���̴��� = ������ Ÿ���� ���Ͻ��Ѿ� �ϴϱ�.
	
	int[] brr = new int[] {10,20,30,40};
		//�̷��� 10, 20, 30, 40�� ����� �迭 �� ������ 4���� ������.

	//int[] crr = new int[]; : ������ �� ��(�����͵� ����� ������ ������ ������)
	//						   �׷��ϱ� �𸣱� ���� ũ��� �� �����ض�.
	
	int size = 15;
	int[] arr2 = new int[size];
	//���� �迭 : �̷��� �ϸ� ���߿� size�� ã�Ƽ� ��ġ �����ϸ� �� ���� ������ ������ ������
	//		   ���� �ϴµ� �� ������ ���� �뵵�δ� ������� ����. �� ���� �迭
	
	//���� �迭 ���� ��� �ٽ� ���.
	//���� : ������Ÿ��[] �迭�̸� = new ������Ÿ��[�迭ũ��];		
	
	int[] money = new int[5];	
		//�׷��Ƿ� int Ÿ���� ������ 5�� �� ������ ����!
		//������ �ε��� ��ȣ�� 4��!
	money[0] = 5000;
	money[1] = 10000;
	money[2] = 15000;
	money[3] = 20000;
	money[4] = 25000;
	
	for(int i=0; i<money.length; i++) {
		//� �迭�̵� for���� �̷��� ���� ��. 
		//�ε��� �� ������ ����� �ϰ� ������ �ݺ��� �ʼ���.
		if(money[i]>=15000) {
			//������ �ε��� ��ü �� Ư�� �������� �����ϸ� �ش� ���ǿ� �ش��ϴ� �����͸� ���.
		System.out.println(money[i]);
		//�̷��� �迭 �ε��� ������� �����Ͱ� ���� ����.
		}
		
	}
	
	int[] classA = new int[3];
		//3���� �����͸� ���� �� �ִ�.
	classA[0]=89;
	classA[1]=78;
	classA[2]=93;
	
	int[] classB = new int[3];
	classB[0] = 56;
	classB[1] = 84;
	classB[2] = 72;
	
	System.out.println("A�� ���� : "+Arrays.toString(classA));
	System.out.println("B�� ���� : "+Arrays.toString(classB));
		//�϶�, A, B �� ���� ���� �� 80�� �̻� ����Ϸ���?
		//�� �迭�� ũ��� �����ϰ� 3 = 1�� �迭�� ���� ���� : ���ս�ų �迭 1�� �߰��ϸ� ��
	
	/*
	for(int i=0; i<classA.length; i++) {
		//������ a,b �Ѵ� �迭�� 3���� a�ݸ� ������� �ص� ��� ����.
		if(classA[i]>=80) 
			System.out.println(classA[i]);
		if(classB[i]>=80) 
			System.out.println(classB[i]);
		}
	�̷��� ǥ���ص� ������ �Ʒ��ε� �����ϴ�.
	
	for(int i=0; i<classA.length; i++) {
		
		grade1[i]=classA[i];
		grade1[i+3]=classB[i];
	}
	
	
	for(int i=0; i<grade1.length; i++) {
		if(i<3) {
			grade1[i]=classA[i];
				//grade1�� n�� �ε����� classA�� n�� �ε����� ����Ǵ� ��(0~2������)
		}else {
			grade1[i]=classB[i-3];//3~5������ classB�� �����ҰŴϱ�.
		}
		
	}
	
	*/
	
	
	int[] grade1 = new int[classA.length+classB.length];
			//a,b �Ѵ� �������� �� �迭�� ũ�⸦ ��ġ�� �ȴ�. (�׷��Ƿ� grade1�� �迭 ũ��� 6)
	
	//�ݺ��� ���� �޼ҵ带 �̿��ϴ� ����� �ִ�. arrayCopy : �迭�� �����ؼ� �ٸ� �迭�� �ٿ��ִ� ���!
	//���� ���� Ÿ���̿��� ����
	System.arraycopy(classA, 0, grade1, 0, classA.length);
	System.arraycopy(classB, 0, grade1, 3, classB.length);
	//��ȣ �� ���� : (������ �迭, ���縦 ������ �ε���, ������ �迭, �����ų �ε���, ������ ������ ��)
	//			   ���̶� ������ ���� ���ڷ� �����ص� �ǰ����� �׳� ������ �ϴ°� �� ��Ȯ�ϴ�.
	
	
	for(int i=0; i<grade1.length;i++) {
		if(grade1[i]>=80)
			System.out.println(grade1[i]);
	}
	
	Arrays.sort(grade1);//��� �迭�� �����ϴ� ������ Ŭ������.
	System.out.println(Arrays.toString(grade1));
	
	boolean same = Arrays.equals(classA, classB);
	System.out.println("A��, B�� �迭�� ������? : "+same);
	
	
	
	
	
	
	
	
	}
}



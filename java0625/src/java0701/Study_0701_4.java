package java0701;

public class Study_0701_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 2���� �迭 : 1���� �迭 ������ 1���� �迭�� ������ ��
 	=�ε����� 2��
 	=Ÿ�� �ڿ� ���ȣ�� 2�� ����
 	
		
	int[][] arr = new int[5][3];
		//�� : arr��� �̸��� ���� 3��¥�� �迭�� 5�� �ִ�.
		//		= 0�� �ε����� 0�� �ε����� ǥ�� ������ ���� �»�ܿ� ��ġ��
	
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[1][0]=40;
	arr[2][1]=50;
*/	

	int[]a = new int[] {10,20,30,40,50,60,70,80,90,100};
	
	for(int data: a) {	//�迭 ���� for��(index�� ǥ���� ��� ��� ����)	= forEach(Ȥ�� Each)
						//int i=0; i<a.length; i++�� ���� ǥ����.
		System.out.println(data);
	}
	
	int[][]	array1 = new int[2][3];
	System.out.println(array1.length);	//�� ��ü�� ������ ���
	System.out.println(array1[0].length); //ù��° ���� ������ ���
	System.out.println(array1[1].length); //�ι�° ���� ������ ���
	System.out.println();
	System.out.println();
	
	int[][] array2 = new int[][] {{1,2},{3,4,5}};
	System.out.println(array2[0].length);	//ù��° ���� ������ 2��
	System.out.println(array2[1].length);	//�ι�° ���� ������ 3��
		//���������� �� ��ü�� ������ 2����.
	System.out.println();
	System.out.println(array2[0][0]);	//ù��° �� ù��° ���� �ε����� ��� = 1
	System.out.println(array2[0][1]);	//ù��° �� �ι�° ���� �ε����� ��� = 2
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}

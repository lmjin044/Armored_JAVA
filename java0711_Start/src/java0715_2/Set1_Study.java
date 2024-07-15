package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set1_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> A = new HashSet<>();
		HashSet<String> B = new HashSet<>();
		A.add("¥���"); A.add("������"); A.add("������"); A.add("�޲ٹ� ����");
		B.add("��ġ������"); B.add("������"); B.add("¥���"); B.add("������");
			//HashSet�� �̿��� ���������� ����� �����͸� ���� ����.
		HashSet<String> C = new HashSet<>();
		
		Iterator<String> it = A.iterator();
			//1ȸ������ ������ ó��.
		while(it.hasNext()) {
			String Afood = it.next();
			if(B.contains(Afood)) {
				C.add(Afood);
			}
			System.out.println("A, B ������ : "+C);
		}
		
		HashSet<String>D = new HashSet<>();
		it = A.iterator();
			String Afood = it.next();
			if(!B.contains(Afood)) {
				D.add(Afood);
			}
		
		System.out.println("A, B ������ : "+ D);
		
		
		HashSet<String>E = new HashSet<>();
		E = (HashSet<String>)A.clone();
		E.addAll(B);
		System.out.println("A, B ������ : " + E);
		
		//���� :
		//������ = addAll
		//������ = retainAll >> A.retainAll(B) = A�� B�� ������.
		//������ = removeAll >> A.removeAll(B) = A�� ������ �ִ� ������ ���
		
		HashSet<Integer>num1 = new HashSet<>();
		while(num1.size()<15) {
			num1.add(Integer.valueOf((int)(Math.random()*50)));
		} 
		
		HashSet<Integer>num2 = new HashSet<>();
		while(num2.size()<15) {
			num2.add(Integer.valueOf((int)(Math.random()*50)));
		}
		
		HashSet<Integer>num3 = new HashSet<>();
		while(num3.size()<15) {
			num3.add(Integer.valueOf((int)(Math.random()*50)));
		}
		System.out.println("\n");
		System.out.println("\nnum1 = " + num1);	HashSet<Integer>cross13 = new HashSet<>();
		System.out.println("num2 = " + num2); HashSet<Integer>minus12 = new HashSet<>();
		System.out.println("num3 = " + num3); HashSet<Integer>cross23 = new HashSet<>();
		
		cross13 = (HashSet<Integer>)num1.clone();
		cross13.retainAll(num3);
		System.out.println("\n1) num1�� num3�� ������ : " + cross13);
		
		minus12 = (HashSet<Integer>)num1.clone();
		minus12.removeAll(num2);
		System.out.println("\n2) num1�� num2�� ������ : " + minus12);
		
		cross23 = (HashSet<Integer>)num2.clone();
		cross23.retainAll(num3);
		System.out.println("\n3) num2�� num3�� ������ : " + cross23);
		

		HashSet<Integer>total = new HashSet<>();
		
		total.addAll(num1);
		total.addAll(num2);
		total.addAll(num3);
		System.out.println("\n4) num1, num2, num3�� ������ : " + total);
		
		//Q. num1, num2, num3�� �� ������ ����� 1~50������ ������ 15���� ��������.
		//-1. 1���� 3���� ������, -2. 1���� 2���� ������. -3. 2���� 3���� ������. -4. 1,2,3 ��� ������.
		
		
		
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		hash.add("¥���");
//		hash.add("«��");
//		hash.add("���뱹��");
//		hash.add("�������");
//		hash.add("���� ����");
//			//�̹� �ִ� �����͸� �ߺ� ������ �ƴ϶� ����⸦ ��.
//		
//		System.out.println(hash);
//		hash.remove("«��");	//������ ����.
//		System.out.println(hash);
//		//�ϳ��� ������ �޼ҵ尡 ���⿡ �Ϸ��� �ݺ����� �̿���.
//		for(String food: hash) {
//			System.out.println(food);
//		}
//		
//		ArrayList<String> list = new ArrayList<>(hash);
//		System.out.println(list);
//			//Ȥ�� �迭�� �����ؼ� �� �� ���� ArrayList ���ؼ�.
//		System.out.println(list.get(3));
//			//�׷��� �� ������� �����ϰ� Ư�� �����͸� �� �� �ִ�.
	}

	
}


/*

Set �������̽� : ����(�������� �׷�)�� �ٷ�� ���� ����. 
	-HashSet, TreeSet :
	 �ذ�����
		1)���������� ������� �ʴ´�.
		2)�ߺ� ����� ���� �ʴ´�.
		3)�ε����� ���� = �ϳ��� ���� �� ����.	
		/list�������̽��� ����ϴ� �������� �ٸ�.
	 ��������
	 	-HashSet : ������ ǥ��
	 	-TreeSet : �˻��� Ưȭ
		 
*/
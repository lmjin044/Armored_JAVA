package java0711_2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionStudy1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//���� �迭 �߰� ��� : �����迭
		int[] a =new int[5];
	//������ ���� �������� �����͸� �߰��ϴ� ��� : �����迭
	//ArrayList<Ŭ����Ÿ��> �迭�� = new ArrayList();
	//	String(����) Interger(����), Long(����, ���), Float(�Ǽ�), Character(=char)
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(89);
		list1.add(230);
		list1.add(4542);
		//list1.add(75.86);
		//list1.add("�̼���");
		list1.add(2);
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.indexOf(230));
		//�����迭 ����, �ε��� �� ã�� ���.
		System.out.println(list1.contains(4542));
		//�����迭 ����, �ش� �ε����� �ִ��� ���� Ȯ�� : ������ true, ������ false
		
		list1.remove(3);
		//�迭 �� �ε��� �����ϱ�.
		System.out.println(list1.isEmpty());
		
		list1.add(1, 450);
		//�迭 �� Ư�� �ε����� �����͸� �����ϱ�.
		
		list1.forEach(n -> System.out.println(n));
			//= for(Integer n : list1){System.out.println(n)}
		
		list1.set(3, 15);
			//�ε����� �����ϰ��� �ϴ� ������
		
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
			//�����迭�� �������迭�� ��ȯ��Ű��.
		
		//Arraylist<Integer> alist = new ArrayList<Integer>()
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//���ᤤ��, �念��, �̼���, ������, ������, ����ȣ�� ArraysList�� �����ϰ� ����϶�
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("������");
		list2.add("�念��");
		list2.add("�̼���");
		list2.add("������");
		list2.add("������");
		list2.add("����ȣ");
		
		System.out.println(list2);

		
		
	}

}


/*
�ڹ� �÷��� �����ӿ�ũ? : 
	1) �����͸� ����, �����ϱ� ���� �ڷ� ����.
	2) �����͸� ����ó���ϴ� �˰���.
	3) Ŭ�������� ����ä
	
Collection �������̽�
	-List �������̽�
		ArrayList Ŭ����
		vector
		LinkedList
		Stack
		Queue
	-Set �������̽�
		HashSet
		TreeSet
		LinkedHashSet
Map �������̽�
	-HashMap
	-TreeMap
	-LinkedHashMap
*/
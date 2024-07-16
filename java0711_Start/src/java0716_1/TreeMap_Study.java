package java0716_1;

import java.util.TreeMap;

public class TreeMap_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer, String> tree= new TreeMap<>();
		tree.put(20, "�ڵ�");
		tree.put(54, "���");
		tree.put(9, "����");
		tree.put(33, "����");
		tree.put(5, "�丶��");
		
		System.out.println(tree.headMap(21));
		//HashMap�� �����ϰ� headMap�� �Է°����� �۰�, tailMap�� �Է°����� ū ����� �˻�
		
		System.out.println(tree.floorKey(15));
		//�Է��� Ű�� ��ġ(�ϰų� ���� �����) 'Ű' ���� ã��.
		System.out.println(tree.floorEntry(15));
		//�Է��� Ű�� ��ġ(�ϰų� ���� �����) '��ü' ���� ã��.
		
		System.out.println(tree.subMap(10, 40));
		//�Է��� �� Ű�� ���̿� �ִ� ���� ã��. 
		
		System.out.println(tree.lowerKey(25));
		//�Է��� Ű�� ���� ����� '����' ����� ã��.
		System.out.println(tree.higherKey(40));
		//�Է��� Ű�� ���� ����� 'ū' ����� ã��.
	}

}

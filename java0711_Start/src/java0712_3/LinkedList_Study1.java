package java0712_3;

import java.util.LinkedList;

public class LinkedList_Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		list.add("���ֵ�");
		list.add("����");
		list.add("�︪��");
		list.add("��ɵ�");
		list.add("����");
		
		list.indexOf("��ɵ�");	
			//�迭�� �ƴѵ� �� ����? >> ������ ���ϼ� ���ؼ�
			//�ڹٰ� ����������.
		System.out.println(list.get(3));
		
		list.forEach(��-> System.out.println(��));
		//��� ArrayList�� ���� �Ȱ���. �ٵ� ��� �迭������ �ƴ�.
		//
		//list.
	}

}

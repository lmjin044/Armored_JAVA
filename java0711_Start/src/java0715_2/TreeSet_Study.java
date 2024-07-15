package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20); tree.add(9);
		tree.add(40); tree.add(15); tree.add(48); tree.add(2);
		tree.add(11); tree.add(39);
		
		System.out.println(tree);
		//���ڰ� ���� ������� ��µǾ� ����.
		System.out.println("ù��° ������ ������ ȣ�� : "+tree.first());
		System.out.println("������ ������ ������ ȣ�� : "+tree.last());
		System.out.println("�Է� ������ ���� ����� ū ���� ȣ�� : "+tree.higher(20));
		System.out.println("�Է� ������ ���� ����� ���� ���� ȣ�� : "+tree.lower(30)); 
		System.out.println("�Է� ������ ���� ��� ���� ȣ�� : "+tree.headSet(15));
		System.out.println("�Է� ������ ū ��� ���� ȣ��"+tree.tailSet(20)); 
		System.out.println("�Է��� ������ ���̿� �ִ� ���� ȣ�� : "+tree.subSet(15, 30));
		
		
		TreeSet<String> word = new TreeSet<>();
		word.add("�̼���"); word.add("������"); word.add("�庸��"); word.add("������"); word.add("������");
		word.add("���س�"); word.add("���﹮"); word.add("������"); word.add("���ƾ�"); 
		
		System.out.println(word.higher("��"));
		System.out.println(word.headSet("��"));
		System.out.println(word.subSet("��", "��"));	//������ �ڱ��� ��� �����ϴ� �ܾ� �˻�
		System.out.println(word.subSet("��", "��")); //������ �ܼ��� ���������δ� �� ��.
		
		//90�̻� = ���� 10%, 70�̻� = ���� 30%, 40�̻� = ���� 80%.
		//�� ������ �Է��Ͽ� �ۼ������� ����ϱ�.
		
	Scanner sc = new Scanner(System.in);
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		System.out.println("������ �Է��ϼ��� : ");
		int my = sc.nextInt();
		switch(rank.lower(my)+1) {
			case 90 : System.out.println("����10%"); break;
			case 70 : System.out.println("����30%"); break;
			case 40 : System.out.println("����80%"); break;
		}
		
		
		
		sc.nextLine();
//		
		//��2 �� ���� �Է� �� ������ ���� ����� ���.
		TreeSet<String> score = new TreeSet<>();
		score.add("89�� �̼���"); score.add("67�� ������"); score.add("45�� ������");
		score.add("98�� �Ѽ���"); score.add("72�� �ڹ���"); score.add("81�� ������");
		score.add("59�� �̼���"); score.add("32�� �����");
		
		System.out.println("�� ������ : ");
		String test = sc.nextLine();
		System.out.println("�� ���� �� ������� �ֳ� : "+ score.tailSet(test));
		
	}
}

/*
TreeSet ���� : ���� ������� �θ�-����-�ڽ��� ǥ���� ���� �����Ŵ
	- ���������� ������ �������� ����
	- �ߺ� ������� ����
	- ����Ʈ�� ��� = �����Ͱ� ���ĵǾ� ��� ��.
		�� = �� ��尡 �ִ� 2���� �ڽĳ�带 ���ϴ� ��

*/
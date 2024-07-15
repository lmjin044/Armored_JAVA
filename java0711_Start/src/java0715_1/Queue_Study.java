package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
			//ť���� �켱������ ������ ���.
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
			//���ڰ� ���� ���� �켱 ������ ���� �����ȴ�.	
		System.out.println(pq);
		for(int i=1; i<=5; i++) {
			System.out.println(pq.poll());
		}
		//�����ڰ� ������ Ŭ������ ��ü���� �켱������ ���Ϸ��� compare �޼��带 �����ؾ� ��.
		//	�� �������̽� Comparator�� implements�� �ؼ� �̿��ϴ� ���.
		//���ڴ� ���⸦ ���� �� ����� ����� �� �ڸ��� ��� = ���� ���� �켱���� ���� ����.
		//���ڴ� ������ ������ �������� �Ѵ�. = �ѱ��� ��� '��'�� ���� �켱������ ����.
		
		
		Queue<String> q = new LinkedList<>();
		
		q.add("�ڵ�");
		q.offer("����"); //ť ���� �޼���.
		q.offer("����");
		q.offer("�챸");
		
		System.out.println(q);
		System.out.println(q.poll());	//�� ó���� �����͸� ���.
		System.out.println(q);
		System.out.println(q.peek());	//��� ������ �����͸� �̸�������.
		System.out.println(q.element());
		System.out.println(q.size());	//�������� ����� �ε��� ��ȣ�� ǥ��.
		System.out.println(q.contains("������"));	
			//q�� ������ Queue �ȿ� �ش�Ǵ� �����Ͱ� �ִ��� Ȯ��.(������ true, ������ false)
	}

}

/*
Queue(ť) : ���ð� �Բ� �������� ���� ���� ����
(������ ��Ŭ����, �޸���, �ѱ�, ���� ���)

FIFO = First In First Out
 	 = ���� ������� ������.
 	 
*/
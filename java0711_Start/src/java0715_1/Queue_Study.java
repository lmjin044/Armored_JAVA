package java0715_1;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
			//큐에서 우선순위를 따지는 방식.
		pq.offer(56);
		pq.offer(100);
		pq.offer(5);
		pq.offer(30);
		pq.offer(2);
			//숫자가 낮을 수록 우선 순위가 높게 설정된다.	
		System.out.println(pq);
		for(int i=1; i<=5; i++) {
			System.out.println(pq.poll());
		}
		//개발자가 정의한 클래스의 객체에서 우선순위를 정하려면 compare 메서드를 구현해야 함.
		//	ㄴ 인터페이스 Comparator를 implements를 해서 이용하는 방법.
		//숫자는 빼기를 했을 때 결과가 양수면 그 자리를 비움 = 작은 수가 우선순위 높은 이유.
		//문자는 사전적 순서를 기준으로 한다. = 한글의 경우 '가'가 제일 우선순위가 높다.
		
		
		Queue<String> q = new LinkedList<>();
		
		q.add("자두");
		q.offer("수박"); //큐 전용 메서드.
		q.offer("참외");
		q.offer("살구");
		
		System.out.println(q);
		System.out.println(q.poll());	//맨 처음의 데이터를 출력.
		System.out.println(q);
		System.out.println(q.peek());	//출력 예정의 데이터를 미리보여줌.
		System.out.println(q.element());
		System.out.println(q.size());	//데이터의 사이즈를 인덱스 번호로 표현.
		System.out.println(q.contains("복숭아"));	
			//q로 지정된 Queue 안에 해당되는 데이터가 있는지 확인.(있으면 true, 없으면 false)
	}

}

/*
Queue(큐) : 스택과 함께 여기저기 많이 쓰는 구조
(심지어 이클립스, 메모장, 한글, 계산기 등등)

FIFO = First In First Out
 	 = 들어온 순서대로 나간다.
 	 
*/
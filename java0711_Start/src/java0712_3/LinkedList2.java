package java0712_3;

public class LinkedList2 {
	Node head=null; // 링크드리스트의 첫번째 노드 
	Node tail; // 링크드 리스트의 마지막 노드
	
	void add(int n) { // 새 데이터 저장
		Node temp = new Node(n);
		if(head==null) {
			head=temp;
			tail=temp;
		}else {
			tail.next=temp;
			tail=temp;
		}
		
	}
	
	@Override
	public String toString() { // 전체 출력
		String out="[";
		Node move = head;
		while(move !=null ) {
			out += move.num+", ";
			move = move.next;
		}
		out = out.substring(0, out.length()-2);
		out += "]";
		
		return out;
	}
	
	int get(int index) { // 지정한 위치의 데이터 출력
		return 0;
	}
	
	void remove(int index) { // 지정한 위치의 데이터 삭제
		
	}
	
	
}


// 새 데이터 저장 - add
// 데이터 삭제 - remove
// 전체 출력 - toString
// 데이터 하나 출력 - get
package java0712_3;

import java.util.LinkedList;

public class LinkedList_Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<>();
		list.add("제주도");
		list.add("독도");
		list.add("울릉도");
		list.add("백령도");
		list.add("마라도");
		
		list.indexOf("백령도");	
			//배열이 아닌데 왜 가능? >> 구조적 통일성 위해서
			//자바가 끼워맞춰줌.
		System.out.println(list.get(3));
		
		list.forEach(도-> System.out.println(도));
		//사실 ArrayList와 거의 똑같음. 근데 얘는 배열구조가 아님.
		//
		//list.
	}

}

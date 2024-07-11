package java0711_2;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionStudy1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//기존 배열 추가 방법 : 정적배열
		int[] a =new int[5];
	//별도의 공간 지정없이 데이터를 추가하는 방법 : 동적배열
	//ArrayList<클래스타입> 배열명 = new ArrayList();
	//	String(문자) Interger(정수), Long(정수, 길게), Float(실수), Character(=char)
		ArrayList<Integer> list1 = new ArrayList();
		list1.add(89);
		list1.add(230);
		list1.add(4542);
		//list1.add(75.86);
		//list1.add("이순신");
		list1.add(2);
		
		System.out.println(list1);
		System.out.println(list1.get(2));
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println(list1.indexOf(230));
		//동적배열 한정, 인덱스 값 찾는 방법.
		System.out.println(list1.contains(4542));
		//동적배열 한정, 해당 인덱스가 있는지 유무 확인 : 있으면 true, 없으면 false
		
		list1.remove(3);
		//배열 내 인덱스 제거하기.
		System.out.println(list1.isEmpty());
		
		list1.add(1, 450);
		//배열 내 특정 인덱스에 데이터를 삽입하기.
		
		list1.forEach(n -> System.out.println(n));
			//= for(Integer n : list1){System.out.println(n)}
		
		list1.set(3, 15);
			//인덱스와 변경하고자 하는 데이터
		
		
		Integer[] number = list1.toArray(new Integer[list1.size()]);
		Integer[] aa = new Integer[3];
		aa[0] = 10;
		aa[1] = 20;
		aa[2] = 30;
		
			//동적배열을 ㄹ정적배열로 변환시키기.
		
		//Arraylist<Integer> alist = new ArrayList<Integer>()
		
		Collections.sort(list1);
		System.out.println(list1);
		
		//김춘ㄴ추, 장영실, 이성계, 정몽주, 정도전, 김정호를 ArraysList에 저장하고 출력하라
		
		ArrayList<String> list2 = new ArrayList();
		list2.add("김춘추");
		list2.add("장영실");
		list2.add("이성계");
		list2.add("정몽주");
		list2.add("정도전");
		list2.add("김정호");
		
		System.out.println(list2);

		
		
	}

}


/*
자바 컬렉션 프레임워크? : 
	1) 데이터를 저장, 관리하기 위한 자료 구조.
	2) 데이터를 가공처리하는 알고리즘.
	3) 클래스들의 집합채
	
Collection 인터페이스
	-List 인터페이스
		ArrayList 클래스
		vector
		LinkedList
		Stack
		Queue
	-Set 인터페이스
		HashSet
		TreeSet
		LinkedHashSet
Map 인터페이스
	-HashMap
	-TreeMap
	-LinkedHashMap
*/
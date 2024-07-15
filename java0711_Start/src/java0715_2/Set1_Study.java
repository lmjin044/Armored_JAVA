package java0715_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set1_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> A = new HashSet<>();
		HashSet<String> B = new HashSet<>();
		A.add("짜장면"); A.add("볶음밥"); A.add("돈가스"); A.add("쭈꾸미 볶음");
		B.add("김치볶음밥"); B.add("떡볶이"); B.add("짜장면"); B.add("돈가스");
			//HashSet을 이용해 교집합으로 공통된 데이터를 추출 가능.
		HashSet<String> C = new HashSet<>();
		
		Iterator<String> it = A.iterator();
			//1회용으로 순차적 처리.
		while(it.hasNext()) {
			String Afood = it.next();
			if(B.contains(Afood)) {
				C.add(Afood);
			}
			System.out.println("A, B 교집합 : "+C);
		}
		
		HashSet<String>D = new HashSet<>();
		it = A.iterator();
			String Afood = it.next();
			if(!B.contains(Afood)) {
				D.add(Afood);
			}
		
		System.out.println("A, B 차집합 : "+ D);
		
		
		HashSet<String>E = new HashSet<>();
		E = (HashSet<String>)A.clone();
		E.addAll(B);
		System.out.println("A, B 합집합 : " + E);
		
		//정리 :
		//합집합 = addAll
		//교집합 = retainAll >> A.retainAll(B) = A와 B의 교집합.
		//차집합 = removeAll >> A.removeAll(B) = A만 가지고 있는 데이터 출력
		
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
		System.out.println("\n1) num1과 num3의 교집합 : " + cross13);
		
		minus12 = (HashSet<Integer>)num1.clone();
		minus12.removeAll(num2);
		System.out.println("\n2) num1과 num2의 차집합 : " + minus12);
		
		cross23 = (HashSet<Integer>)num2.clone();
		cross23.retainAll(num3);
		System.out.println("\n3) num2와 num3의 교집합 : " + cross23);
		

		HashSet<Integer>total = new HashSet<>();
		
		total.addAll(num1);
		total.addAll(num2);
		total.addAll(num3);
		System.out.println("\n4) num1, num2, num3의 합집합 : " + total);
		
		//Q. num1, num2, num3의 세 집합을 만들고 1~50까지의 랜덤값 15개를 저장하자.
		//-1. 1번과 3번의 교집합, -2. 1번과 2번의 차집합. -3. 2번과 3번의 교집합. -4. 1,2,3 모두 합집합.
		
		
		
		
		
		
//		HashSet<String> hash = new HashSet<>();
//		hash.add("짜장면");
//		hash.add("짬뽕");
//		hash.add("순대국밥");
//		hash.add("들깨국수");
//		hash.add("맑은 곰탕");
//			//이미 있는 데이터면 중복 저장이 아니라 덮어쓰기를 함.
//		
//		System.out.println(hash);
//		hash.remove("짬뽕");	//데이터 삭제.
//		System.out.println(hash);
//		//하나씩 꺼내는 메소드가 없기에 하려면 반복문을 이용함.
//		for(String food: hash) {
//			System.out.println(food);
//		}
//		
//		ArrayList<String> list = new ArrayList<>(hash);
//		System.out.println(list);
//			//혹은 배열로 변경해서 쓸 수 있음 ArrayList 통해서.
//		System.out.println(list.get(3));
//			//그러면 이 방식으로 간단하게 특정 데이터를 뺄 수 있다.
	}

	
}


/*

Set 인터페이스 : 집합(데이터의 그룹)을 다루기 위한 목적. 
	-HashSet, TreeSet :
	 ※공통점
		1)순차적으로 저장되지 않는다.
		2)중복 허용이 되지 않는다.
		3)인덱스가 없다 = 하나씩 꺼낼 수 없음.	
		/list인터페이스를 사용하는 나머지와 다름.
	 ※차이점
	 	-HashSet : 집합을 표현
	 	-TreeSet : 검색에 특화
		 
*/
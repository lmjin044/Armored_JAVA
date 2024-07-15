package java0711_2;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudy1 {

	private static String temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Member> list =new ArrayList<>();
		
		list.add(new Member("이순신",34,"19900405"));
		list.add(new Member("김춘추", 25, "19991208"));
		list.add(new Member("장보고", 28, "19960712"));
		list.add(new Member("한석봉", 31,"19930120"));
		list.add(new Member("김광식", 39, "19851010"));
		
		
//		System.out.println(list);
//		
//		for(Member m : list) {
//			if(m.getAge()>=30)
//				System.out.println(m);
//			
//		}
//	System.out.println("1995년 이후에 태어난 사람은?");
//	
//	for(Member m :list) {
//		String temp = m.getBirth().substring(0, 4);
//		int year = Integer.parseInt(temp);
//		if(year>1995)
//			System.out.println(m);
//	}
	System.out.println("8~11월에 태어난 사람은?");
	for(Member m:list) {
		String a = m.getBirth().substring(4, 6);
		int month = Integer.parseInt(a);
		if((month>7)&&(month<12))
			System.out.println(m);
	}
	
	list.add(2, new Member("장영실",34,""));
	System.out.println(list);
	
	System.out.println("생년 월일이 없는 사람을 찾아 나이는 연도로 하고 0월 0일로 만들기");
	for(Member mem:list) {
		if(mem.getBirth().isBlank()) {
			int year = 2024 - mem.getAge();
			mem.setBirth(year+"0000");
			
		}
	}
	System.out.println(list);
	//콜렉션에 리스트를 사용하는 경우 ; 
	//콜렉션에 메서드들을 온전히 사용하려면 필요한 메서드를 클래스에 구현해야 함
	//필요 메서드는 최상위 부모 클래스(object)가 가지고 있음
	//컬렉션 관련 인터페이스를 implements하기도 해야 함.
	
	
	Object obj;
	
	
	//정렬 : 
	//Collections.sort(list);
	System.out.println("이하 나이별 정렬");
	list.forEach(m -> System.out.println(m));
	
	}
	
	

}

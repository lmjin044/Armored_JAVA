package Modifier;

public class modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book book = new book();
		book.setTitle("JAVA 속성");
		book.setAuthor("유재학");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		
		book book2 = new book("JAVA, 웹, 성공적", "이병헌", 564);
		System.out.println(book2);
		
	}

}

/*
 클래스에서 배우는 목록 : 
 	-변수, 메서드
 	-인스턴스, 클래스
 	-생성자 메서드
 	-인스턴스 변수, 클래스 변수의 초기화
 	-오버로딩
 	-오버라이딩
 	-상속
 	-제어자
 	-다형성
 	-추상화
 	-인터페이스
 	-내부클래스(익명, 정적)
 	-열거형
 	<<이거 다 배우면 리포트 형식으로 과제 할 예정이다.
 	
 	
 컬렉션에서 배우는 목록 : 
 	-자료구조와 알고리즘
 	-Collection, List, Map, Set
 	-ArrayList, Vector, LinkedList
 	-Queue, Stack, Vector, TreeSet
 	-HashMap, TreeMap.....
 
 특히 컬렉션의 내용을 내 것으로 못 만들면 자바가지고 뭘 할 생각 못 한다.
 
 그외에도... 제너릭, 에너테이션, 스트림, 쓰레드도 배워야 해.
 >>여기까지가 자바 (객체지향으로서의) 기본 문법의 끝
 >>그 다음에는 JSP : 
 	내장객체, 스프링프레임워크(스프링부트), MVC 패턴(쇼핑몰사이트 만들기)
 	이거까지 하면 첫번째 팀 -웹 프로젝트 
 
  
  
  
  
  
 */
 
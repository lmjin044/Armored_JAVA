package java0717_4;

import java.sql.Date;
import java.util.ArrayList;

class A<T>{
	T item;
	void get(T... add) {
		//여기서 ... 이 가변인자임 : 메서드의 매개변수를 동적처리할 때 사용함.
		//상황에 따라 자유롭게 배열 크기를 변화시킬 때 사용하는 용도
		//근데 왜 경고? : 제너릭은 정적배열에 가까운 구조라 권장하진 않아서 그런거.
	}
}


public class MainClass {
	@Deprecated
	static void aaa() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aaa();
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		Date today = new Date();
		today.getDate();
		
	}

}
/*
주석 = 개발자를 위한 메모
@(annotation) ≒ 주석 
		      = 컴퓨터에게 보내는 주석임
		      = 특정 코드들에 관한 내용을 컴퓨터에게 제공
	※메타버전이 따로 있음.
1.표준
	1) @Override: 메서드 오버라이딩(= "이거 가져가세요")
	2) @Deprecated : '캘린더'와 같은 특정 메서드를 
					 앞으로 안 사용할 것이라는 내용.
			ex)get.Year();
	3) @SuppressWarnings("") : ""의 내용에 따라 경고억제 범위가 조절됨
		all = 모든 경고
		deprecation = 권장되지 않는 기능 경고
		null = null 관련 경고
		unchecked = 미확인 오퍼레이션 경고
		unused = 사용하지 않거나 불필요한 코드 관련 경고
	4) @FunctionalInterface : 함수형 인터페이스임을 알릴때.
		 함수형 인터페이스? 추상 메서드를 '하나만' 가지고 있는 경우를 말함
		 ex)interface moveable{
		 		public void move();
		 	}
		 	ㄴ 요런 경우.
	5) @SafeVaragrs : 제네틱과 같은 가변인자의 매개변수 사용 시 경고 억제
		'가변인자?' : 위 제네틱 사용한거 참조
		
2.메타
	1) @Target : 에너테이션 정의할 때 적용될 대상 지정용
	2) @Documented : javadoc로 문서화시킨 문서에 포함
	3) @Inherited : 하위클래스에 상속되도록 할 때 선언함(target과 같이 사용)
	4) @Retention : 에너테이션 기간(어디서 언제까지만 실행되게끔)을 설정함
	5) @Repeatable : 에너테이션 반복 주기를 설정함
*/
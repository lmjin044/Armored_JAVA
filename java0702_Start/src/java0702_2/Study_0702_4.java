package java0702_2;

public class Study_0702_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	
	
}
//main 메서드 : 별도의 호출 없이도 가장 먼저 실행되는 부분
//실행하려면 JVM(Java Virtual Machine)이 필요함

/*
 메서드? 클래스의 기능에 해당하는 요소
 구성 요건 : 반환될타입 메서드이름(매개변수){메서드 내용}
  1)반환될 타입 - int, short, flaot, double, char, boolean, void, String 등
  			  메서드에서 return 뒤에 오는 데이터가 어떤 타입인지 적어준다.
  		>>return 10; 반환 타입은 int, short, long 등
  		>>return income; income 변수의 타입을 지정
  	※void 타입 = 반환값이 없음을 의미
  2)메서드 이름 - 변수 이름처럼 이용자가 알기 쉬운 쪽으로 정해도 된다.
  3)매개변수 
  4)메서드 내용
  
  아래는 주 예시 : 
  q.주민등록번호를 보고 성별 구분하기
  String gender(String jumin) {
  	String gen = jumin.subString(7,8)
  	if(gen.equals("1")||gen.equals("3"){
  		return "남자";
  	}else if(gen.equals("2")||gen.equals("4"){
  		return "여자";
  	}else "혼란";
  }
  반환 타입을 위에서 먼저 String(=텍스트)로 지정했기 때문에 
  return값에 텍스트 외 문자가 들어가면 오류
  
 */
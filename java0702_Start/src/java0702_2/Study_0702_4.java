package java0702_2;

public class Study_0702_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 300;
		//메서드 중괄호, if문 등에서 만들어지는 변수는 지역변수
		//그러므로 이 변수가 만들어진 영역에서만 사용가능.

		output(num);
		//서순이 중요함. 
		//static 요소가 먼저 만들어지고 그 다음 void 요소가 만들어짐
		//이 경우 static 하위에 output을 만든다고 해도 정상 작동되지 않음.
		
		
	}

	static void output(int a) {	
		//num이 가진 데이터 타입과 이 중괄호 내에서 만들어진 변수명
		//a가 output을 통해 num의 값을 저장받음.
		System.out.println(a);
		System.out.println("나는 메서드 입니다.");
		//인스턴스 메서드.
		//output을 실행시키려면 이쪽도 static으로 해야 함.
		//클래스 메서드에서는 오직 클래스 변수-메서드만 실행 :
		//메모리에 로드(적재)되는 때가 인스턴스보다 먼저 이루어지기 때문
		// >> 인스턴스변수, 인스턴스 메서드는 작동하지 않음.
		//상단의 num을 출력하고 싶어도 일단 이 중괄호 안에서 생성된 변수가 아님
		//output을 매개변수로 삼아서 가지고 오는 방법
	}
	
}
/*
class a{
	int num =10;
	static void out() {	//static이 붙었으므로 클래스 메서드 : 객체를 만들지 않아도 실행 가능.
		System.out.println(num);
	}
}
//이렇게 하겠다고 하는 일종의 선언. new 연산자를 통해 공간을 만들지 않아 num 안에는 아무것도 없다.


//main 메서드 : 별도의 호출 없이도 가장 먼저 실행되는 부분
//실행하려면 JVM(Java Virtual Machine)이 필요함 : 얘가 먼저 받고 윈도우에 넘겨줌.
//


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
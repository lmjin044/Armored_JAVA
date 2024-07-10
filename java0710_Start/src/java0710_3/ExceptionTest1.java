package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	//오류가 발생할 가능성이 있는 코드를 여기에 밀어넣는다.
			System.out.println(10/0);//위 구문에 오류가 발생해서 이미 종료가 됨.
		}catch(ArithmeticException e) {	
			System.out.println("0으로 왜 나누십니까아아아아");
		}
		System.out.println("여기가 프로그램의 끝입니다.");
	}

}

/*
예외처리 :안 하면 사용자가 불편한 거
 - 프로그램 실행 중 에러가 발생 할 시 즉시 프로그램이 종료됨.
 - 예외 처리를 하면 에러 발생 후에도 프로그램이 종료되지 않음.
 -사용자가 잘못 된 값을 입력하는 경우에 알려주는 목적
 ≠ 에러나 오류의 해결 : 회피 방법임.
*/
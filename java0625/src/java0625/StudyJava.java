package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("자바테스트");
		//코드 실행은 ctnl(왼)+f11
		//자바 변수 생성 : '데이터타입 변수이름 = 데이터;'로 구성
		//데이터타입의 종류: 정수, 실수, 문자
		//	1)정수 : byte, short, int, long, char
		//	2)문자 : char
		//	3)실수 : float, double
		
		byte num1 = 10;		//1byte / -128 ~ 127까지만가능 
		short num2 = 200;	//2byte
		int num3 = 785;		//4byte
		long num4 = 30L;	//8byte / long의 경우 L을 붙이기도 한다. (실수라는 표기)		
		
		//byte < short < int < long 순으로 더 많은 수를 담을 수 있다.
		
			//위 경우 정수를 저장하기위해 num이라는 변수를 만들었으며,
			//변수 선언 전 해당 데이터가 어떤 타입을 가지는지 타입을 붙여 명시한다.
			//byte는 정수에 해당하는 타입이므로, 같은 변수명을 생성해도 문자, 실수 데이터는 오류로 반환한다.
			//노란줄 : 경고의 의미 빨간줄은 무조건 문제(이 경우, 변수는 만들었는데 사용 안해서)
		
		char ch = 'a';
			//따옴표의 구분을 명확히 해야 한다
			//큰 따옴표 = 문자열(2개 이상인 문자에 쓰는 경우)
			//작은 따옴표 = 문자(1개만 쓰는 경우)
		
		float fnum = 3.14f;
			//소수점을 저장 : 단 저장하려는 데이터 뒤에 f를 붙여야 한다.
			//의미는? : 
		
		double dnum = 12.345;
			//float와 달리 f 표기가 필요없다.
		
		boolean isTrue = false;
			//false, true 중 하나를 표현
		
		String word ="이순신";
			//얘는 클래스(=사용자 정의 타입)
		
		//사각형의 넓이를 구하시오(밑변, 높이는 정수이다.)
		
		int width = 15;
		int 높이 = 20;	//변수명은 어지간해선 영어로 써라
		int area = width*높이;
		
		System.out.println("넓이 : "+area);

		//키보드 30개를 구매할 때 개당 8000원일 경우 총 구매 금액은?
		
		int keyboard =30;
		int price = 8000;
		int buy = keyboard*price;
		
		System.out.println("java 출력방법 print");
		System.out.println("줄바꿈 안 된다");
		System.out.printf("printf \n 출력 : ");
			//System.out.printf(word, args);
			//차이점은 문자열 사이에 \n을 입력하면 이 단어를 기준으로 줄바꿈이 된다 
			// \n = 엔터키(의 역할) : 서식문자(형식지정문자 라고도 함)
		System.out.printf("총금액 : %d", buy );
				//이하 %와 같이 사용하는 서식문자
				//d, u, f : 10진수
				//c : 문자
				//s : 문자열
				//b : boolean(true, false 값 구분)
				//o : 8진수
				//x : 16진수
		System.out.printf("국어 : %d점 수학 : %d점", 80, 90);
			//입력한 순서에 따라 출력된다.
		System.out.printf("나이 : %d 키 : %d", 34, 173.5);
		System.out.printf("%5d",3);
			//5자리가 들어가는 공간을 확보하겠다.
	}
	
}

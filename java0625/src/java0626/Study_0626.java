package java0626;

import java.util.Scanner;

public class Study_0626 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("자바출력");
			//system.in : 입력
			//입력받는 내장 클래스 : Scanner
		
		Scanner scan = new Scanner(System.in);
			//단 import를 이용해 경로 지정을 해줘야 함.
			//일일이 입력할 것 없이 Scanner 아래 붉은 줄이 떠 있으면 그것을 클릭해 import 'Scanner'클릭
		
		//int a = scan.nextInt();
			//float 타입 : nextFloat();
			//double 타입 : nextDouble();
			//byte 타입 : nextByte();
			//short 타입 : nextShort();
			//단 위와 같은 메소드 방식으로는 '문자' 방식이 없다.
			//	>> nextLine, next()로 문자'열'은 가능
		
		//System.out.println(a);
		
	//int ramen, kimbob, milk;

	//System.out.print("대게라면 가격 : ");
	//ramen = scan.nextInt();
	//System.out.print("삼각김밥 가격 : ");
	//kimbob = scan.nextInt();
	//System.out.print("바나나우유 가격 : ");
	//milk = scan.nextInt();
	
	//int total = ramen+kimbob+milk;
	//System.out.println("점심값 : "+total+"원");
		//혹은 : system.out.printf("점심값 : %d원 \n", 지불금액);
		
		
	int floor = 5;
	float sec = 3.4f;
	int dbway = 4;
	
	float total = (floor-1)*sec*dbway;
	
	System.out.println(total);
	
	/*
	 프로그램 작성 팁 : 
		1) 순차적으로 진행 되는 것이 기본이다.
		2) 변수 선언 방법의 예시
			-int num : 정수 타입 변수
			-double dnum : 실수 타입 변수
			-char ch : 문자 타입 변수
			-boolean bool : 참 거짓 변수
		3) 변수 초기화
			int num =10; << 변수 선언과 함께 데이터를 저장
		4) 출력 : 
			System.out.println(출력내용);
			System.out.print(출력내용);
			System.out.printf(출력내용);
			 - printf의 경우 형식지정자(%d 등)를 함께 사용할 수 있다.
			 - 그 종류 : 정수(d, u), 실수(f), 문자(c), s(문자열)
			 - 예시 ;
			 int age = 28;
			 System.out.printf("%s마을에 있는 %d살 %c씨", "코딩빌", age, "이");
			 
		5) 입력 방법 :
			Scanner 클래스 객체가 필요
			Scanner는 내장 외부클래스이므로 import 요소가 필요함
			Scanner 변수 = new Scanner(System.in);
				변수.next~? : Int() int 타입 / Byte() byte 타입
							 Short() short 타입 / Long() long 타입
							 	까지는 정수만 입력
							 Float() float 타입/ Double() double 타입
							 	위 둘은 실수만 입력
							 () 그러니까 그냥 next(); / Line();
							 	위 둘은 문자열 입력
							 ※'문자' 자체는 입력 못 해!
							 
		변수 입출력 문제 할 예정
	 */
	
	int clan, java, archi;
	
	System.out.print("c언어 시험 점수 : ");
	clan = scan.nextInt();
	System.out.print("자바시험 점수 : ");
	java = scan.nextInt();
	System.out.print("건축학개론 시험 점수 : ");
	archi = scan.nextInt();
	
	int total1 = clan+java+archi;
	int ava = total1/3;
	
	System.out.printf("세 과목의 총점은 %d점이고 평균은 %d점이다.", total1, ava);
	
	}
}

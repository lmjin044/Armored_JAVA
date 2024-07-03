package java0703;

import java.util.Scanner;

//오늘의 목표 : 클래스를 이용한 방법으로 정수 2개를 입력 받아 합을 출력해보자! 	
public class Study_0703_2 {
	
	public static void main(String[] args) {

	Calc calc = new Calc(); 
		//클래스 Calc내에 있는 객체를 불러오기
		//그래서 Calc 클래스를 불러오기 위해 calc로 이름을 지정함.
		//인스턴스 메서드(or 변수)는 인스턴스(=객체)를 통해 사용함
		//클래스 메서드(or 변수)는 클래스 이름으로 사용함.
//--------------------------------------------------------
		calc.sum(); 	 // 1) : 1)메서드 참조
		calc.sum(40, 10);// 2) : 이 경우에는 이미 데이터가 입력되어있음 = 계산과 출력만 하면 됨. 
		System.out.println();
//--------------------------------------------------------
		int kor=89, eng=74, mat=43; //3)
		calc.sum(kor, eng, mat);	
		System.out.println();
//--------------------------------------------------------
		calc.easy(); //4) : 호출이 별건가 이게 호출 방식임. 
					 //  = class calc 안에 있는 인스턴스 메서드 easy를 호출해라.
		System.out.println();
//--------------------------------------------------------
		calc.view(); //5)
		System.out.println();
//--------------------------------------------------------
		calc.candy(); //6)
		System.out.println();
//--------------------------------------------------------
	testMethod test = new testMethod();	
	
		String dog = "골든리트리버";
		String notice="2024-07-01";

		test.animalFarm(dog, notice);
		System.out.println();
//--------------------------------------------------------	
	//8)문자열 subString 혹은 split을 사용해 문자열 메서드에서 월, 일만 출력하시오.
		String examDate = "2024-08-13"; 
		String month= examDate.substring(5,7);
		String day = examDate.substring(8,10);
		
		test.testDate(month, day);
		System.out.println();

	//8-1)split으로 이용했을 경우
		test.dayPrint(examDate);
		
		System.out.println();
		System.out.println();
//--------------------------------------------------------	
	//9) 네 사람의 나이 평균 값(정수)을 구하여 출력할 것
		int 흥민=31, 강인=23, 희찬=28, 재범=31;
		test.ava(흥민, 강인, 희찬, 재범);
		System.out.println();
//--------------------------------------------------------	

	}
}




//--------------------------------------------------------	
class testMethod{
//--------------------------------------------------------		
	void ava(int 흥민, int 강인, int 희찬, int 재범) {//9)
		int ava = (흥민+강인+희찬+재범)/4;
		System.out.printf("네 사람의 나이 평균은 %d세 입니다.", ava);
	}
//--------------------------------------------------------	
	void testDate(String month, String day) {//8)
		System.out.printf("시험 일자는 %s월 %s일 입니다.", month, day);
	}
	//혹은 이렇게 해도 됨.
	void dayPrint(String date) {//8-1)
		String[] dDay = date.split("-");
		System.out.printf("시험 일자는 %s월 %s일 입니다.",dDay[1], dDay[2]);
	}
//--------------------------------------------------------
	void animalFarm(String dog, String notice) {//7)
		System.out.println("품종 : " + dog);
		System.out.println("입양공고일 : "+notice);
	}
}
//--------------------------------------------------------
class Calc{
//--------------------------------------------------------	
	void candy() {//6)
		String name = "이미진";
		int age = 30;
		System.out.println("이름 : "+name+"/ 나이 : "+age);
	}
//--------------------------------------------------------	
	void view() {//5)
		int a=10, b=20;
		System.out.println("a의 값은 "+a+"이고 b의 값은 "+b);
	}
//--------------------------------------------------------	
	void easy() {//4)
		System.out.println("메서드 댕쉽네");
	}
//--------------------------------------------------------		
	void sum(int k, int e, int m){//3)
		int result = k+e+m;
		System.out.println("세 과목 총점 : " + result);
		}
//--------------------------------------------------------	
	void sum(int num1, int num2) {//2)
		//단 이 경우에는 매개변수를 받는 방식
		int result =num1+num2; 
		System.out.println("두번째 방식의 합 : "+result);
	}
//--------------------------------------------------------	
	void sum(){//1)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요 >> ");
		int num1 = scan.nextInt();
		
		System.out.println("두 번째 정수를 입력하세요 >> ");
		int num2 = scan.nextInt();
		
		int result = num1+num2;
		System.out.println("첫번째 방식의 합 : "+result);
	}
}
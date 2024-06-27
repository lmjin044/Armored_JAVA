package java0627;

import java.util.Scanner;

public class Study_0627_1 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	//조건문 : if, switch
	//if문의 조건식 : 비교연산자와 논리연산자로 식을 구성함
	//			   이상~이하(<= , >=), 일치(==)
	//			   즉 참과 거짓으로 나올 수 있는 식을 의미
	//	예시 : '판매중인 상품들만 출력한다'고 하면 >> 상품상태 == 판매, 재고수량>0 조건 설정. 
	
	int tall = 135;
	if(tall>=150){
		//키가 150이상일 경우 무엇을 할 것인가?
	}else {
		//키가 150이 아니라면 무엇을 할 것인가?
	}
	
	//문제 : 합격(60이상), 불합격(60미만)
	/*
	score = 72;
	if(score >=60) {
		System.out.print("합격입니다.");
	}else {
		System.out.print("불합격입니다.");
	}
	//하나의 조건에 2개의 내용이 있을 때 사용합시다.
	
	score = 89;
	if(score>=90) {
		System.out.print("a");
	}else if(score>=80){
		System.out.print("b");
	}else {
		System.out.print("c");
	}
	*/
	//90보다 작고(첫번째 조건은 거짓) 80보다는 클 때(두번째 조건은 참) b가 출력
	//80미만이면 (두 조건 모두 거짓) c가 출력

	//문제 : A등급 이상 = 90이상, B등급 = 80이상, C등급 = 70이상, 아니면 D가 출력
	
	System.out.print("성적 : ");
	int level = scan.nextInt();
	if(level>=90) {
		System.out.print("A등급입니다.");
	}else if(level>=80) {
		System.out.print("B등급입니다.");
	}else if(level>=70) {
		System.out.print("C등급입니다.");
	}else {
		System.out.print("D등급입니다.");
	}
	

	//switch 문에 대해 알아보자.
	//실행 조건을 case로 설정해 case와 일치하는 값일 경우 발동되는 조건문
	//스네이크 게임 만들기
	//	이동 : w(위), a(왼), s(아래), d(오른)
	//	기타 : p(일시정지), o(계속하기), i(처음부터 다시시작), ctrl+s(시작)
	/*
	switch(키보드값) {
		case 'w' :
		case 'a' :
		case 's' :
		case 'd' :
		case 'p' :
		case 'o' :
		case 'i' :
		case 'ctrl':
			switch(키2) {
				case 's' :
			}
		}	
		switch(menu) {
			case "open" :
			case "save" :
			case "build" :
			case "git" :
			case "exit" :
		}
	*/
		//조건식 연산자에 == 가 사용된다면 switch도 좋은 옵션이 될 수 있다.
	
		String button = "종료";
		
		switch(button) {
			case "시작" :
				System.out.println("게임 시작");
				break;
			case "자동저장" :
			case "저장" :
				System.out.println("게임 저장");
				break;
			case "종료" :
				System.out.println("게임 종료");	
		}
		
		//가로, 세로의 길이를 키보드로 입력하시오
		//둘 중 하나가 나머지보다 크면 직각사각형
		//가로와 세로의 길이가 같다면 정사각형으로
		//단 if문이 아닌 switch문으로 할 것.
		
		int width = 0;
		int height = 0;
				
		System.out.print("가로의 길이는 : ");
		width = scan.nextInt();
		System.out.print("세로의 길이는 : ");
		height = scan.nextInt();

		int res = width - height; 
		
		switch(res) {
			case 0:	
				System.out.println("정사각형");
				break;
				//가로와 세로가 같다면 뺄셈을 했을 때 0이 나옴
			default :	
			 //default = switch문에서 1번만 사용가능
			 //		     switch문에서 case에 일치하는 것이 없을 때 실행됨
			 //			 주어진 case와 일치하는게 없을 때 default를 실행 후, 종료됨
			 //			 그래서 switch문 맨 마지막에 배치(break도 안 씀)
				System.out.println("직각사각형");
				//가로와 세로가 다르므로 뺄셈을 했을 때 0이 아닌 수가 나옴
				//res의 타입이 int로 설정했기 때문에 !0(=0이 아니다)를 지정하려고 해도 안됨
				
		}
				
		
		
		
	}
		
	
	
	
	
	
	
	}

package java0715_1;

import java.util.Scanner;
import java.util.Stack;

public class StackStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Stack<String>st = new Stack<>();
//		
//		st.add("이순신");		
//		st.push("김유신");	//stack 전용 메서드.
//		st.push("김춘추");
//		st.push("장보고");
//		st.push("김종서");
//		
//		System.out.println(st);	
//			//배열의 형식으로 출력됨 = 0~4번 인덱스.
//			//이순신은 가장 아래에 저장되어 있음.
//		System.out.println(st.pop());
//			//스택 출력 메서드. 가장 위에 있는 것을 빼내는거.
//		System.out.println(st);
//			//그래서 이 시점에서 다시 확인하면 출력된 김종서가 배열에서 사라짐.
//		System.out.println(st.search("김춘추"));
//			//김춘추는 2번 인덱스(3번자리)에 있음을 확인.
//		System.out.println(st.size());
//			//st.size는 스택의 인덱스 크기를 확인하는거.
//			//만약 '김춘추'를 꺼내려면 pop메서드를 몇 번 실행해야 하는지 알아야 함.
//		
//		System.out.println(st.isEmpty());
//			//비어 있으면 true, 아니면 false를 출력하는 메서드.
		
		Stack<String> pre = new Stack<>();
		Stack<String> back = new Stack<>();
		
		String now = "네이버";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("이동페이지 입력 (1. 뒤, 2. 앞)");
			String temp = sc.nextLine();
			if(temp.equals("1")&& !back.isEmpty() ) {	//이전 페이지 이동
				pre.push(now);	//현재 페이지는 이전 스택에 저장.
				now = back.pop();
				
			}else if(temp.equals("2")&& !pre.isEmpty()) {//앞 페이지 이동
				back.push(now);
				now = pre.pop();
				
			}else if(!(temp.equals("1") || temp.equals("2") )){	//새 페이지 이동
				back.push(now);
				pre.clear();	//완전히 비우는 메서드(클래스는 Vector)
				now = temp;
			}
			System.out.println("현재 페이지 : " + now);
			System.out.println("back 페이지 목록 : " + back);
			System.out.println("pre 페이지 목록 : "  + pre);
		}
		
		
		
		
		
		
		
		
		
	}

}

/*
Stack? : 입구(데이터 저장)와 출구(출력)은 같다.
 		 한 곳에서 저장과 출력이 이루어지는 구조.
 		 FILO = First In Last Out
 		      = 가장 처음에 들어온 것이 가장 마지막에 나간다.
 		      = 데이터의 입력이 이른 순서일수록 출력 순서는 가장 마지막.
	

*/
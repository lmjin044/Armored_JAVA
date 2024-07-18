package java0718_Thread1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MyThread th = new MyThread(); //여기는 객체 생성	
	//이대로만 하면 쓰레드가 실행되지 않아서 실제 실행은 아래 메서드를 추가해야 한다.
	th.start();
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("숫자 입력 : ");
//	int num = sc.nextInt();
//	System.out.println(num);
//		//입력은 입력대로 하고 반복문은 반복눈대로 출력되는 형태임.
		
		
	}
}


class MyThread extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+"번째 반복하는 메인 쓰레드입니다.");
		try {	//이렇게 하면 1초에 1번씩 출력이 가능함.
			Thread.sleep(1500);
		}catch(InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
}	
	
	

/*
프로세스 = cpu에 의해 ram에 로드 되어있는 프로그램
	  = 실행중인 프로그램이 들어있는 것
	  = 102개의 프로세스란 곧 102개의 실행중인 프로그램이라는 뜻.
 ※실행 중 프로세스 확인하는 방법
 	1)작업관리자에서 '프로세스' 탭 선택
 	2)명령프롬프트를 실행해 cmd를 입력한 후 tasklist 입력.
 		※프로세스 종료는 taskkill 혹은 pid[pid값] 입력해도 됨
 
 쓰레드 = 프로세스 안에서 실제 동작을 수행하는 단위
      = 쓰레드 추가하면 복수의 여러 동작을 수행할 수 있다.
   - 자바 쓰레드의 쓰레드 생성자 사용하는 방법
   	1) Thread() : 새로운 쓰레드 객체 할당.
   	2) Thread("이름") : 새로운 쓰레드 객체를 할당하면서 이름도 부여
*/
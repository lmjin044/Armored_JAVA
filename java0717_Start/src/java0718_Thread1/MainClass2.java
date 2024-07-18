package java0718_Thread1;

import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) throws InterruptedException {
		Th1 th = new Th1();
		new Thread(th).start();
	
			//Runnable 인터페이스에서는 run 메소드만 있다.
			//start를 쓰려면 인터페이스 항목에 start가 존재해야 함.
			//그리고 이건 일반 객체가 되어버림.
		for(int i=1; i<=5; i++) {
			System.out.println("비야 좀 오지 마라"+i);
			Thread.sleep(2000);
		}
	}

}

class Th1 implements Runnable{
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println(""+num);
	}
}
/*
 인터페이스를 이용한 쓰레드 만들어보기 
 */
 
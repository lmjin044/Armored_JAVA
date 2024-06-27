package java0627;

import java.util.Scanner;

public class Study_0627_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		//반복문 : for, while, do-while 에 대해 알아보자.
		//구성 : for(초기값; 조건식; 증감식){
		//			반복할 내용}
		//		거짓이면 중괄호{}내 내용 실행 안 됨
		//		반대로 참일 경우 = 
		//			초기값 > (조건식 비교 > 참 확인 > 중괄호 내 내용 실행 > 증감식)
		//			이후 거짓이 될 때까지 괄호()내 구간 반복 후 종료
		int i;
		
		for(i=1; i<10; i++) {
			int k = 2*i-1;
			System.out.println(k+"번 반복 중....");
		}
		//혹은 조건은 for(i=1; i<=17; i+=2){~}로 진행해도 된다.
		//아니면 k를 별도로 만들긴 했는데 걍 실행내역에 식을 옮겨도 되거나.
		
		/*
		int num =1;
		int a=1;

		num = num+a;
		System.out.println(num);
		a++;
		
		
		
		for(a=1; a<=3; a++) {
			num = num+a;
			System.out.println(num);
		}
		
		*/
		//1부터 내가 입력한 숫자의 총 합을 구하시오.

		System.out.println("숫자를 입력하시오 : ");
		int num = scan.nextInt();
		
		int sum=0;
		for(int a=1; a<=num; a++) {
			sum = sum+a;
		}
		System.out.print("총합은 : "+sum);
	
	
	}
	

}

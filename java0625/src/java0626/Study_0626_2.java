package java0626;

import java.util.Scanner;

public class Study_0626_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String name = new String();
		name = scan.nextLine();

		String part = new String();
		part = scan.next();

		int money;
		float pay = 0.08f;
		
		money = scan.nextInt();
		
		float loss = money*pay;
		float after = money-loss;
		
System.out.println(part+"부서 "+ name+" 사원님의 금월 실 수령액은 "+after+"만원 입니다.");
		
		
		
	}

}

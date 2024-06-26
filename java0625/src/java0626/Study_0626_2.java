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
		//part를 먼저 했더라도 내가 처음 변수를 name 부터 했기 때문에 입력은 name부터 받는다.
		
		
	}

}

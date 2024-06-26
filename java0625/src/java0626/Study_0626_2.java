package java0626;

import java.util.Scanner;

public class Study_0626_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
/*
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
		*/
		
		String name, dept;
		int money;
		float tex = 0.08f;
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("부서 : ");
		dept = scan.nextLine();
		
		System.out.print("월 급여 : ");
		money = scan.nextInt();
		
		int salary = (int)(money-(money*tex));
			//원래라면 세금 부분이 정수이기 때문에 int를 받을 수 없음
			//강제형변환 : 위 경우를 예시로 들겠음.
			//타입명 변수명 = (변환하고자 하는 타입)(계산 내용);
			//정수에서 실수는 자동으로 가능하지만 실수에서 정수로는 형변환 필요
		
		
		//아니 왜 커밋이 안되는거야ㅏㅏㅏㅏㅏㅏ
		//나 개구리 커밋짤이 되어버려ㅓㅓㅓㅓㅓ
	}

}

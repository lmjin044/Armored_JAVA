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
		int salary;
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("부서 : ");
		dept = scan.nextLine();
		
		System.out.print("월 급여 : ");
		money = scan.nextInt();
		
		salary = (int)(money-(money*tex));
			//원래라면 세금 부분이 정수이기 때문에 int를 받을 수 없음
			//강제형변환 : 위 경우를 예시로 들겠음.
			//타입명 변수명 = (변환하고자 하는 타입)(계산 내용);
			//정수에서 실수는 자동으로 가능하지만 실수에서 정수로는 형변환 필요
			//혹은 salary는 int로 받겠다고 위에서 설정하고, 여기서 salary에 대한 정의를 내려도 됨

		//이거는 1명만 출력이 가능한거
		//2번 출력?
		//
		
		System.out.println("이름 : "+name+ "/ 부서 : " +dept+ "/ 수령액 : "+salary+"만원");
		
		scan.nextLine();
	
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("부서 : ");
		dept = scan.nextLine();
		
		System.out.print("월 급여 : ");
		money = scan.nextInt();
		
		salary = (int)(money-(money*tex));
		System.out.println("이름 : "+name+ "/ 부서 : " +dept+ "/ 수령액 : "+salary+"만원");

		//2번 입력이 안되는 이유 : 엔터키 입력 또한 입력 그 자체로 받아버려서 생략이 되어버림.
		//그래서 변수선언은 1번만 하되 명령어만 다시 추가로 입력하고
		//그 위에 엔터 입력을 받을 임의의 scan메서드를 하나 설정해준다.
		/*
		next(); : 공백(스페이스, 탭, 엔터)키를 누르면 입력 끝 = 띄어쓰기 불가
		nextLine(); 오직 엔터키를 눌러야 입력 끝 = 띄어쓰기 가능
		
		*/

	}

}

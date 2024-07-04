package java0704;

import java.util.Arrays;
import java.util.Scanner;

//오늘의 목표 : 어제의 연장이다!(메서드 호출
public class Study_0704_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodUtil util = new MethodUtil();
//----------------------------------------------------
//문1) 2개의 정수를 반환하기
		int[] num = util.twoNum();
		
		System.out.println(Arrays.toString(num));
//---------------------------------------------------	
//문2) 사각형의 너비와 높이를 설정 후, 넓이를 출력하시오.
//	  넓이는 main메서드에서 출력되도록 하시오.		

	int area = util.squareArea();
	System.out.println("넓이 : "+area);
//----------------------------------------------------
//문3) class MethodUtil 부분, 로그인 메서드의 ?를 채우고 실행해 로그인 여부를 출력하시오.
//이때, 아이디는 skyblue, 비밀번호는 1234sea이며 모두 만족해야 로그인 성공을 출력, 둘 중 하나라도 틀리면 실패.
/* 마찬가지로 이쪽도 ?채우기
 ? isFail = ?
 	if(?){
 		?
 		?
 	}else{
 		?
 	}

	boolean isFail = util.login();
		if(isFail) {//아이디 비밀번호가 일치했을 경우
			System.out.println("로그인에 성공하였습니다.");
			return;
		}else {//아이디 비밀번호가 불일치할 경우
			System.out.println("로그인에 실패하였습니다.");
		}
		 */
//----------------------------------------------------
/*문4)정수 3개를 키보드로 입력 받아 출력하시오.
 조건 1)정수 셋의 합이 100을 넘길 경우 100-(세 정수의 합)을 출력할 것.
 조건 2)정수 셋의 합이 100을 넘기지 못할 경우 세 정수의 합을 출력할 것. */
	
		int total = util.sumTotal();
		System.out.println(total);
//----------------------------------------------------

	}
}
	







class MethodUtil{
//----------------------------------------------------
//문4)
	int sumTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 숫자를 입력하시오 : ");
		int num3 = sc.nextInt();
		
		int sum = (num1+num2+num3);	
		
		if (sum>100){
			return 100-sum;
		}else {
			return sum;}
	}
//----------------------------------------------------
/*문3 ? 채우기 :
 ? login(){
 	Scanner sc= new Scanner(System.in);
 	System.out.print("아이디 : ");
 	String id = ?;
 	System.out.print("비밀번호 : ");
 	String password = ?;
 	?
 	?
 	?
 	?
 	?
 	?
 }
 
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String password = sc.nextLine();
		
		boolean pass = true;
		if(id.equals("skyblue") ) {
			if(password.equals("1234sea") )
			return pass;
		}//아이디와 비밀번호가 모두 참일 경우 반환될 것
		return pass = false;
		//그렇지 않을 경우 반환 될 것
	}
	*/		
//----------------------------------------------------
//문2)
	int squareArea() {
		int width = 40, height = 50;
		int area = width*height;
			//참조 변수를 만들어 놓으면 메소드가 종료되어도 사라지지 않음.
		return area;
		//int[] temp = new int[] {width, height};
		//return temp;
		}
	

//----------------------------------------------------	
//문1)	
	int[] twoNum() {
		int num1=20, num2= 50;
		int[] temp = new int[] {num1, num2};
		return temp;
			//return은 마침표와 같아서 한번만 쓰는 것.
			//num2를 반환시키겟다고 return num2; 써봐야 안 된다는 소리.
			//그러므로 두 정수를 임시로 배열에 만들어 return에 남길 1개의 값만 남긴다.
			//return temp;여도 되고 return new int[]{num1, num2}; 여도 됨.
		//※또한 return으로 도출할 것이 배열이 되면, 그것을 받아줄 메서드도 배열로 타입을 만들어야 한다.
	}
	
}

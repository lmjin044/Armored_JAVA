package java0704;

import java.util.Scanner;

public class Study_0704_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------절 취 선------------------------------		
//문제 : 컴퓨터와 가위바위보를 하자.
//	    컴퓨터는 이미 입력된 comInput메서드를 사용한다. 
//		유저의 가위바위보는 한글로 입력한다.
//		결과는 승, 무, 패로 출력한다. 	
		
		Game rcp = new Game();
		rcp.comInput();
		rcp.userInput();
		rcp.result();
//----------------------절 취 선------------------------------		
		
//----------------------절 취 선------------------------------		
	}

}




class Game{//가위바위보 게임 만들기
	String com;
	String user;
	
	void comInput(){
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0: this.com="가위";break;
			case 1: this.com="바위";break;
			case 2: this.com="보";break;
			}
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("가위, 바위, 보 중 하나를 입력하세요 : ");
		String rcp = sc.nextLine();
		switch(rcp) {
			case "가위": this.user="가위";break;
			case "바위": this.user="바위";break;
			case "보" : this.user="보";break;
			default :System.out.println("다시 입력해주세요."); userInput(); break;
			}

	}
	
	void result() {
		if(user ==null || com == null) {
			System.out.println("오류가 발생했습니다. 다시 입력해주세요."); return;
		}
		if(user.equals(com)){
			System.out.printf("유저 %s, 컴퓨터 %s로 무승부", user, com);
		}else if(
		  (user.equals("가위") && com.equals("보")) ||
		  (user.equals("바위") && com.equals("가위"))||
		  (user.equals("보")  && com.equals("바위")) ){
			System.out.printf("유저 %s, 컴퓨터 %s로 유저 승", user, com);
		}else {
			System.out.printf("유저 %s, 컴퓨터 %s로 컴퓨터 승", user, com);
		}

	}
//----------------------절 취 선------------------------------		
//----------------------절 취 선------------------------------		
//----------------------절 취 선------------------------------		
//----------------------절 취 선------------------------------		
}
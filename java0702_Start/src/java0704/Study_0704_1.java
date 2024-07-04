package java0704;

import java.util.Scanner;

public class Study_0704_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------------------------------------------
		/*해결법 1) 단순하게 딱 2명일때.
		Dice game = new Dice();
		int sDice = game.getDice("석완");
		int hDice = game.getDice("형준");
		game.result(sDice, hDice);
		*/
		
		Dice game = new Dice();	//해결법 2) 참가자 n명
		game.init();
		game.diceThrow();
		game.result();
	}

}

class Dice{
	//해결법2) 배열을 사용하기 : 왜 이렇게 하나요?
	//					  참가자가 2명 이상일 때 워쩌시려고?
	String[] names;
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("주사위 게임 참가 인원 : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
			//참가(=입력)하는 인원수 만큼 배열의 크기가 변화함
		sc.nextLine();
			//숫자 다음에 문자열 입력할 때 엔터값 때문에 스킵되는 오류가 발생함
		for(int i =0; i<names.length; i++) {
			System.out.println("참가자 이름을 입력 하세요 : ");
			names[i]=sc.nextLine();
				//names 배열에 데이터를 집어 넣음
				//그냥 실행하면 문제가 있다?? :
				// 숫자 입력 > 엔터 > 문자 입력 단계에서 엔터 또한 입력 값으로 인식됨
				// = 첫번째 참가자 이름을 적을 수 없다. 이걸 '버퍼 비우기'라고 해야 함
			
		}
	 
	}
	void diceThrow() {
		for(int i=0; i<names.length;i++) {
			this.diceNum[i] =(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"주사위 : "+this.diceNum[i]);
		}
	}
	void result() {//주사위 결과와 비교를 담당할 것
		int max=0; //1) 가장 큰 주사위 값 찾기
		for(int num : diceNum){//2)배열 내 데이터를 기준으로 찾을 것이므로 배열 전용 반복문
			if(max<num) max=num;	//max에 저장한 수보다 diceNum으로 받은 것이 더 크면 그것을 max로 저장
		}
		boolean isSame = true;	//주사위 값이 전부 동일할 경우
		for(int num : diceNum) {
			if(num != max) isSame = false;	//단 한 명이라도 다른 수가 나왔다면 거짓으로 도출
		}
		if(isSame) {
			System.out.println("모든 참가자들의 주사위 값이 동일, 무승부");
			return;	//모든 참가자의 주사위가 같을 경우 즉시 종료되어 아래 구문은 실행되지 않는다.
		}
		for(int i=0; i<diceNum.length; i++) {//가장 큰 주사위값을 가진 사람들이 이김
			;
			if(diceNum[i] == max) {
				System.out.println(names[i]+" 승");
		}
		
		
	}
}	
	
//---------------------------------------------------------	
	/*해결법 1)
	void result(int s, int h) {
		//비교를 위한 메서드 >> 메서드 바깥에 이미 데이터가 있다 = 매개변수 가져와라
		//void 썼다 = return 안쓴다.
		if(s>h) {
			System.out.println("석완 승, 형준 패");
		}else if(h>s) {
			System.out.println("형준 승, 석완 승");
		}else {
			System.out.println("무승부");
		}
	}
	
	int getDice(String Name) {//누구의 주사위를 쉽게 가져오는지 알기 위해 매개변수 사용

		int num = (int) (Math.floor(Math.random()*6)+1);
			//두 사람의 주사위는 어차피 동일한 식을 가지니 1개만 만들면 됨
		System.out.println(Name+"주사위 : "+num);
		return num;
	}
	*/
}
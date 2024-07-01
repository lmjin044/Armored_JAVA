package java0701;

import java.util.Scanner;

public class Study_0701_2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

/*
 배열의.... 생성방법과 데이터를 저장하고 그 데이터를 추출하거나 출력까지 해보자
 배열의 장점 : (순차적으로 작업한다는 전제 아래) 빠름!

 빙고 만들기 순서 : 
 1) 25의 크기를 가지는 배열을 선언하기
 2) 배열에 랜덤한 숫자를 저장할 것
 	-1)숫자가 중복되지 않도록
 	-2)5X5 배열로 저장할 것
 3) 숫자를 화면에 출력
 4) 게임을 시작해 숫자를 선택한다(입력)
 5) 선택한 숫자를 그 숫자가 위치한 자리에 표시하기
 6) 빙고가 형성되었다면 그 빙고가 몇 줄인지 카운트
 7) 빙고판을 화면에 출력
 


	int[] bingo = new int[25]; //1)
	
	for(int i=0; i<bingo.length; i++) {	//2
		bingo[i] = (int)(Math.random()*50)+1;
		for(int k=0; k<i; k++) {		//2-1 
			if(bingo[k] == bingo[i]) {	//i인덱스에 있는 값과 k인덱스에 있는 값을 비교해 같으면(=중복되면)
				i--; break;				//i인덱스의 위치를 다시 설정하도록 최상위의 i값을 대신 제어할 -값을 추가
	//※헷갈리기 쉽지만, 지금 위 구문은 데이터 자체를 바꾸는게 아니라 데이터가 자리한 '위치'만 바꾸는거다.
				
			}
		}	
	}
while(true) {
	for(int i=0; i<bingo.length; i++) {		//2-2)
		if(i%5==0) {
			System.out.println();
		}
		if(bingo[i]==0)
			System.out.printf("%2c", '■');//%c는 문자 출력
		else
			System.out.printf("%2d", bingo[i]);	
	}
	
		System.out.print("\n빙고 숫자를 입력하세요 : "); //3)
		int num = scan.nextInt();				   //4)
		
		for(int i=0; i<bingo.length; i++) {
			if(num==bingo[i]) {
				bingo[i]=0; break;				//5) : 입력한 숫자가 빙고에 있으면 0으로 바꾸기
			}
		}
	}

	int 가로 =0; 
	int 세로 =0;
	int 대각선1=0;
	int 대각선2=0;
	int end=0;									//6)

	for(int i =0; i<5; i++) {
		for(int k=0; k<5; k++) {
			if (bingo[i*5+k] ==0) 가로++;
			if (bingo[k*5+i] ==0) 세로++;
		}
		if(bingo[i*6] ==0 ) 대각선1++;
		if(bingo[i*4+4] ==0 )대각선2++;
		
		
		if(대각선1 ==5) end++;
		if(대각선2 ==5) end++;
		if(가로 == 5) end++;	//가로 1줄이 되었을 때 end에 1을 더함
		if(세로 == 5) end++;
		
		가로=0;
		세로=0;
		


	if(end ==5) {
		System.out.println("5줄빙고 완성");		//7)
		break;
	}
 */




}

}

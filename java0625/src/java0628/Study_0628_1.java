package java0628;

import java.util.Scanner;

public class Study_0628_1 {
	
static Scanner scan = new Scanner(System.in);
		//퍼블릭 스태틱 보이드 구문 아래로 영향을 주려면 앞에 static을 붙여라
	public static void main(String[] args) {

		
		/*
		for(int i=1; true; i++) {
			System.out.println(i);
		}
		이러면 무제한으로 1씩 추가되는 무한루프 발동(엔간해선 쓰지 말자 컴 렉먹는다)
		
		※반복문 작성 요령
			1)반복문의 '종료'시점을 먼저 고려해야 함
			2)몇 회 반복한 후 종료되어야 하는지 생각할 것.
			3)for, while, do-while 모두 반복 종료시기를 찾지 못하면 작성 불가
				(무한루프, n회 반복 모두 해당)
			
			만약 위 예시 구문에서 10000까지 반복하고 싶다고 하면?
			for(int i=1; true; i++) {
				if(i>10000) break;			<<로 정지 조건을 설정해야 한다.
				System.out.println(i);
			}
		
		
		
		for(;true;) {
			System.out.print("정수 입력 : ");
			int num= scan.nextInt();
			if(num == 0)break;
		}
		 
		  무한 루프 종료하는 방법
		  	1)if 조건식이 '참'이 되었을 때 break가 실행
		  	2)반복문의 조건식에 true 조건 사용
		  	3)return 사용 : 반복문코드가 있는 메서드를 종료하므로 반복문도 종료함
		  		※break : 반복문, switch에 사용가능(if문 단독으로는 불가)
		  		※continue : 다음 반복문으로 넘어가라	  		
		  
		for(int i = 1; i<=10; i++) {
			System.out.println(i+"번째 반복 시작");
			if(i%3==0) continue;
			System.out.println(i+"번째 반복 진행중");
			System.out.println(i+"번째 반복으로 마지막");
			
			이러면 1번째 시작, 진행중, 마지막 순서로 1사이클을 돌리고 2, 3... 이후로도 진행
		}
		
		//자바의 랜덤
		
		int random = (int)(Math.random()*50)+1;
			//타입을 지정해야 자바에서도 랜덤값을 사용가능
		for(;true;) {
				//임의로 50까지의 수 내에서 반복적으로 숫자를 출력해야 하므로 무한루프를 건다
			int num1 = (int)(Math.random()*50)+1;
				//Math.floor을 사용하지 않아도 어차피 int를 통해 정수로 강제형변환이 된다
				//int num1 =Integer.parseInt(Math.floor(Math.random()*50)+1);
				//parseInt는 문자열을 정수로 변경할 때 사용(실수 불가)
			if(num1%11==0)break;
				//11의 배수를 찾아야 하므로 num1을 11로 나눴을 때 나머지가 0인 것을 찾는다.
			System.out.println(num1);
		}
		
		
		//up&down?
		//컴퓨터가 제시하는 숫자를 맞출 것(범위는 20~100)
		
		System.out.println("20부터 100까지 임의의 숫자가 제시됩니다. 맞춰보세요!");
		int com = (int)(Math.random()*81)+20;
			//이래야 100까지 수가 나온다.
		for(;;) {
			System.out.print("내가 제시하는 숫자는? >> ");
			int user = scan.nextInt();
			if(user == com){
				System.out.println("정답! "+com+"이었습니다!");
				break;
			}else if(user > com) {
				System.out.println("Down!");
			}else {
				System.out.println("UP!");
			}
		}
		*/
		
		//자바 스크립트에서 안 했던 for문?(코드 분석이 어렵게 만드는 놈이라 애용은 하지말자)
		
		int sum =0;

		
		더하기:for(int i=1; i<=10; i++) {//이 for문의 이름은 이제 '더하기'입니다.
			for(int k=1; k<=4; k++) {
				if(sum+k>=40)break 더하기;
				//만약 40이상 넘기면 그만 출력하게 만듬.
				//단 두번째 for문 안에서만 영향이 있는 break다.
				//지정된 이름이 없으면!
				sum = sum+k;
				System.out.println(i+" "+k);
				//이거 전부 더하면 최종적으로는 100이 됨.
				}
			System.out.println(i);
			sum=sum+i;
			//그래서 첫번째 for문에 해당하는 위 명령어는 원래라면 break의 영향을 받지 않는다.
			//이름이 지정되었기 때문에 두번째 for문에서 이름을 지정한 것으로 영향을 받는다.
			}
		
		if(sum<40){
			System.out.println("sum 출력 : " + sum);
		}
			
		
		//베스킨라빈스 게임 
		//나와 컴퓨터 둘이 번갈아가며 1부터 31까지 입력(31을 입력하는 쪽이 패배)
		//한번에 제시할 수 있는 숫자는 1~3개.
		
		
		int num=1;
		베스킨:
		for(;;){//= while(true)
			System.out.println("낼 숫자는 몇 개? : ");//이하 배열을 표현함
			int user = scan.nextInt();
			System.out.print("나 : ");

			for(int u=1; u<=user; u++) {
				System.out.print(num+" ");
				if(num==31) break 베스킨;
					//여기서 이름을 지정시켜 상위 for문에도 break가 되도록 영향
				num++;
			}
			System.out.println();
			
			int com = (int)(Math.random()*3)+1;
			System.out.print("	  com : ");
			
			for(int u=1; u<=com; u++) {
				System.out.print(num+" ");
				if(num==31) break 베스킨;
				num++;
			}
			System.out.println();
		}
	
	
	}
}

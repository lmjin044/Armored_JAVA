package java0719_Thread4;

public enum ThState {
	NEW, RUNNABLE, BLOKED, WAITING, TIMED_WATING,
	TERMINATED 
	
	
	
	
	
//	int num;
//	ThState(int num) {
//		this.num=num;
//	}
//	
//	int getNum() {
//		return this.num;
//	}
	
}
// 맨 처음이 0부터 시작함
// 얘네들은 이제 상수로 작용함.
// 			  ㄴ기존 final 선언을 앞에 붙이던 그거.


/*
 ENUM의 역할 = 상수들을 클래스 처럼 사용할 수 있도록 함 
 		   = 지금 여기서는 ThState 안에서 사용 가능함
 	예를 들어 Menu에 파일열기, 파일 저장, 다른 이름으로 저장, SET, EXIT라는
 	기능을 집어넣는다고 하면? 기존에는 숫자로 표시하고 별도로 이름 표시해야 했는데
 	Enum을 사용해서 아래와 같이 구현 가능하다.
 	
 	   int menu=scan.nextInt();
 	   switch(menu){
 	   	case Menu.파일열기:
 	   	case Menu.파일저장:
 	   	case Menu.다른이름으로저장:
 	   	case Menu.SET:
 	   	case Menu.EXIT:
 		
 */



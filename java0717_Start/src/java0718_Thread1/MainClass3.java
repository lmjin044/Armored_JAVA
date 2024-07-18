package java0718_Thread1;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeThread th1 = new MeThread(2000, "2초");
		MeThread th2 = new MeThread(3000, "3초");
		
		//순차적으로 쓰레드를 실행하는 방법 : 1번 쓰레드 종료를 인식 시킨 후 2번 쓰레드를 시작시키기
		
		th1.start();
		try {
			th1.join();
			//이걸 사용하면 그 이후에 시행 될 쓰레드를 대기상태로 만든다.
			//단 이게 정상 작동 될 것인지 버그 터질지 몰라서 try-catch구문으로 묶어놔야함.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();

		
		
		
		
		
		
		
		
//		while(true) {	
//			System.out.print("");
//			int num=MeThread.num;
//			if(num ==15 ) {
//				th1.stop();
//				th2.stop();
//			break;
//			}
//		}
		//MeThread에 있는 num의 값이 15가 되면 정지하도록 명령하는 while문이다.
		//
		
		
		
		
	}

}

/*
 sleep(초) = 지정시간만큼 대기, 이때 초는 밀리세컨드 단위
 start() = 쓰레드 시작 및 run 메서드를 호출함
 join() = 해당 쓰레드가 끝날 때까지 다음 메서드를 대기
 run() = 쓰레드가 실행하는 메서드
 stop() = 쓰레드 중단(권장 X)
  ㄴ interrupt() = 쓰레드 중단22
 setPriority(정수값) = 정수값에 맞는 우선 순위 지정
 getPriority() = setPriority에 지정된 쓰레드를 우선 실행
 isAlive() = 현재 쓰레드가 살아있는지(=종료여부)를 물음.
 
 suspend() = 쓰레드를 일시 정지시킴
  ㄴ yield() = 다른 쓰레드에게 실행 상태를 양보 후 대기
 resume() = 일시정지 한 쓰레드를 다시 실행
  ㄴ notify() = 대기 상태에 있는 쓰레드를 실행대기로 변환
  			 = 만약 실행대기 상태인 경우에는 실행 상태로 변환
 */

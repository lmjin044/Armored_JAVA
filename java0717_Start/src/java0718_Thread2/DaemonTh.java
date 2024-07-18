package java0718_Thread2;

public class DaemonTh extends Thread{

	@Override
	public void run() {
		System.out.println("데몬 쓰레드 실행");
		while(true) {
			System.out.println("자동저장");
			//무한루프로 자동반복이 지속
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*
 데몬쓰레드 : 
  - 주 쓰레드를 보조하는 역할 = 주 쓰레드 종료 시 같이 종료
  - 직접 제어를 해야 하는 주 쓰레드에 영향 받아서 별도 제어가 불필요.
 
 */



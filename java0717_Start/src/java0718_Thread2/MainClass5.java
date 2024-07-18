package java0718_Thread2;

public class MainClass5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//			//메인 쓰레드의 영향으로 한번 실행 후 종료 처리가 됨.
//		
//		dm.start();
		
		
		NormalTh th = new NormalTh("일반");
		th.start();
		
		Thread.sleep(6000);
			//이러면 6초 동안의 기간을 가지고 데몬 쓰레드가 자동 반복을 함
		System.out.println("main 종료");
			//그리고 6초 뒤에 종료.
		
		
	}

}

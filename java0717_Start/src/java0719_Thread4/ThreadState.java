package java0719_Thread4;

import java.lang.Thread.State;

public class ThreadState {

	private static Thread thread;
	private static Thread stateThread;
	 
	public static void main(String[] args) {		
		stateThread = new Thread( () -> 
			while(true) {
				State state = thread.getState();
                System.out.println(thread.getName() + " - 쓰레드 상태: " + state);
				
				if(state == State.NEW) {
					System.out.println("쓰레드 실행준비");
					thread.start();
				}
			
			if(state == State.WAITING) {
				System.out.println("쓰레드 대기 단계");
			}
			
			if(state == State.TERMINATED) {
				System.out.println(thread.getName() + 
						"- 쓰레드 상태 : "+ state);	
				break;
			}
			
//			try {
//				Thread.sleep(500);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}	
	}	
});
		thread = new My("쓰레드 1번 ", stateThread);
		stateThread.start();
	
}

}

package java0719_Thread4;

import java.lang.Thread.State;

public class ThreadState {

	private static Thread thread;
	private static Thread stateThread;
	 
	public static void main(String[] args) {		
		stateThread = new Thread( () -> 
			while(true) {
				State state = thread.getState();
                System.out.println(thread.getName() + " - ������ ����: " + state);
				
				if(state == State.NEW) {
					System.out.println("������ �����غ�");
					thread.start();
				}
			
			if(state == State.WAITING) {
				System.out.println("������ ��� �ܰ�");
			}
			
			if(state == State.TERMINATED) {
				System.out.println(thread.getName() + 
						"- ������ ���� : "+ state);	
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
		thread = new My("������ 1�� ", stateThread);
		stateThread.start();
	
}

}

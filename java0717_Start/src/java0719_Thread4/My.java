package java0719_Thread4;

public class My extends Thread{

	private Thread target;
	
	public My(String name, Thread target) {
		super(name);
		this.target=target;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=200000000; i++);
		for(int i=0; i<=200000000; i++);
			//2억번 2번 반복이라는 뜻임
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			//2억 반복하고 2초 동안 잠자는 소리
		}
		try {
			target.join();//target 쓰레드 종료까지 나머지 대기시키기
		}catch(InterruptedException e) {
			for(int i=0; i<=200000000; i++);
			for(int i=0; i<=200000000; i++);
		}
		
	}
	
	
	
	
}

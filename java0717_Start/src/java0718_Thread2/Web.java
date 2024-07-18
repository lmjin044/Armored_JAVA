package java0718_Thread2;

public class Web extends Thread {

	public Web(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 쓰레드 시작");
		long before = System.currentTimeMillis();
			//시작할 때의 시각을 측정
		
		for(int i=0; i<100000; i++) {
			for(int k=0; k<200000; k++) {
//				for(int j=0; j<100000; j++) {
//					
//				}
			}
		}
		long after = System.currentTimeMillis();//끝나는 시간 측정
		long diff = after-before;
			//끝나기까지 얼마나 걸렸는지 확인.
			
		
		System.out.println(name + " 쓰레드 종료("+ diff+ ")");
	}
	
}

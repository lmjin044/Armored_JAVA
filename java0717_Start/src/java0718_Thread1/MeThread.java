package java0718_Thread1;

public class MeThread extends Thread{
	public static int num=10;	//클래스 변수
	private int time;	//sleep에 적용할 시간
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		

		for(int i=1; i<=5; i++) {
			System.out.println("쓰레드 명 : " + name +" , 공유num : "+num);
			num++;
			if(num == 17) break;
		
//		while(true) {
//			System.out.println("쓰레드 명 : " + name +" , 공유num : "+num);
//			num++;
//			if(num==15) break;
				// ==15로 설정하면 break를 걸어도 무한 루프가 되어버림. 
				// ==15로 설정했을 때 break가 작동되도록 제어하는 것이 필요함(=옵저버)
			
		try {
			Thread.sleep(time);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
}


package java0718_Thread1;

public class MeThread extends Thread{
	public static int num=10;	//Ŭ���� ����
	private int time;	//sleep�� ������ �ð�
	public MeThread(int time, String name) {
		super(name);
		this.time=time;
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		

		for(int i=1; i<=5; i++) {
			System.out.println("������ �� : " + name +" , ����num : "+num);
			num++;
			if(num == 17) break;
		
//		while(true) {
//			System.out.println("������ �� : " + name +" , ����num : "+num);
//			num++;
//			if(num==15) break;
				// ==15�� �����ϸ� break�� �ɾ ���� ������ �Ǿ����. 
				// ==15�� �������� �� break�� �۵��ǵ��� �����ϴ� ���� �ʿ���(=������)
			
		try {
			Thread.sleep(time);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
}


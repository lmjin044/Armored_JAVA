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
			//2��� 2�� �ݺ��̶�� ����
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			//2�� �ݺ��ϰ� 2�� ���� ���ڴ� �Ҹ�
		}
		try {
			target.join();//target ������ ������� ������ ����Ű��
		}catch(InterruptedException e) {
			for(int i=0; i<=200000000; i++);
			for(int i=0; i<=200000000; i++);
		}
		
	}
	
	
	
	
}

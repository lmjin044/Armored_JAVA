package java0718_Thread2;

public class DaemonTh extends Thread{

	@Override
	public void run() {
		System.out.println("���� ������ ����");
		while(true) {
			System.out.println("�ڵ�����");
			//���ѷ����� �ڵ��ݺ��� ����
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
/*
 ���󾲷��� : 
  - �� �����带 �����ϴ� ���� = �� ������ ���� �� ���� ����
  - ���� ��� �ؾ� �ϴ� �� �����忡 ���� �޾Ƽ� ���� ��� ���ʿ�.
 
 */



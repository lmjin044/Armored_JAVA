package java0718_Thread2;

public class MainClass5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//			//���� �������� �������� �ѹ� ���� �� ���� ó���� ��.
//		
//		dm.start();
		
		
		NormalTh th = new NormalTh("�Ϲ�");
		th.start();
		
		Thread.sleep(6000);
			//�̷��� 6�� ������ �Ⱓ�� ������ ���� �����尡 �ڵ� �ݺ��� ��
		System.out.println("main ����");
			//�׸��� 6�� �ڿ� ����.
		
		
	}

}

package java0718_Thread1;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeThread th1 = new MeThread(2000, "2��");
		MeThread th2 = new MeThread(3000, "3��");
		
		//���������� �����带 �����ϴ� ��� : 1�� ������ ���Ḧ �ν� ��Ų �� 2�� �����带 ���۽�Ű��
		
		th1.start();
		try {
			th1.join();
			//�̰� ����ϸ� �� ���Ŀ� ���� �� �����带 �����·� �����.
			//�� �̰� ���� �۵� �� ������ ���� ������ ���� try-catch�������� ���������.
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		th2.start();

		
		
		
		
		
		
		
		
//		while(true) {	
//			System.out.print("");
//			int num=MeThread.num;
//			if(num ==15 ) {
//				th1.stop();
//				th2.stop();
//			break;
//			}
//		}
		//MeThread�� �ִ� num�� ���� 15�� �Ǹ� �����ϵ��� ����ϴ� while���̴�.
		//
		
		
		
		
	}

}

/*
 sleep(��) = �����ð���ŭ ���, �̶� �ʴ� �и������� ����
 start() = ������ ���� �� run �޼��带 ȣ����
 join() = �ش� �����尡 ���� ������ ���� �޼��带 ���
 run() = �����尡 �����ϴ� �޼���
 stop() = ������ �ߴ�(���� X)
  �� interrupt() = ������ �ߴ�22
 setPriority(������) = �������� �´� �켱 ���� ����
 getPriority() = setPriority�� ������ �����带 �켱 ����
 isAlive() = ���� �����尡 ����ִ���(=���Ῡ��)�� ����.
 
 suspend() = �����带 �Ͻ� ������Ŵ
  �� yield() = �ٸ� �����忡�� ���� ���¸� �纸 �� ���
 resume() = �Ͻ����� �� �����带 �ٽ� ����
  �� notify() = ��� ���¿� �ִ� �����带 ������� ��ȯ
  			 = ���� ������ ������ ��쿡�� ���� ���·� ��ȯ
 */

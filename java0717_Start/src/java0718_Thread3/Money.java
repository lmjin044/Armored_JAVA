package java0718_Thread3;

public class Money {
	private int myMoney = 10000;
	public int getMyMoney() {
		return myMoney;
	}
	//widhdraw �޼��尡 �� �����带 �����ϰ� �־ ���ÿ� ó���� ��
	//�Ӱ迵������ ������ ��.
	public synchronized boolean widhdraw(int money) {
		//10000���� ���ݾ�, 2���� �����带 �̿��� ���
		if(myMoney>=money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			//���
			
				myMoney -= money;	
				return true;
		}
		return false;
	}
}

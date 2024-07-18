package java0718_Thread3;

public class Money {
	private int myMoney = 10000;
	public int getMyMoney() {
		return myMoney;
	}
	//widhdraw 메서드가 두 쓰레드를 공유하고 있어서 동시에 처리가 됨
	//임계영역으로 설정할 것.
	public synchronized boolean widhdraw(int money) {
		//10000원을 조금씩, 2개의 쓰레드를 이용한 출금
		if(myMoney>=money) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
			//출금
			
				myMoney -= money;	
				return true;
		}
		return false;
	}
}

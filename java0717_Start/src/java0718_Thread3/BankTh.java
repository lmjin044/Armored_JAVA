package java0718_Thread3;

public class BankTh extends Thread{
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getMyMoney() > 0) {
			//잔액이 0보다 많으면 계속 반복해라.
			//출금금액은 랜덤으로 설정. 3천원 선에서.
			int money = (int)((Math.random()*3)+1)*1000;
			if(my.widhdraw(money)) {
				System.out.println(
						Thread.currentThread().getName() + 
						"▷ 출금 : " + money + ", 잔액 : "+
						 my.getMyMoney());
			}else {//잔액 부족으로 출금이 실패 될 경우
				System.out.println("출금이 거부되었습니다. 잔액부족!");
			}
		}
	}
}

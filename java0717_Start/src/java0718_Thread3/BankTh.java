package java0718_Thread3;

public class BankTh extends Thread{
	Money my = new Money();
	
	@Override
	public void run() {
		while(my.getMyMoney() > 0) {
			//�ܾ��� 0���� ������ ��� �ݺ��ض�.
			//��ݱݾ��� �������� ����. 3õ�� ������.
			int money = (int)((Math.random()*3)+1)*1000;
			if(my.widhdraw(money)) {
				System.out.println(
						Thread.currentThread().getName() + 
						"�� ��� : " + money + ", �ܾ� : "+
						 my.getMyMoney());
			}else {//�ܾ� �������� ����� ���� �� ���
				System.out.println("����� �źεǾ����ϴ�. �ܾ׺���!");
			}
		}
	}
}

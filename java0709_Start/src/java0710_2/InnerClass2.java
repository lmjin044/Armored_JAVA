package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{
	private int balance;	//�ܾ�
	private static String bankName = "�踲Bank";	//�����
	public BankAccount(int balance) {	//������ �޼���
		this.balance = balance;
	}
	public void showBalance() {	//�ܾ� Ȯ�� �޼���
		System.out.println("���� �ܾ� : "+balance);
	}
	
	class Transaction{	//�ŷ� : �Ա� �� ��� Ȯ�� Ŭ����
		void deposit(int amount) {	//�Ա�
			balance = balance+amount;
			System.out.println("�Ա� �ݾ� : "+amount);
		}
		
		void withdraw(int amount) {
			if(balance >= amount) {
				balance = balance-amount;
				System.out.println("��� �ݾ� : "+amount);
					//�̶� ��ݾ��� �����ϴٸ�?
			}else {	//��ݾ� ������ ��Ÿ�� �ý��� �޽���
				System.out.println("�ܾ��� ������ ����� �Ұ��� �մϴ�!");
			}
		}
	}
//���� ���� Ŭ����
	static class BankInfo{
		void showBankName() {
			System.out.println("���� �̸� : "+bankName);
		}
	}
	
//���� ���� Ŭ����
	public void applyLoan(int amount) {
		//���� ��û
		class Loan{
			void progress() {
				System.out.println("���� ��û �ݾ� : " +amount);
			}
		}
		Loan loan = new Loan();
		loan.progress();
		
	}	//���� ���� class���� �޼����� ���� ������ ����� �� �ִ�.
	
//�͸� ���� Ŭ����
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int) (balance*0.03);
				balance += interestMoney;
				System.out.println("���� ���� : "+interestMoney);				
			}
		};
		
		interest.run();
	}




}







public class InnerClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount account = new BankAccount(10000000);
		account.showBalance();
		
		BankAccount.Transaction tran = account.new Transaction();
		tran.deposit(50000);
		account.showBalance();
		tran.withdraw(400000);
		account.showBalance();
		
		//���� ���� Ŭ���� ��ü ����
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		//��������Ŭ���� ���
		account.applyLoan(200000);
		
		//�͸� ���� Ŭ���� ���
		account.interestCalc();
	}

}
/*
Ŭ���� : BankAccount;
	BankAccount ���� Ŭ������ - 
		�ν��Ͻ� ���� Ŭ���� - Transaction(�ŷ�)
		���� ���� Ŭ���� - BankInfo(��������)
		���� ���� Ŭ���� : Loan(����)
		�͸� ���� Ŭ���� : Runnable(�͸�Ŭ������ �������̽���)
			��Ư���� �뵵�� ���Ǵ� �������̽��� �ƴ϶�� �� �̸���~able�� �ٿ���.
*/
package java0710_2;

interface Runnable{
	public void run();
}

class BankAccount{
	private int balance;	//잔액
	private static String bankName = "계림Bank";	//은행명
	public BankAccount(int balance) {	//생성자 메서드
		this.balance = balance;
	}
	public void showBalance() {	//잔액 확인 메서드
		System.out.println("계좌 잔액 : "+balance);
	}
	
	class Transaction{	//거래 : 입금 및 출금 확인 클래스
		void deposit(int amount) {	//입금
			balance = balance+amount;
			System.out.println("입금 금액 : "+amount);
		}
		
		void withdraw(int amount) {
			if(balance >= amount) {
				balance = balance-amount;
				System.out.println("출금 금액 : "+amount);
					//이때 출금액이 부족하다면?
			}else {	//출금액 부족시 나타날 시스템 메시지
				System.out.println("잔액이 부족해 출금이 불가능 합니다!");
			}
		}
	}
//정적 내부 클래스
	static class BankInfo{
		void showBankName() {
			System.out.println("은행 이름 : "+bankName);
		}
	}
	
//지역 내부 클래스
	public void applyLoan(int amount) {
		//대출 신청
		class Loan{
			void progress() {
				System.out.println("대출 신청 금액 : " +amount);
			}
		}
		Loan loan = new Loan();
		loan.progress();
		
	}	//지역 내부 class에서 메서드의 지역 변수를 사용할 수 있다.
	
//익명 내부 클래스
	public void interestCalc() {
		Runnable interest = new Runnable() {
			@Override
			public void run() {
				int interestMoney = (int) (balance*0.03);
				balance += interestMoney;
				System.out.println("이자 지급 : "+interestMoney);				
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
		
		//정적 내부 클래스 객체 생성
		BankAccount.BankInfo info = new BankAccount.BankInfo();
		info.showBankName();
		
		//지역내부클래스 사용
		account.applyLoan(200000);
		
		//익명 내부 클래스 사용
		account.interestCalc();
	}

}
/*
클래스 : BankAccount;
	BankAccount 내부 클래스들 - 
		인스턴스 내부 클래스 - Transaction(거래)
		정적 내부 클래스 - BankInfo(은행정보)
		지역 내부 클래스 : Loan(대출)
		익명 내부 클래스 : Runnable(익명클래스용 인터페이스명)
			※특별한 용도로 사용되는 인터페이스가 아니라면 그 이름에~able을 붙여라.
*/
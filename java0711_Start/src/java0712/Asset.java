package java0712;

public class Asset {
	private String bank;
	private int balance;
	private String accountNum;
	private String holder;
	
	public Asset(String bank, int balance, String accountNum, String holder){
		this.bank = bank;
		this.balance = balance;
		this.accountNum = accountNum;
		this.holder = holder;
		}
	
	@Override
	public String toString() {
		return bank +"("+accountNum+")"+balance+", "+holder;
	}

	@Override
	public boolean equals(Object o) {
		Asset temp = (Asset)o;
		boolean isBank = this.bank.equals(temp.bank);
		if(isBank)
			isBank = this.holder.equals(temp.holder);
			//둘다 은행과 은행명이 목록에 있는 것과 동일한지를 묻는거.
	
	return isBank;
	
	}
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		bank = bank;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

}






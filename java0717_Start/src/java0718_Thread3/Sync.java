package java0718_Thread3;

public class Sync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankTh thread = new BankTh();
		
		Thread th1 = new Thread(thread);
		Thread th2 = new Thread(thread);
		
		th1.setName("박문수    ");
		th2.setName("    이순신");
		
		th1.start();
		th2.start();
	}

}

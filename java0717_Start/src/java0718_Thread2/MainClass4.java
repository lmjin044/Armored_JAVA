package java0718_Thread2;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Web th1 = new Web("ù° ");
		Web th2 = new Web("	 ��° ");
		Web th3 = new Web("     ��° ");
		Web th4 = new Web("        ��° ");
		
		th1.setPriority(Thread.MAX_PRIORITY);
//		th2.setPriority(Thread.NORM_PRIORITY);
//		th3.setPriority(Thread.MIN_PRIORITY);
//		th4.setPriority(Thread.MAX_PRIORITY);
			//���� ���� = MAX > NORM > MIN
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
		
	}

}

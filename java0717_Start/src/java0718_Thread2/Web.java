package java0718_Thread2;

public class Web extends Thread {

	public Web(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ������ ����");
		long before = System.currentTimeMillis();
			//������ ���� �ð��� ����
		
		for(int i=0; i<100000; i++) {
			for(int k=0; k<200000; k++) {
//				for(int j=0; j<100000; j++) {
//					
//				}
			}
		}
		long after = System.currentTimeMillis();//������ �ð� ����
		long diff = after-before;
			//��������� �󸶳� �ɷȴ��� Ȯ��.
			
		
		System.out.println(name + " ������ ����("+ diff+ ")");
	}
	
}

package java0711_1;

import java.util.InputMismatchException;
import java.util.Scanner;

class NameValueException extends Exception{
	public NameValueException(String msg) {
		super(msg);
	}
}

public class ExceptionQuestion {
	
	static Scanner scan = new Scanner(System. in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = null;
		int age = 0;
		String userInfo = null;

		try {
			System.out.print("�̸� : ");
			name = scan.nextLine();
			if(name.isBlank())
				//.isBlank = ���ڿ��� ����ְų� ������ ��� true;
				//.isEmpty = ���ڿ� ���� ���� 0�� �Ǿ�� true;
				throw new NameValueException("�̸��� �Է��ϼ���");
		}catch(NameValueException n) {
			System.out.println(n.getMessage());
		}
		try {
			System.out.print("���� : ");
			age = scan.nextInt();
		}catch(InputMismatchException i) {
			System.out.println("10���� ������ ���̸� �Է��ϼ���.");
		}finally {
			scan.nextLine();
		}
		
		if(age>=20) {
			System.out.println("�ڱ�Ұ� : ");
			userInfo = scan.nextLine();
			
		}
	
		System.out.println(age + "��" + name+" ���� ");
	
		try {
			System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("�ڱ� �Ұ��� 10�� �̻� �ۼ����ּ���");
		}catch(NullPointerException e2){	//���̰� ��� �ڱ�Ұ��� ������ �� ���� ���.
			System.out.println("20�� �̻� �ٽ� ���ּ���.");
		}
		
		
		
		
		
	}

}

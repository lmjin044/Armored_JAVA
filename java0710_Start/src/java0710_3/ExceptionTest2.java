package java0710_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num =0;
		boolean is = true;
		do {
			try {
				System.out.println("���� �Է� : ");
				num = scan.nextInt();
				is = false;
//				if(is) break;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���");
				scan.nextLine();
			}finally {
				scan.nextLine();
			}
			
		}while(is);
		
		System.out.println(num+100);
		System.out.println("�̸� : ");
		String name = scan.nextLine();
		System.out.println(name);
			
	}

}
//���� ������ �Է��ؾ� �ϴµ� �߸� �Է����� ���.
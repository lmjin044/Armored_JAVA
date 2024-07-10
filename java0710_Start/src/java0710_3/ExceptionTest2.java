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
				System.out.println("정수 입력 : ");
				num = scan.nextInt();
				is = false;
//				if(is) break;
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요");
				scan.nextLine();
			}finally {
				scan.nextLine();
			}
			
		}while(is);
		
		System.out.println(num+100);
		System.out.println("이름 : ");
		String name = scan.nextLine();
		System.out.println(name);
			
	}

}
//만약 정수만 입력해야 하는데 잘못 입력했을 경우.
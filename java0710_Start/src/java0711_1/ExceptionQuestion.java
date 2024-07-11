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
			System.out.print("이름 : ");
			name = scan.nextLine();
			if(name.isBlank())
				//.isBlank = 문자열이 비어있거나 공백일 경우 true;
				//.isEmpty = 문자열 길이 값이 0이 되어야 true;
				throw new NameValueException("이름을 입력하세요");
		}catch(NameValueException n) {
			System.out.println(n.getMessage());
		}
		try {
			System.out.print("나이 : ");
			age = scan.nextInt();
		}catch(InputMismatchException i) {
			System.out.println("10진수 정수로 나이를 입력하세요.");
		}finally {
			scan.nextLine();
		}
		
		if(age>=20) {
			System.out.println("자기소개 : ");
			userInfo = scan.nextLine();
			
		}
	
		System.out.println(age + "살" + name+" 님은 ");
	
		try {
			System.out.println(userInfo.substring(0,10));
		}catch(StringIndexOutOfBoundsException e1) {
			System.out.println("자기 소개는 10자 이상 작성해주세요");
		}catch(NullPointerException e2){	//나이가 적어서 자기소개로 이행할 수 없는 경우.
			System.out.println("20세 이상만 다시 와주세요.");
		}
		
		
		
		
		
	}

}

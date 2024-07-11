package java0711_1;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}
public class ExceptionTest5 {
	static void setPassword(String password) throws PasswordException{
		if(password==null)
			throw new PasswordException("비밀번호를 입력하세요");
		if(password.length()<8)
			throw new PasswordException("8자 이상 입력하세요");
		if(password.matches("[a-zA-Z] + "))
			throw new PasswordException("비밀번호는 숫자나 특수문자 포함");
	}//위 if 문 중 하나라도 오류가 발생하지 않을때 비밀번호를 저장한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			setPassword("12345");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}

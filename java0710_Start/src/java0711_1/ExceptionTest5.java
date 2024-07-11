package java0711_1;

class PasswordException extends Exception{
	public PasswordException(String msg) {
		super(msg);
	}
}
public class ExceptionTest5 {
	static void setPassword(String password) throws PasswordException{
		if(password==null)
			throw new PasswordException("��й�ȣ�� �Է��ϼ���");
		if(password.length()<8)
			throw new PasswordException("8�� �̻� �Է��ϼ���");
		if(password.matches("[a-zA-Z] + "))
			throw new PasswordException("��й�ȣ�� ���ڳ� Ư������ ����");
	}//�� if �� �� �ϳ��� ������ �߻����� ������ ��й�ȣ�� �����Ѵ�.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			setPassword("12345");
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}

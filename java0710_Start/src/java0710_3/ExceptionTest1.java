package java0710_3;

public class ExceptionTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {	//������ �߻��� ���ɼ��� �ִ� �ڵ带 ���⿡ �о�ִ´�.
			System.out.println(10/0);//�� ������ ������ �߻��ؼ� �̹� ���ᰡ ��.
		}catch(ArithmeticException e) {	
			System.out.println("0���� �� �����ʴϱ�ƾƾƾ�");
		}
		System.out.println("���Ⱑ ���α׷��� ���Դϴ�.");
	}

}

/*
����ó�� :�� �ϸ� ����ڰ� ������ ��
 - ���α׷� ���� �� ������ �߻� �� �� ��� ���α׷��� �����.
 - ���� ó���� �ϸ� ���� �߻� �Ŀ��� ���α׷��� ������� ����.
 -����ڰ� �߸� �� ���� �Է��ϴ� ��쿡 �˷��ִ� ����
 �� ������ ������ �ذ� : ȸ�� �����.
*/
package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		move d = new dog();
		move c = new cat();
		d.moving();
		c.moving();

	}

}
class dog implements move{
	public void moving() {
		System.out.println("��ŭ ��ŭ �̵��Ѵ�.");
	}
}

class cat implements move{
	//cat�̶� �̸� ���� Ŭ������ move�� implements��� ������ �ٿ���!
	public void moving() {
		System.out.println("��� ��� �̵��Ѵ�.");
	}
}
	//cat�� dog�� moving�̶�� �߻�޼��尡 ������ ������ �߻����� ����



interface move{	//interface�� move��� Ŭ������ �������.
	static int a =10;	
		//���� int a =10;��� �ϸ� �ȵ����� static�� ���̴� ��쿣 ����.
	public void moving();	//moving�̶�� �޼��嵵 �������!
	
}

/*
�������̽� : �߻�Ŭ������ �� ���� >>public interface��� �ؾ� ��
			= ������ ���� �޼���(�߻�޼���)�� ���� �� ����
			= �ν��Ͻ����� �Ұ�
			= (8���� ����)static ����~�޼���� ���� ����
			= ��ü ���� �Ұ�
		 	= �ٸ� Ŭ������� ����Ǿ� ����.(�ܵ����� ������ �ִ� ���� �����ϱ�!)
		 ������ ������ ���� 

*/

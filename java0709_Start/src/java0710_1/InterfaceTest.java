package java0710_1;

abstract class animal{	//�θ�Ŭ����
	
	public abstract void sound();	
		//�߻�޼��尡 �Ƿ��� abstract ���!
		
}

class dog extends animal{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class cat extends animal{
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal d= new dog();
		animal c= new cat();
		
		d.sound();	
		c.sound();
		//�޼���� �θ�Ŭ������ ���� ���������� ����� �ڽ�Ŭ������ ������ ������ ��µ�
		//�׷��� ���� �θ�Ŭ������ "�����Ҹ�" ����� ����� ������ ���ݾ�. >> �߻�޼��� �ΰ���
	}

}

/*
�������� �Ҹ��� ����غ���!
�� �������� ���� �ٸ� ��ü = 
*/
package java0710_1;


interface Animal1{
	//interface �ȿ��� static ������ ���� �� �ִ�.
	static int a=10;
	final int b=10;
		//final�� ��� ����.
	static void mee() {
	}
	public void sound();	//= �߻�޼���
}

interface bird{
	public void fly();
}


class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}

class Pigeon implements Animal1, bird{
	@Override
	public void sound() {
		System.out.println("����");
	}
	
	@Override
	public void fly() {
		System.out.println("Ǫ��� Ǫ����� ���� �� ������");
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon p = new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();
		
		p.fly();
		
	}

}
/*
Ŭ������ ��� Ư¡
1. ���ϻ�� : �ϳ��� Ŭ������ ����� ����
		   �ڽ�Ŭ������ �θ�Ŭ���� �� �ϳ��� ��� ����.
		   �ٸ� Ŭ������ ����� ����Ϸ��� ���� ����� �����ؾ� ��.
	ex) class A{}
		class B{
			A a = new a(); }
2. ������ �޼����� ��� :
	public, protected, default �������� ������ �޼��常 ��ӵȴ�.
	�̶� �ڽ� Ŭ������ �θ� Ŭ������ '��� ��'�� ��� �޴´�
		= ������ ���� ���� ��ӵȴ�.
		
3. ���� ���շ� :
	�θ� Ŭ������ ������ �Ǹ� �ڽ� Ŭ������ ������ �ش� �� ���� ����


�������̽��� Ư¡ 
1. ���� ���� : Ŭ������ ���� ���� �������̽��� �����Ͽ� ���� ����.
2. ������ : Ŭ������ �ʿ��� �������̽��� ������ ���� ����.
3. ���� ���� : �ʿ��� �������̽��� �����ϸ� �Ǳ⿡ ��Ӻ��� ������ ����.
		
*/
package java0709_3;



interface RestCustomer{//�Ĵ翡 ã�ƿ��� �մ�
	public void setCustomer(String customer);
	public String food();
}

class ReservCustomerA implements RestCustomer{	//����մ�A
	String customer;
	
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
	@Override
	public String food() {
		return customer+"û���� �ش�";
	}
}

class ReservCustomerB implements RestCustomer{
	String customer;
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
	@Override
	public String food() {
		return customer+"������ �ش�";
	}
	
}

class Owner{
	void food(RestCustomer cus) {
		System.out.println(cus.food());
	}
}

public class Interface_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Owner ow = new Owner();
		ReservCustomerA a = new ReservCustomerA();
		ReservCustomerB b = new ReservCustomerB();
		a.setCustomer("A=�̼���");
		b.setCustomer("B=�庸��");
		
		ow.food(a);
		ow.food(b);
		
	}

}

/*
���� �մ��� 1�� �� �þ��?
ReservCustomerC�� �߰��ϰ�, �׿� ���� �޴��� �߰��ϰ�...
�������̽��� �ᱹ ���� ���� ���������� ����Ҽ� �ֵ��� �ϴ°Ŵ�.

����� ��û ó�� Ŭ���� = ��Ʈ�� Ŭ����
����� ��û�� '�ʿ��� ������ ���� �� ����' ���� Ŭ���� = ���� Ŭ����

�����͸� �����ϴ� Ŭ���� = ����ڿ��� ������ ������ Ŭ���� >> VO, DTO
				  = �����ͺ��̽��� �����ϴ� ������ Ŭ���� >>Entity

������ ó�� �������̽� = repository

*/
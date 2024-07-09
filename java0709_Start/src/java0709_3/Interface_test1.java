package java0709_3;



interface RestCustomer{//식당에 찾아오는 손님
	public void setCustomer(String customer);
	public String food();
}

class ReservCustomerA implements RestCustomer{	//예약손님A
	String customer;
	
	@Override
	public void setCustomer(String customer) {
		this.customer=customer;
	}
	
	@Override
	public String food() {
		return customer+"청국장 준다";
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
		return customer+"돈가스 준다";
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
		a.setCustomer("A=이순신");
		b.setCustomer("B=장보고");
		
		ow.food(a);
		ow.food(b);
		
	}

}

/*
만약 손님이 1명 더 늘어나면?
ReservCustomerC도 추가하고, 그에 따른 메뉴도 추가하고...
인터페이스는 결국 누가 들어가든 범용적으로 사용할수 있도록 하는거다.

사용자 요청 처리 클래스 = 컨트롤 클래스
사용자 요청에 '필요한 데이터 가공 및 수집' 실행 클래스 = 서비스 클래스

데이터만 저장하는 클래스 = 사용자에게 제공할 데이터 클래스 >> VO, DTO
				  = 데이터베이스에 저장하는 데이터 클래스 >>Entity

데이터 처리 인터페이스 = repository

*/
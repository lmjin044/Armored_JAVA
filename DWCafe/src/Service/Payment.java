package Service;

import DTO.Coffee;
import DTO.Tea;

public class Payment implements Kiosk {
	
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Payment(Object drink) {
		if(drink instanceof Coffee) 
			//instanceof : 자식 객체의 클래스타입을 분별하는 메서드
			this.orderCoffee = (Coffee)drink;
		if(drink instanceof Tea)
			this.orderTea = (Tea)drink;
	
	}
	
	
	
	@Override
	public void action() {
		System.out.println("결제를 진행합니다.");
		int price = orderCoffee !=null ? orderCoffee.getPrice() : orderTea.getPrice();
		System.out.println("결제 금액 : "+price+"원");

		
		
	}
}

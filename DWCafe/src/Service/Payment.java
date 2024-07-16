package Service;

import DTO.Coffee;
import DTO.Tea;

public class Payment implements Kiosk {
	
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Payment(Object drink) {
		if(drink instanceof Coffee) 
			//instanceof : �ڽ� ��ü�� Ŭ����Ÿ���� �к��ϴ� �޼���
			this.orderCoffee = (Coffee)drink;
		if(drink instanceof Tea)
			this.orderTea = (Tea)drink;
	
	}
	
	
	
	@Override
	public void action() {
		System.out.println("������ �����մϴ�.");
		int price = orderCoffee !=null ? orderCoffee.getPrice() : orderTea.getPrice();
		System.out.println("���� �ݾ� : "+price+"��");

		
		
	}
}

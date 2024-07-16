package Service;

import java.util.Scanner;

import DTO.Coffee;
import DTO.Tea;

public class Order implements Kiosk {
	private Coffee orderCoffee;
	private Tea orderTea;
	
	public Order(Coffee orderCoffee) {
		this.orderCoffee = orderCoffee;
	}
	
	public Order(Tea orderTea) {
		this.orderTea = orderTea;
	}
	
	
	
	
	@Override
	public void action() {
		// TODO Auto-generated method stub
		
		//�ֹ� Ȯ�� �� ����
		System.out.println("�ֹ� �޴� Ȯ��");
		System.out.println(orderCoffee!=null ? orderCoffee : orderTea);
		System.out.println("===����===");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 1��, �ݱ�� 2���� �����ּ��� : ");
		if(sc.nextInt()==2) return;
		Kiosk payment = new Payment(orderCoffee!=null ? orderCoffee : orderTea);
	}
}

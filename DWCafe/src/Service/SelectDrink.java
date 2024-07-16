package Service;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import DAO.CoffeeDAO;
import DAO.TeaDAO;
import DTO.Coffee;
import DTO.Tea;

public class SelectDrink implements Kiosk {
	
	private HashMap<Integer, Coffee> coffee;
	private HashMap<Integer, Tea> tea;

	public SelectDrink() {
		getData();
	}
	
	private void getData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Ŀ�Ǹ� ���÷��� 1����, ���� ���÷��� 2���� �Է��� �ּ��� :");
			int category = scan.nextInt();
			
			switch(category) {
			case 0: System.out.println("������ �� ������"); return;
			case 1: selectCoffee(); break;
			case 2: selectTea(); break;
			default : 
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		
		}
	
	}
	private void selectCoffee() {
		CoffeeDAO dao = new CoffeeDAO();
		coffee = dao.findAll();
		
		Set<Integer> ids = coffee.keySet();
		for(Integer id : ids) {
			System.out.println(id +". "+coffee.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(coffee.get(menu));
		order.action();
	}
	
	private void selectTea() {
		TeaDAO dao = new TeaDAO();
		tea = dao.findAll();
		
		Set<Integer> ids = tea.keySet();
		for(Integer id : ids) {
			System.out.println(id+". "+tea.get(id));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("�޴��� �����ϼ��� : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(tea.get(menu));
		order.action();
	}
	
	
}


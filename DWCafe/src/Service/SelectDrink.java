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
			System.out.println("커피를 마시려면 1번을, 차를 마시려면 2번을 입력해 주세요 :");
			int category = scan.nextInt();
			
			switch(category) {
			case 0: System.out.println("다음에 또 만나요"); return;
			case 1: selectCoffee(); break;
			case 2: selectTea(); break;
			default : 
				System.out.println("다시 입력하세요.");
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
		System.out.println("메뉴를 선택하세요 : ");
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
		System.out.println("메뉴를 선택하세요 : ");
		int menu = sc.nextInt();
		
		Kiosk order = new Order(tea.get(menu));
		order.action();
	}
	
	
}


package Control;

import Service.Kiosk;
import Service.SelectDrink;

public class MainControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== DW ī�� �ֹ� Ű����ũ === \n");
		System.out.println("=== ȭ���� ��ġ���� ������ === \n");
		Kiosk kiosk = new SelectDrink();
		kiosk.action();

	}

}

package java0717_3;

public class Shopping_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electronics elec = new Electronics("e12001", "�����", 1702000, "�Ｚ");
		Clothing clt = new Clothing("c12032", "����", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec, 3);
		shop.addCart(clt, 2);
			//īƮ�� ��� ��ǰ ������ �� ������ �ǹ���.
		
		shop.showCart();
	}

}

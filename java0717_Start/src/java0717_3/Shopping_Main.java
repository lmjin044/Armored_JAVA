package java0717_3;

public class Shopping_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Electronics elec = new Electronics("e12001", "냉장고", 1702000, "삼성");
		Clothing clt = new Clothing("c12032", "바지", 30000, "L");
		
		ShoppingCart shop = new ShoppingCart();
		shop.addCart(elec, 3);
		shop.addCart(clt, 2);
			//카트에 담는 상품 종류와 그 수량을 의미함.
		
		shop.showCart();
	}

}

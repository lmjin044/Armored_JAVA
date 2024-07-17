package java0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Cartitem<? extends Product>>list = new ArrayList<>();
		//이 자체로 제네릭 클래스를 가져오는게 아니라 '타입'의 일종으로만 쓸거면?
		//와일드카드 쓰면 된다.
	public<T extends Product>void addCart(T item, int quan) {
		//정확하게 product 안에 있는 두 상품 군만 넣을 수 있도록.
		Cartitem<T> cart = new Cartitem<>(item, quan);
		list.add(cart);
	}

	public void showCart() {
		//위에서 작성한 카트 안에 아이템 담는 과정을 이제 보여주는 단계
		for(Cartitem<? extends Product> cart : list) {
			System.out.println(cart);
		}
	}
	
}


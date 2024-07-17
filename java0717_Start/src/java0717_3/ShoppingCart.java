package java0717_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Cartitem<? extends Product>>list = new ArrayList<>();
		//�� ��ü�� ���׸� Ŭ������ �������°� �ƴ϶� 'Ÿ��'�� �������θ� ���Ÿ�?
		//���ϵ�ī�� ���� �ȴ�.
	public<T extends Product>void addCart(T item, int quan) {
		//��Ȯ�ϰ� product �ȿ� �ִ� �� ��ǰ ���� ���� �� �ֵ���.
		Cartitem<T> cart = new Cartitem<>(item, quan);
		list.add(cart);
	}

	public void showCart() {
		//������ �ۼ��� īƮ �ȿ� ������ ��� ������ ���� �����ִ� �ܰ�
		for(Cartitem<? extends Product> cart : list) {
			System.out.println(cart);
		}
	}
	
}


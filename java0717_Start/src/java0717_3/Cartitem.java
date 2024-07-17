package java0717_3;

public class Cartitem <T extends Product> {
	//이게 제네릭 클래스임. 그리고 엉뚱한 클래스가 엉겨붙지 못하게 상속으로 제한 두기.
	private T item;	//카트 안에 담은 아이템을 표시
	private int quantity; //여기서 담은 아이템의 수량을 표시
	
	public Cartitem(T item, int quantity) {
		this.item=item;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return "주문 상품 ▷ "+ item.toString() + ", 수량 : "+quantity;
	}
	
	
	public T getItem() {
		return this.item;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	
	

	
}

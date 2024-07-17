package java0717_3;

public class Cartitem <T extends Product> {
	//�̰� ���׸� Ŭ������. �׸��� ������ Ŭ������ ���ܺ��� ���ϰ� ������� ���� �α�.
	private T item;	//īƮ �ȿ� ���� �������� ǥ��
	private int quantity; //���⼭ ���� �������� ������ ǥ��
	
	public Cartitem(T item, int quantity) {
		this.item=item;
		this.quantity=quantity;
	}
	
	@Override
	public String toString() {
		return "�ֹ� ��ǰ �� "+ item.toString() + ", ���� : "+quantity;
	}
	
	
	public T getItem() {
		return this.item;
	}

	public int getQuantity() {
		return this.quantity;
	}
	
	
	

	
}

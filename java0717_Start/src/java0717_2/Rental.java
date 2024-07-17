package java0717_2;

public class Rental<T extends Media> {
	//T��� ���׸� Ÿ���� �����ϰ� Media�� �Ӽ��� �޾ƿ��Բ� ó��.
	private T item;
	private String renter;// �뿩�ڸ� ��Ī��
	//������ media �Ʒ� �Ѵ� �ڽ� Ŭ������� ���� ������ �����ϴ°� ����
	//�ٵ� �̷� ��� �θ�Ŭ�������� �ڽ� Ŭ������ ������ �޼��带 ����ϱ� �����

	public Rental(T item, String renter){
		this.item = item;
		this.renter = renter;
	}
	
	
	public T getItem(){
		return this.item;
	}
	
	public String getRenter() {
		return this.renter;
	}
	@Override
	public String toString() {
		return "�뿩�� : " + renter+", "+ item.toString();
	}
	
}

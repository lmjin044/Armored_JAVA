package java0717_1;

public class FruitBox<T extends fruit> {
		//���⼭ ������ �ɾ���ٸ� Juice���� ������ �Ŵ°� ����
		//JuiceŬ������ ������ ���ϵ�ī��͵� ���Ƽ� toy�� �� ���� ��ĥ �� ����
	private T fruit;
		
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	//���׸� Ÿ������ �ƿ� Ŭ���� ���� ��������ν� �Ʒ� �������� ������ Ȯ ���� �� �ִ�.
	public T getFruit() {
		
		return this.fruit;
	}
	
	
//	private Apple fruit;
//	private Banana fruit2;
//	private Grape fruit3;
//	
//	public void setFruit(Apple fruit) {
//		this.fruit = fruit;
//	}
//	
//	public void setFruit(Banana fruit) {
//		this.fruit2 = fruit;
//	}
//	
//	public void setFruit(Grape fruit) {
//		this.fruit3 = fruit;
//	}
}

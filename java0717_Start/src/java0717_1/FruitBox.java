package java0717_1;

public class FruitBox<T extends fruit> {
		//여기서 제한을 걸어놨다면 Juice에도 제한을 거는게 좋음
		//Juice클래스는 일종의 와일드카드와도 같아서 toy에 또 영향 끼칠 수 있음
	private T fruit;
		
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
	//제네릭 타입으로 아예 클래스 명을 끌어옴으로써 아래 여러가지 변수를 확 줄일 수 있다.
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

package java0717_1;

public class Juice {

	public void makeJuice(FruitBox<? extends fruit> box) {
		//이러면 사과는 해결되는데 바나나는 안 됨.
		//똑같은거 만드르면 코드가 충돌되니까 해야 하는 방법은?
		//제너릭 타입이 들어갈 자리가 부모클래스로 지정되면 됨.
		//이때 와일드카드?로 제네릭 표현을 한 번 더 써야 함. 
		//그리고 와일드카드 특성상 불일치 문제가 발생할 수 있어서
		//fruit 클래스의 자식으로 지정해야 함.
		
	}
	
	
}

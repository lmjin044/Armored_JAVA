package java0717_1;

import java.util.ArrayList;

public class Generic_Study1 {

	public static void main(String[] args) {
		
	FruitBox<Apple> appleBox = new FruitBox<>();
	appleBox.setFruit(new Apple());
	
	FruitBox<Banana> bananaBox = new FruitBox<>();
	bananaBox.setFruit(new Banana());
		//기존 get-set 방식으로 하게 될 경우 : 
		//FruitBox의 매개변수는 apple로 타입이 지정되어있는데
		//apple 클래스 객체만 넣어서 banana는 타입 불일치로 넣지 못함.
		//그러므로 FruitBox 클래스에 banana 타입도 추가
	
	FruitBox<Grape> grapeBox = new FruitBox<>();
	grapeBox.setFruit(new Grape());
	
	Apple apple = appleBox.getFruit();
	
	
//FruitBox<Toy> toyBox = new FruitBox<>();
//toyBox.setFruit(new Toy());
		//하지만 이게 .... 맞냐...? 장난감 먹게?
		//제네릭 타입에 과일이 아닌 놈들은 꺼지라고 해줄 방지장치가 필요.	 = 상속
		
	FruitBox<fruit> fruitBox = new FruitBox<>();
	fruitBox.setFruit(new Apple());
		//부모-자식 관계라서 되는 거임 이거.
		
		
	Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
	fruit a = new Apple();
		  a = new Banana();
		  a = new Grape();
		//공통된 부모를 지니고 있기 때문에 다양한 클래스 명에 변수 지정이 가능함.
		
		
		
		
		
		// TODO Auto-generated method stub

//		A<String> a = new A<>();
//			//A클래스의 제네릭 타입명을 T로 지정하고 그 속성은 String으로 지정
//			//이러면 item이라는 변수는 String 속성을 지닌다.
//		A<Integer> b = new A<>();
//		b.item = 233;
//		
		
		
//class A<T>{
//	T item; 
//	T[] arr = new t[3];
//		//new 연산자 사용은 안 됨.
//	ArrayList<T> list = new ArrayList<>();
//		//하지만 배열로써 지정은 가능하니까 이 방법으로 우회 가능.
//	
//	 void setItem(T item) {
//		this.item = item;
//	//하지만 얘는 여러 개 생성할 거 없음
//	 
//	 }
//	
//}
//
//class B{
//	int item1;
//	String item2;
//	float item3;
//	char item4;
//	
////만약 제네릭을 사용하지 않으면 item 변수들은 다른 타입, 다른 이름으로 여러개 생성
////같은 이름의 메서드를 오버로딩을 해야 함.
//
//public int getItem1() {
//		return item1;
//	}
//	public void setItem1(int item1) {
//		this.item1 = item1;
//	}
//	public String getItem2() {
//		return item2;
//	}
//	public void setItem2(String item2) {
//		this.item2 = item2;
//	}
//	public float getItem3() {
//		return item3;
//	}
//	public void setItem3(float item3) {
//		this.item3 = item3;
//	}
//	public char getItem4() {
//		return item4;
//	}
//	public void setItem4(char item4) {
//		this.item4 = item4;
//	}

}

	}


/*
 Generic(제네릭) :
  = 클래스 '내부'의 타입을 지정하는 방법
  = 기존에도 변수에 타입을 지정하는 방법을 썼지만...
    >> 많은 공통된 데이터를 한 클래스에 지정할 땐 안 그래도 되게끔
    
   ※타입 표현 : 일단 내 맘대로 지정할 수 있음. 근데 업계 표준 약어 따르자.
   	T = type
   	E = element
   	K = key
   	V = value
   	N = number
 
  다시 요약 :
  1) 제네릭 타입은 클래스 타입만 지정이 가능함. 
  2) 클래스에 제네릭을 표현하는 방법과 같이 설명하면.
  	class A<Tea> << class 클래스명<제네릭약어>
  	A<Tea> a = new A<Tea>();
  3) 제네릭 타입으로 사용이 가능한 클래스 중 일부 제한을 걸고 싶을 때 = 상속
  	class A<Tea extends Parent>
  	 = Parent(부모) 클래스의 자식 클래스와 부모 클래스만 제네릭으로 타입 지정 가능
  	 = 다른 클래스는 불가.
  	 *다중 타입으로 제한 설정 가능(인터페이스만 다중타입 설정 가능 = 클래스는 안 돼)
  4)제네릭 와일드카드 = <?>
     - 제네릭 타입의 한계 보완용
     - 메서드의 매개변수 타입으로써 제네릭 타입으로 표현된 클래스를 사용할 경우
       클래스에 표현된 제네릭이 정작 제대로 표현되지 않는 문제가 발생할 때 사용함
     - '예외없이 허용한다'라는 의미를 가지고 있음.
     - 제한 사항 : 
     	※<? extends T> = T 클래스와 그 자식까지 전주 사용 가능
     	  <? super T> = T 클래스와 그 조상
  
  
 
   	
 */
 
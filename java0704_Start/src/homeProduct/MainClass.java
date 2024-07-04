package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainClass 용도 외에 다른 페이지는 이 옵션 쓰지 말자. 
	
		
		Tv tv= new Tv();
		tv.power();
		tv.power();
		tv.brand = "삼성";
			//1번 실행하면 true 다시 실행하면 false
		
		Aircon aircon = new Aircon();
		aircon.power();
		aircon.power();
		aircon.brand ="LG";
		System.out.println(aircon.brand);
		
		Computer computer = new Computer();
		computer.power();
		computer.power();
		
/*
만들긴 했는데 클래스 간에 공통점이 있다면 차라리 하나의 클래스로 만드는게 개이득
 = 상속 : 부모(house)가 가지고 있는 것을 자식(tv, com, air)에게 물려주는 것
		  하는 방법은 자식 클래스의 이름 뒤에 'extends 부모클래스명'을 붙인다.
 	      Tv extends House = tv 클래스의 내부를 house 클래스에서 상속 받음.
		  자식클래스 간에 있는 공통점이 부모 클래스에게도 있어야 상속 가능 
		  
  그래서 왜 함? : 다형성!
	          하나의 타입으로 여러가지의 타입을 제어 및 사용하는 것
  하는 방법 :
 	1)부모 클래스의 인스턴스변수(와 메서드), 클래스 변수(와 메서드)의 사용 가능
 	2)단 모든 것ㅇ르 불려받지는 못하니 주의
	 예시 : 제어자(변수, 메서드, 클래스를 제어할 목적)
	 
 생성자 메서드를 통한 인스턴스 변수 초기화는?: 
  	1) 자식클래스가 가지고 있는 변수 : 자식클래스 내 생성자 메서드에서
  	2) 부모클래스가 가지고 있는 변수 : 부모클래스 내 생성자 메서드에서
 
*/
		
 
		
		

	}

}

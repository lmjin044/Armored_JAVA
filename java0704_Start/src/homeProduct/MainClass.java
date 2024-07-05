package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainClass 용도 외에 다른 페이지는 이 옵션 쓰지 말자. 
	
		
		Tv tv= new Tv();
		tv.brand = "삼성";
		tv.power();
		tv.power(); //1번 실행하면 true 다시 실행하면 false
		tv.channelUp();
			
		Aircon aircon = new Aircon();
		aircon.brand ="LG";
		System.out.println(aircon.brand);
		aircon.power();
		aircon.power();
		aircon.windControl();
		
		Computer computer = new Computer();
		computer.power();
		computer.power();
		
		
	System.out.println("다형성");
	 House tv2 = new Tv("LG", 1500000);
	 tv2.power();
	 House item = new Tv("삼성", 1750000);
	 item.power();
	 item = new Aircon("휘센", 1030000);
	//item.windcontrol();
	//다형성 =이렇게 하면 House라는 타입으로 tv, 에어컨의 값을 저장할 수 있다.
	//House가 부모타입이라서
	 
	//item.windcontrol();이 안 되는 이유? : 참조변수가 부모의 것이면 자식것을 사용 못함
	//자식은 부모의 것을 사용 가능(extends)
	 
	 House[]arr= {new Tv(), new Aircon(), new Computer()};
	 	//이렇게 새로운 객체를 추가할 수 있다. = 오버라이딩
	 
	}

	//현재 : 파워를 동일하게 만들었지만 셋 동시에 안 키려면?
	//	    자식클래스에 power 메서드를 구현하면 됨 = 그럼 부모에 둘 의미는 없잖아.
	// 하지만 부모에도, 자식에도 power 메서드를 각각 만들어야 한다.
}
	
		
		
		
/*
※상속 : 만들긴 했는데 클래스 간에 공통점이 있다면 차라리 하나의 클래스로 만드는게 개이득
 = 부모(house)가 가지고 있는 것을 자식(tv, com, air)에게 물려주는 것
 
 
   상속방법 : 
   	1)자식클래스의 이름 뒤에 'extends 부모클래스명'을 붙인다.
   	2)자식클래스에스 부모를 호출할 때는 예약어 super(매개변수);를 사용한다.
   		   
 	  예시)Tv extends House = tv 클래스의 내부를 house 클래스에서 상속 받음.
	  주의)자식클래스 간에 있는 공통점이 부모 클래스에게도 있어야 상속 가능 
	  
			
		  
  그래서 왜 함? : 
  	1)다형성! 하나의 타입으로 여러가지의 타입을 제어 및 사용하는 것
  	2)재사용! 클래스 간의 중복코드를 하나로 통합시켜 사용함.
  		>> 만약 없으면 여기저기 다 들어가서 해당 변수 다 수정해야 할 거 아냐
	          
  뭘 상속 받는가? :
 	1)부모 클래스의 인스턴스변수(와 메서드), 클래스 변수(와 메서드)의 사용 가능
 	2)단 모든 것을 불려받지는 못하니 주의
	 예시 : 제어자(변수, 메서드, 클래스를 제어할 목적)나 패키지에 따라 제한적
	 
	 
  생성자 메서드를 통한 인스턴스 변수 초기화는?: 
  	1) 자식클래스가 가지고 있는 변수 : 자식클래스 내 생성자 메서드에서
  	2) 부모클래스가 가지고 있는 변수 : 부모클래스 내 생성자 메서드에서
  	

 
*/
		
 
		
		


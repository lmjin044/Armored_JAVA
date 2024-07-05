package homeProduct;
//tv와 에어컨에 만들었던 것을 아예 House로 빼버림.
//그럼 tv랑 에어컨과 컴퓨터도 상속을 받아서 여기서 만든 power 메서드를 사용 가능
public class House {
	protected boolean onOff;
	protected String brand;	//제품 브랜드명
	protected int price;		//제품 구매가격
	
	protected House(){
		this.onOff = false;
	}
	
	protected House(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	protected void power() {
		this.onOff=!this.onOff;
		System.out.println("전원 : " +this.onOff);
	}
	
}


/*
 자녀 제어자 :
 1. static : class의 정적 변수이자 정적 메서드
 			 class에서 공통으로 사용 가능.
 			 객체가 아닌 class에 속함
 	사용예)class이름.static변수명, class명.static method()
 
 2. abstract : 추상 변수(메서드) 뜻은 미완성 =  객체 생성 불가
 			   
 3. final : 변경되지 않음
 			변수 앞에 final을 붙여 변수값을 변경되지 않게 고정
 			메서드 앞에 final을 붙일 경우 해당 메서드는 오버라이딩 불가
 			class에 final을 붙일 경우 상속이 불가 = 부모class 사용 불가
 			 
 4. 접근 제어자 
 	1)public(중요) : 아무 접근도 제어하지 않음 = 어느 패키지에서든 사용 가능 선언
 			   	   변수, 메서드 앞에 원래 붙이는게 국룰임
 		※만약 안 붙이면? : 다른 패키지에서 해당 메서드를 인식할 수 없음.
 			   	 
 	※이거랑 별개로...		   	
 		같은 패키지 내에서는 import를 안 붙여도 됨
 		다른 패키지면 별도로 import를 붙여야 함
 		
 	2)default : 같은 패키지에서만 접근 가능 선언(앞에 안 붙여도 적용)
 	
 	3)protected : 같은 패키지에서만 접근 가능 선언
 				  단 상속 관계일 경우에는 다른 패키지여도 접근 가능
 				  부모 쪽에서 protected를 달았으면 자식 쪽에서도 붙여야 함
 				  따라서 자식 클래스 외에 사용하지 않게 만들려면 이거 달아 주는게 좋다.
 	
 	4)private(중요) : 어디서나 그 누구도 사용하지 못하게 함
 	 				예외적으로 클래스 내부에서만 사용 가능(나 혼자만 쓴다)
 			   		부모-자식관계 형성해도 이걸 걸면 사용 못하게 막힘
  
 */
 
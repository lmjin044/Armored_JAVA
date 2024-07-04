package homeProduct;

public class House {
	boolean onOff;
	String brand;	//제품 브랜드명
	int price;		//제품 구매가격
	
	House(){
		this.onOff = false;
	}
	void power() {
		this.onOff=!this.onOff;
		System.out.println("전원 : " +this.onOff);
	}
	//tv와 에어컨에 만들었던 것을 아예 House로 빼버림.
	//그럼 tv랑 에어컨과 컴퓨터도 상속을 받아서 여기서 만든 power 메서드를 사용 가능
}

package java0717_2;

public class Rental<T extends Media> {
	//T라는 제네릭 타입을 설정하고 Media의 속성만 받아오게끔 처리.
	private T item;
	private String renter;// 대여자를 지칭함
	//어차피 media 아래 둘다 자식 클래스라면 공통 변수로 통합하는게 나음
	//근데 이럴 경우 부모클래스에서 자식 클래스의 변수와 메서드를 사용하기 어려워

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
		return "대여자 : " + renter+", "+ item.toString();
	}
	
}

package homeProduct;

public class Tv extends House {
//tv뒤에 바로 1칸 띄고 쓰는거다
//extends House : House에 작성했던 코드를 여기로 끌고 오는거임.
	
	private int channel =10;
	private int vol =5;
	 //일일이 타이핑 하지 않고 하는 방법 : 
	 // 1)메서드 만들 곳 아래에 빈 공간 형성하고 우클릭
	 // 2)source > Generated Getters and Setters 선택.
	 // 3)메서드 만들 변수 선택 후 generated 클릭.
//그러면 아래의 내용이 도출된다.
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
//여기까지가 자동으로 형성해준 거
	
	Tv(){super();}
	Tv(String brand, int price){
		super(brand, price);
	}

	
	void channelUp() {
		this.channel++;
	}
	
	void channelDown() {
		this.channel--;
	}
	@Override
		//오버라이딩 @ : 컴퓨터에게 주는 주석, 기존 메서드의 재정의
		//부모클래스에 해당 메서드가 반드시 존재해야 함.
		//오버라이딩 메서드는 반드시 반환 타입, 메서드 이름, 매개변수 똑같이 작성
		//매서드 속 {} 내용은 달라도 상관 없음
	
		//↔ 오버로딩 : 새로운 메서드를 정의
	protected void power() {
		super.onOff = !super.onOff;
		System.out.println("TV 전원 : "+super.onOff);
		
		//tv클래스 객체로 power 실행하라고 하면 자식 클래스
	}
}
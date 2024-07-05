package homeProduct;

public class Aircon extends House{

	static final String[] windtext = {"미","약","강"};
		//클래스 변수+변경 안하겠다는 선언
		//만약 3단계가 아니라 더 늘어나더라도 이쪽만 양을 늘리면 배열의 수가 늘어남
		//=아래 if 구문은 별도 수정할 것이 없음.
	int wind =0;
	int temperature; 
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand, price);
	}
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature--;
	}
	
	void windControl() {
		wind++;	
			//"미", "약","강"을 각각 0, 1, 2로만 표현하도록만 해주면 됨
		if(wind == windtext.length) wind =0;
			//강에서 다시 미 순서로 돌아가야 하는 구문 추가.
			//배열의 크기(3)와 같아지면 돌아가라.
		System.out.println("현재 바람세기 : " +windtext[wind]);
		
	}
	
	
}

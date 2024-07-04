package homeProduct;

public class Tv extends House {
//tv뒤에 바로 1칸 띄고 쓰는거다
//extends House : House에 작성했던 코드를 여기로 끌고 오는거임.
	
	int channel =10;
	int vol =5;
	
	Tv(){		//생성자 메서드
		super();	
	}
	
	Tv(String brand, int price){//매개변수가 있는 생성자 메서드
			
	}
	
	void channelUp() {
		this.channel++;
	}
}
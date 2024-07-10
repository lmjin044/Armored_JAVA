package java0710_1;

abstract class animal{	//부모클래스
	
	public abstract void sound();	
		//추상메서드가 되려면 abstract 사용!
		
}

class dog extends animal{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class cat extends animal{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal d= new dog();
		animal c= new cat();
		
		d.sound();	
		c.sound();
		//메서드는 부모클래스의 것을 가져왔지만 출력은 자식클래스에 지정된 것으로 출력됨
		//그러면 굳이 부모클래스의 "동물소리" 출력을 사용할 이유가 없잖아. >> 추상메서드 두개재
	}

}

/*
동물들의 소리를 출력해보자!
각 동물들은 서로 다른 개체 = 
*/
package java0709_3;

public class Main_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		move d = new dog();
		move c = new cat();
		d.moving();
		c.moving();

	}

}
class dog implements move{
	public void moving() {
		System.out.println("성큼 성큼 이동한다.");
	}
}

class cat implements move{
	//cat이라 이름 붙인 클래스에 move를 implements라는 놈으로 붙였다!
	public void moving() {
		System.out.println("사뿐 사뿐 이동한다.");
	}
}
	//cat과 dog에 moving이라는 추상메서드가 붙으면 오류가 발생하지 않음



interface move{	//interface로 move라는 클래스를 만들었다.
	static int a =10;	
		//마냥 int a =10;라고 하면 안되지만 static을 붙이는 경우엔 가능.
	public void moving();	//moving이라는 메서드도 만들었다!
	
}

/*
인터페이스 : 추상클래스의 한 종류 >>public interface라고 해야 함
			= 내용이 없는 메서드(추상메서드)만 만들 수 있음
			= 인스턴스변수 불가
			= (8버전 이후)static 변수~메서드는 구현 가능
			= 객체 생성 불가
		 	= 다른 클래스들과 연결되어 사용됨.(단독으로 가지고 있는 것이 없으니까!)
		 목적은 다형성 구현 

*/

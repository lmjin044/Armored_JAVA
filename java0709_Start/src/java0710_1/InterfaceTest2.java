package java0710_1;


interface Animal1{
	//interface 안에는 static 변수를 만들 수 있다.
	static int a=10;
	final int b=10;
		//final은 상수 선언.
	static void mee() {
	}
	public void sound();	//= 추상메서드
}

interface bird{
	public void fly();
}


class Dog1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}

class Cat1 implements Animal1{
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Pigeon implements Animal1, bird{
	@Override
	public void sound() {
		System.out.println("구구");
	}
	
	@Override
	public void fly() {
		System.out.println("푸드덕 푸드덕덕 으악 똥 싸지마");
	}
}


public class InterfaceTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog1 d = new Dog1();
		Cat1 c = new Cat1();
		Pigeon p = new Pigeon();
		
		d.sound();
		c.sound();
		p.sound();
		
		p.fly();
		
	}

}
/*
클래스의 상속 특징
1. 단일상속 : 하나의 클래스만 상속이 가능
		   자식클래스는 부모클래스 단 하나만 상속 가능.
		   다른 클래스의 기능을 사용하려면 포함 관계로 구현해야 함.
	ex) class A{}
		class B{
			A a = new a(); }
2. 변수와 메서드의 상속 :
	public, protected, default 제어자의 변수와 메서드만 상속된다.
	이때 자식 클래스는 부모 클래스의 '모든 것'을 상속 받는다
		= 선택지 없이 강제 상속된다.
		
3. 강한 결합력 :
	부모 클래스가 변경이 되면 자식 클래스에 영향을 준다 ↔ 약한 결합


인터페이스의 특징 
1. 다중 구현 : 클래스에 여러 개의 인터페이스를 연결하여 구현 가능.
2. 유연성 : 클래스는 필요한 인터페이스를 조합해 구현 가능.
3. 약한 결합 : 필요한 인터페이스만 구현하면 되기에 상속보다 영향이 적다.
		
*/
package java0710_1;


abstract class Unit{
	int hp;
//	public abstract void repair();
}	//부모클래스이기 때문에 자식클래스는 예외없이 전부 상속 받음

interface Repairable{
	public void repair();
}

class Marine extends Unit{
	Marine(){super.hp=50;}
//	@Override
//	public void repair() {}
		//마린은 생체유닛이라 수리가 먹히지 않지만 부모 클래스에 의해 강제로 적용됨.
}

class Dropship extends Unit implements Repairable{
	Dropship(){super.hp=100;}
	@Override
	public void repair() {System.out.println("SCV가 수리함");}
	//위에서 생성한 인터페이스 Repairable을 붙여줌으로서 기계타입 유닛만 별도로 수리가 가능함. 
}

class tank extends Unit implements Repairable{
	tank(){super.hp=150;}
	@Override
	public void repair() {System.out.println("SCV가 수리함");}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marine m = new Marine();
		Dropship d = new Dropship();
		tank t = new tank();
		
		m.hp-=10;
		d.hp-=20;
		t.hp-=50;
			//각자 지정한 hp에서 10, 20, 50을 뺀 결과를 출력한다는 소리임.
		
		
		
	}

}

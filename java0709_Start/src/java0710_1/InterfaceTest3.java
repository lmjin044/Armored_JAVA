package java0710_1;


abstract class Unit{
	int hp;
//	public abstract void repair();
}	//�θ�Ŭ�����̱� ������ �ڽ�Ŭ������ ���ܾ��� ���� ��� ����

interface Repairable{
	public void repair();
}

class Marine extends Unit{
	Marine(){super.hp=50;}
//	@Override
//	public void repair() {}
		//������ ��ü�����̶� ������ ������ ������ �θ� Ŭ������ ���� ������ �����.
}

class Dropship extends Unit implements Repairable{
	Dropship(){super.hp=100;}
	@Override
	public void repair() {System.out.println("SCV�� ������");}
	//������ ������ �������̽� Repairable�� �ٿ������μ� ���Ÿ�� ���ָ� ������ ������ ������. 
}

class tank extends Unit implements Repairable{
	tank(){super.hp=150;}
	@Override
	public void repair() {System.out.println("SCV�� ������");}
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
			//���� ������ hp���� 10, 20, 50�� �� ����� ����Ѵٴ� �Ҹ���.
		
		
		
	}

}

package homeProduct;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mainClass �뵵 �ܿ� �ٸ� �������� �� �ɼ� ���� ����. 
	
		
		Tv tv= new Tv();
		tv.power();
		tv.power();
		tv.brand = "�Ｚ";
			//1�� �����ϸ� true �ٽ� �����ϸ� false
		
		Aircon aircon = new Aircon();
		aircon.power();
		aircon.power();
		aircon.brand ="LG";
		System.out.println(aircon.brand);
		
		Computer computer = new Computer();
		computer.power();
		computer.power();
		
/*
����� �ߴµ� Ŭ���� ���� �������� �ִٸ� ���� �ϳ��� Ŭ������ ����°� ���̵�
 = ��� : �θ�(house)�� ������ �ִ� ���� �ڽ�(tv, com, air)���� �����ִ� ��
		  �ϴ� ����� �ڽ� Ŭ������ �̸� �ڿ� 'extends �θ�Ŭ������'�� ���δ�.
 	      Tv extends House = tv Ŭ������ ���θ� house Ŭ�������� ��� ����.
		  �ڽ�Ŭ���� ���� �ִ� �������� �θ� Ŭ�������Ե� �־�� ��� ���� 
		  
  �׷��� �� ��? : ������!
	          �ϳ��� Ÿ������ ���������� Ÿ���� ���� �� ����ϴ� ��
  �ϴ� ��� :
 	1)�θ� Ŭ������ �ν��Ͻ�����(�� �޼���), Ŭ���� ����(�� �޼���)�� ��� ����
 	2)�� ��� �ͤ��� �ҷ������� ���ϴ� ����
	 ���� : ������(����, �޼���, Ŭ������ ������ ����)
	 
 ������ �޼��带 ���� �ν��Ͻ� ���� �ʱ�ȭ��?: 
  	1) �ڽ�Ŭ������ ������ �ִ� ���� : �ڽ�Ŭ���� �� ������ �޼��忡��
  	2) �θ�Ŭ������ ������ �ִ� ���� : �θ�Ŭ���� �� ������ �޼��忡��
 
*/
		
 
		
		

	}

}

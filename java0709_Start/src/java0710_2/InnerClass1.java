package java0710_2;

public class InnerClass1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Out out = new Out();
	out.num=100;
	out.obj.age=34;
	out.obj.setName("�̼���");
	
	Out.�ν��Ͻ�����Ŭ���� in = out.new �ν��Ͻ�����Ŭ����();
	in.age=20;
	in.setName("������");
	
	
	}
	
}	
//static ����-���� �� ������ �޼��� : �ν���Ʈ �޼��忡�� ��� ����
//�ν��Ͻ� ������ �޼��� : static �޼��忡�� ��� �Ұ�.
//*static�� ���α׷��� �������� �� �����ȴٴ� �ǹ�.
//�������� ���α׷� ���� �߿� ����

class Out{
	static int count;	//Ŭ���� ����
	int num;			//�ν��Ͻ� ����
	private String job; //�ν��Ͻ� ����
	�ν��Ͻ�����Ŭ���� obj = new �ν��Ͻ�����Ŭ����();
	
	interface Car{
		void make();
	}
	void makeCar() {
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("�͸� Ŭ����");
			}
		};
	}
	
	void buyComputer() {
		class ����Ŭ����{
			//�޼��� �ȿ� ��������� ���� Ŭ���� : �޼��� ����� �Բ� Ŭ������ �޸𸮿��� �����.
			//���� Ŭ���� ���� ������Ʈ�� �ش� ����Ŭ���� �ȿ����� ��밡��.
			//�� �޼��� ���ο����� ��� ������ Ŭ����
			static int weight;
			void del() {
				
			}
		����Ŭ���� ob = new ����Ŭ����();
		}	 
	}
	
	static void save() {
		
	}
	
	static class ����Ŭ����{//out Ŭ������ �ش���� ����
		int tall;
		static int birth;
		static void update() {
		}//
	}
	
	private class �ν��Ͻ�����Ŭ����{
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		
	static void crate() {
		count=10;
		//���� static�� ������ class Out Ŭ������ �ִ� count�� ��� �����̾���
	}
	}
		
}
	
	
	

/*
����Ŭ����
 ���� : Ŭ����{} ���ο����� ��� ������ Ŭ����.
	= �ٱ� �ʿ����� ��� �Ұ�.
 ���� : �ش� ������ Ư�� Ŭ������ ����ϴ� ���.
  	   ���� ���踦 �����ϱ� ���ٴ� ���� Ŭ������ �� Ŭ������ �̿��ϵ��� �ϴ°� ����� 
 	   
	
����Ŭ������ ����
1) �ν��Ͻ� ���� Ŭ���� : 
2) ���� ���� Ŭ����
3) ���� ���� Ŭ����
4) �͸� ���� Ŭ����

�ڹٿ����� �͸�Ŭ���� :
*/
package java0710_2;

public class InnerClass1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Out out = new Out();
	out.num=100;
	out.obj.age=34;
	out.obj.setName("이순신");
	
	Out.인스턴스내부클래스 in = out.new 인스턴스내부클래스();
	in.age=20;
	in.setName("김유신");
	
	
	}
	
}	
//static 선언-정의 된 변수와 메서드 : 인스턴트 메서드에서 사용 가능
//인스턴스 변수와 메서드 : static 메서드에서 사용 불가.
//*static은 프로그램을 시작했을 때 생성된다는 의미.
//나머지는 프로그램 실행 중에 생성

class Out{
	static int count;	//클래스 변수
	int num;			//인스턴스 변수
	private String job; //인스턴스 변수
	인스턴스내부클래스 obj = new 인스턴스내부클래스();
	
	interface Car{
		void make();
	}
	void makeCar() {
		Car c = new Car() {
			@Override
			public void make() {
				System.out.println("익명 클래스");
			}
		};
	}
	
	void buyComputer() {
		class 지역클래스{
			//메서드 안에 만들어지는 지역 클래스 : 메서드 종료와 함께 클래스가 메모리에서 사라짐.
			//지역 클래스 안의 오브젝트는 해당 지역클래스 안에서만 사용가능.
			//즉 메서드 내부에서만 사용 가능한 클래스
			static int weight;
			void del() {
				
			}
		지역클래스 ob = new 지역클래스();
		}	 
	}
	
	static void save() {
		
	}
	
	static class 정적클래스{//out 클래스에 해당되지 않음
		int tall;
		static int birth;
		static void update() {
		}//
	}
	
	private class 인스턴스내부클래스{
		public int age;
		private String name;
		void setName(String name) {
			this.name=name;
		}
		
	static void crate() {
		count=10;
		//만약 static이 없으면 class Out 클래스에 있던 count는 사용 가능이었다
	}
	}
		
}
	
	
	

/*
내부클래스
 정의 : 클래스{} 내부에서만 사용 가능한 클래스.
	= 바깥 쪽에서는 사용 불가.
 의의 : 해당 변수를 특정 클래스만 사용하는 경우.
  	   포함 관계를 유지하기 보다는 내부 클래스로 그 클래스만 이용하도록 하는게 깔끔쓰 
 	   
	
내부클래스의 종류
1) 인스턴스 내부 클래스 : 
2) 정적 내부 클래스
3) 지역 내부 클래스
4) 익명 내부 클래스

자바에서의 익명클래스 :
*/
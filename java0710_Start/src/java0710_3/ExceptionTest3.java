package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//코드1
			if()
				throw new NullPointerException("aa");
			//코드2
		}catch(Exception e) {
			System.out.println("강제 오류 발생");
		}
		
		//왜 강제 오류 발생 시킴?
		//
	}

}


class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	void setAge() {
		this.age = 2024-birth;
	}
}
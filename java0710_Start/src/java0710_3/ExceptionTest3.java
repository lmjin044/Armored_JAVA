package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member("이순신", 1999);
		System.out.println(member.name+", "+member.birth);
		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(member.age);
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
	
	//setAge 메서드 호출하여 age라는 이름의 변수값을 저장
	//age변수는 나이를 표현하기 위한 변수로, 0보다 작은 값이 저장되어서는 안 된다.
	//올해 태어난 연도를 구했을 때 그 결과값이 0보다 작은 값이 나오면 잘못 된 값이다.
	//birth변수의 값이 잘못되었기에 발생한 문제로 그 상위 코드에서 해결해야 한다.
	//그래서 여기서는 예외 처릴 발생시키고 넘겨주기를 한다.
	
	void setAge() throws {
		this.age=2023-birth;
		if(age<0)
			throw new RuntimeException("출생 연도가 잘못 되었다고");
	}
	
	//throw : 예외를 강제로 발생시키는 것.
	//throws : 예외처리를 다른 요소에 미루는 것.
	
//	void setAge() {
//		try {
//			this.age = 2024-birth;
//			if(age<0) {
//				throw new RuntimeException("출생 연도를 잘못 입력했습니다.");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
}
package java0702_2;

public class Study_0702_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 아래는 웹소설 작가들의 구독자 평점, 소설 뷰횟수에 따른 포인트다.
 해당 내용을 저장할 수 있는 클래스를 저으이하고 데이터 입력 후 출력하시오.
 (매개변수 있는 생성자 메서드는 2개 이상 구현 할 것)
 (이름, 포인트, 평점 순)
 김건우, 4580, 4.3
 김경제, 3485, 4.1
 박재범, 90930, 2.7
 서석완, 19200, 3.1
  
 */
	class Writter{
		String name;
		int point;
		float grade;
		
		
		Writter(String name, int point, float grade){
			this.name = name;
			this.point = point;
			this.grade = grade;
		
		}
		
	public String toString() {
		return name+"님, "+point+"점, "+grade;
	}
	//데이터명만 입력해도 전부 출력되도록 하고 싶다면 이렇게 할 것.
	//return 값을 전부 텍스트로 처리하는 구문.
		
		
	}
	
	Writter writter1 = new Writter("김건우", 4580, (float) 4.3f);
	Writter writter2 = new Writter("김경제", 3485, (float) 4.1f);
	Writter writter3 = new Writter("박재범", 90930, (float) 2.7f);
	Writter writter4 = new Writter("서석완", 19200, (float) 3.1f);

	System.out.println(writter1);
	System.out.println(writter2);
	System.out.println(writter3);
	System.out.println(writter4);
	
	/*	
	System.out.println(writter1.name+"님은 "+writter1.point+"포인트, 평점 "+writter1.grade+"입니다.");
	System.out.println(writter2.name+"님은 "+writter2.point+"포인트, 평점 "+writter2.grade+"입니다." );
	System.out.println(writter3.name+"님은 "+writter3.point+"포인트, 평점 "+writter3.grade+"입니다.");
	System.out.println(writter4.name+"님은 "+writter4.point+"포인트, 평점 "+writter4.grade+"입니다.");
		*/
	}
	


}

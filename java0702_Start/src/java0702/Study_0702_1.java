package java0702;

import java.util.Arrays;

public class Study_0702_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//정의 된 클래스 타입의 공간을 생성.
//생성된 공간에 데이터를 저장.
//클래스 타입으로 생성된 공간 = 인스턴스(or객체)

		Member member1 = new Member();	//클래스명 Member 인스턴스명 Member1
		Member member2 = new Member();	//생성자 메서드 new Member.
			//위 등식은 클래스를 지닌 인스턴스가 생성자 메서드를 호출한다는 방식.
		
		member1.name = "이순신";
		member1.age = 20;
			//.은 접근 연산자 : 하단에 작성한 name, age 변수들이 보인다.
		member2.name = "김유신";
		member2.age = 34;
		
		System.out.println(member1.name);
		System.out.println(member2.age);
		System.out.println();
//-------------------------------------------------------
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.title = "Java";
		book1.page = 495;
		
		book2.title = "메모리최적화기법";
		book2.page = 893;
		
		System.out.println(book1.page);
		System.out.println(book2.title);
		System.out.println();
//-------------------------------------------------------
//q. 스마트폰의 제품명, 운영체제, 메모리 크기에 관해 저장할 수 있는 
//	 클래스를 정의 및 인스턴스를 생성 및 출력하시오 (스마트폰은 3개로)
		
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		phone1.product = "갤럭시폴드5";
		phone1.os = "안드로이드";
		phone1.ram = "12GB";
		
		phone2.product = "iPhone15";
		phone2.os = "iOS 17.0";
		phone2.ram = "6GB";
			
		phone3.product = "ASUS ROG Ally";
		phone3.os = "Window 11 Home";
		phone3.ram = "16GB";
			
		System.out.println(phone1.product);
		System.out.println(phone2.os);
		System.out.println(phone3.ram);
		System.out.println();
//-------------------------------------------------------		
	}
}
	

		class Member{		//class= 사용자 정의 데이터 타입, Member라는 이름의 클래스 정의
			String name;	//이름
			int age;		//나이
		}
		
//-------------------------------------------------------
		class Book{	//1)
			String title;
			int page;
		}
//-------------------------------------------------------
		class Phone{
			String product;
			String os;
			String ram;
		}
		

/*오늘의 주제 : 클래스

변수 : 단일 데이터(타입)만 저장할 수 있다.
배열 : 다수의 데이터를 저장할 수 있으나, 동일한 타입이여야 한다.
	단점 - 데이터 추가가 단순하고 다수의 데이터를 처리하기에 시간이 걸림
구조체 : 서로 다른 데이터 타입을 한 공간에 한 이름으로 묶어서 표현 가능(C언어)
클래스 : 구조체에서 업그레이드된 버전
	  -시작은 대문자로 함 ex)Scanner, String, Arrays
	  -설계도, 붕어빵틀과 같은 역할을 함 >> 객체는 클래스를 통해 나온 제품, 붕어빵
	  
	 예시
	 
	  제어자 Class movie{ 
	 	변수 String 제목;
	 	변수 String 장르;
	 	변수 String 감독;
	 	변수 int[] 개봉일;
	 	변수 int 관객수;
	 	변수 long 총수익;
	 	
	 	}
	 	메서드1 : 전체 출력
	 	메서드2 : 순수익 출력
	 	메서드3 : ... 
*/

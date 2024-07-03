package java0703;

import java.time.LocalDate;


public class Study_0703_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1 = new Member("이순신", 31, "군인");
		Member member2 = new Member("문익점", 29, "섬유공장사장");
		Member member3 = new Member("장영실", 45, "기계공학자");
			
		//이때 각 멤버들의 태어난 연도 구하기
		member1.birth();
		member2.birth();
		member3.birth();
			//아래 만든 메서드를 통해서 별도의 매개변수라는 연결점 없이도 가능.
		
		
		DataIdentify dataIdentify = new DataIdentify();
			//먼저 클래스 이름을 정해놓을 것 : 여기서 연령대와 직업분류 메서드가 들어감
		
		//그러면 연령대는 여기서 어떻게 구할 것인가? : 연령대 구하기 메서드는 아래 참조.
		dataIdentify.ageGroup(member1.name,member1.age);
		dataIdentify.ageGroup(member2.name,member2.age);
		dataIdentify.ageGroup(member3.name,member3.age);
		
		//직업분류하기 : 국가 직무 분류에 따라서.
		//출력 목표 : '이순신 : 05.국방'			
		
		dataIdentify.jobGroup(member1.name, member1.job);
		dataIdentify.jobGroup(member2.name, member2.job);
		dataIdentify.jobGroup(member3.name, member3.job);


		
/*		
 	방법1 : Date 이용하기 (쓰면 import java.util.Date; 추가됨)
		Date today = new Date();
			//new Date 객체를 만들어주면 현재 연월일과 시각까지 알 수 있다.
			//이 객체에서 연도의 값만 빼오려면 getYear로 가능 >> int 값으로 추출
		System.out.println(today.getYear()+1900);
			//today.getYear로만 추출하면 124로 나옴: 기준이 1900년 00월 01일
			//따라서 1900년을 더한 상태여야 정상적으로 2024가 나옴
			//근데 왜 1900년임? 윤년을 포함해 가장 단순하게 계산이 가능함
		System.out.println(today.getMonth()+1);
			//같은 의미에서 기준을 0월로 시작하기 때문에 +1을 더해야 함
		
		 
	방법2 : Calendar 이용하기 (쓰면 import java.util.Calendar; 추가됨)
		Calendar cal = Calendar.getInstance();
			//캘린더는 추상적인 메서드라 직접 가져올 수 없음. 인스턴스를 강제로 가져오도록 돌려 표현
		int year = cal.get(Calendar.YEAR);
			//int 타입으로 리턴값이 돌아옴>>클래스 변수 사용
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
			//위에서 먼저 Calendar라는 클래스 변수를 만들었기 때문에 
			//이제 get을 통해 Year, Month 등을 가져올 수 있다.
			//단 달의 경우 기준을 0월로 잡아서 +1을 덧붙임.
	
	방법3 : LocalDate 이용하기 (쓰면 import java.time.LocalDate; 추가됨)
		LocalDate today = LocalDate.now();
			//LocalDate : 자바8에서 추가 된 것으로 앞으로는 이걸 많이 쓸거임
			//.now = 지금 프로그램을 실행하는 현지 시점을 가져옴
			//객체 today에 현재 연, 월, 일이 담김
			//연도 = today.getYear();   
			//월 = today.getMonthValue(); ※이 방법은 월에 +1 안 더해도 됨.
			//일 = today.getDayofMonth();
			//요일 = today.getDayofWeek(); or getValue(); ※1(월)~7(일) 
		int nowYear = today.getYear();
			
		int birthYear1 = nowYear -member1.age;
		System.out.printf("%s 태어난 연도 : %d년 \n", member1.name, birthYear1);
			//출력까지 했기 때문에 return값이 필요하지 않음
*/
			 
	}

}
class DataIdentify{
	//클래스에 변수와 메서드는 반드시 전부 같이 있을 필요는 없다. 
	//메서드 혹은 변수만 있어도 ok
	//그러나 클래스는 목적에 따라 만들어야 함 : 
	//사용자 요청을 컨트롤할 제어용, 실제 기능을 할 용도, 데이터 저장용 
		//업계용어 ver.= Controller, Service, DTO(혹은 VO)
	
	void ageGroup(String name, int age) {//=ageGroup에서 직접 출력하겠다 =return은 필요없다.
		//이름과 나이가 있는 외부 데이터에서 가져올 예정.
		String group = null;	//group이라는 이름으로 결과값을 가져오도록 한다.
			group = age/10+"0대";
		System.out.println(name+" : "+group);	//이 방식으로 표현하겠다는 의미임.
		
	}
	//국가 직무 분류 : 군인(05.국방), 공장사장(18.섬유의복), 기계공학자(15.기계)
	
	void jobGroup(String name, String job) {
		String ncs = null;
		switch(job) {	//=if문 : if(job.equals("군인"))
			case "군인" : ncs ="05.국방";
				break;
			case "섬유공장사장" : ncs = "18.섬유의복";
				break;
			case "기계공학자" : ncs = "15.기계";
				break;
			}
		
		System.out.println(name +" : "+job);

	}
	
}	
	



class Member{
	String name;	//이름
	int age;		//나이
	String job;		//직업
	//이하 기본 생성자 메서드
	Member(){}
	//이하 매개변수가 있는 생성자 메서드 
	Member(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	//태어난 연도를 출력하는 메서드 제작
	void birth() {
		//반환값이 필요 없기 때문에 void 사용
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		int birthYear1 = nowYear -this.age;
		System.out.printf("%s 태어난 연도 : %d년 \n", this.name, birthYear1);
			//member1은 이 메서드 안에서 만든 변수가 아님 : 
			//=메서드 바깥에서 가져와야 함
			//그러나 자신의 것을 자신이 가져오는 자가당착 >> this로 가져올 수 있음.
			//this = member1~3을 의미.
			
	}
}
/*
 오늘의 할일 : 메서드 2
 
 ※메서드와 함수, 왜 쓰는가?
 	☆반복문이 필요한 경우 : 배열(다량의 데이터 처리할 때), 계산(지속 증가, 감소식)
 	☆식의 시작이 너무 위로 올라가야 하고, 지나치게 반복적인 경우에 메서드, 함수를 사용
	☆즉 반복문마저도 너무 길어졌을 때!
	★장점 : 코드의 재사용, 유지보수, 가독성 측면 = 구조화 된 프로그래밍의 가능
		
  
 */
 
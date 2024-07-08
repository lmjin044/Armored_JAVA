package java0708;

import java.util.Scanner;

public class DBtest {

	static Scanner scan = new Scanner(System. in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dao dao = new Dao();	//Dao 객체가 있어야 DB와 자바 간의 연결통로가 마련된거임.
	Member[] list;//Member 클래스 타입의 배열 주소를 저장할 참조변수로 list를 생성함.
	
	
	
	
	System.out.print("1. 입력 2. 출력 : ");
	int menu = scan.nextInt();
		//1번을 누르면 입력, 2번을 누르면 출력을 아래 스위치 구문으로 실행시키기 위함.
	scan.nextLine();
		switch(menu) {
		case 1:
			System.out.println("학생 이름 : ");
			String name = scan.nextLine();
			System.out.println("국어 성적 : ");
			int kor = scan.nextInt() ;
			System.out.println("영어 성적 : ");
			int eng = scan.nextInt();
			System.out.println("수학 성적 : ");
			int mat = scan.nextInt();
			
			Member member = new Member(name, kor, eng, mat);
			total_avg(member);
				//현재 키보드로 입력받은 점수를 가지고 있는 저장장소는 member라서.
			System.out.println(member);
		//데이터 베이스에 저장		
			dao.insert(member);
			break;
		
		case 2:	//데이터 전부 출력의 경우
			list = dao.select();	
				//DB의 데이터를 Member 클래스 배열로 가져오기
				//member 클래스의 계열로 반환값이 있다. 
			for(Member data : list) {
				System.out.println(data);
			}
			break;
		}
		
		
	}
	
	static void total_avg(Member m){
		int total = m.getKor()+m.getEng()+m.getMat();
		m.setTotal(total);
			//변수에 값을 저장하기 위해서는 set~을 써야 한다.
		m.setStd_avg(total/3);
	}
	
}

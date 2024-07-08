package java0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dao {
	//Data Base object의 준말 : 
	//데이터베이스에 저장되어있는 것을 다른 클래스에 주거니받거니하는 목적

	private Connection conn;	
		//데이터베이스에 접속 정보객체를 저장할 변수
	private Statement st;
		//이쪽은 conn으로 저장한 데이터를 DB와 상호작용하기 위한 변수(보안이슈로 권장 X)
		//다이렉트로 직렬 전송
	private ResultSet rs;
		//얘는 DB내 조회 결과를 받기 위한 변수
	private PreparedStatement pt;
		//역할은 Statement와 동일. 보내는 방식이 다를 뿐이다.(이쪽을 쓰자)
		//여러가지로 나눠서 병렬 전송
	
	Dao(){
		DriverInit();
		Connect();
	}
	
	//MySQL과 JAVA 프로그램에 연결할 driver을 로드
	private void DriverInit() {
		//이하 class파일을 메모리에 로드시키는 방법
		try {
		 	//아래 파일이 만약 실행이 안 될 수 있으므로 try부터 전부 쓰자.
		Class.forName("com.mysql.cj.jdbc.Driver");
			//Reference Libraries에 있는 주소 그대로 쓴거임. 
			//Class 이름이 Class임;;
			//Class.forName을 입력해 연결구문을 완료함.
			//만약 붉은 줄이 뜬다면? 경로에 해당 파일이 존재하지 않아서.
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	
//MySQL 계정에 접속하기 위한 목적의 구문이다.
//서버용 계정이라 클라이언트에서는 접속 불가다.
	private void Connect() {
		String user = "burnout";
		String password = "1234";
		String url ="jdbc:mysql://localhost:3306/burnout";
		
		try {
			conn = DriverManager.getConnection(url,user,password);
		}catch(Exception e) {
			System.out.println("데이터베이스 접속 실패");
		}	
		//conn에 저장하고 내보낼 수 있게끔 하는 것.
	}
	
	//데이터 저장을 위한 단계
	public void insert(Member m) {
		String sql="insert into test_member(name, kor, eng, mat, total, std_avg) values(?,?,?,?,?,?)";
			//아래와 달리 values값을 ?로 처리해버림. 나중에 채울거긴 하지마는.
		try {
			pt = conn.prepareStatement(sql);
			pt.setString(1, m.getName());
			pt.setInt(2, m.getKor());
			pt.setInt(3, m.getEng());
			pt.setInt(4, m.getMat());
			pt.setInt(5, m.getTotal());
			pt.setInt(6, m.getStd_avg());
				//그 나중에가 요기. 
			pt.executeUpdate();
				//이걸 안 적어 넣으면 잘 입력했어도 데이터베이스에 전달되지 않음!
		}catch(Exception e) {
			System.out.println("데이터 저장 실패");
		}
		
	}
		//member class 객체에 member 참조변수로 저장했던 것을 주소만 넘기면 됨
		//그리고 그 주소를 Member m으로 지정했던거고.
		
		/*
		String sql = "insert into test_member(name,kor,eng,mat,total,std_avg)"
				    +" values('"+m.getName()+"',"+m.getKor()+","+m.getEng()+","
							   +m.getMat()+"," +m.getTotal()+","+m.getStd_avg()+")";
		//getName()의 경우에는 글씨이기 때문에 ''로 구분을 해줘야 함.
		//이렇게 만든걸 이제 자바에서 접속한 계정의 DB로 내보내야 함.
		//문제점 : 이렇게 길면 오타날 수도 있고 뭐.... 그건 내 책임이니까 쩔 수 없음.
		//		 그치만 statement 방식을 무려 국가에서 권장 안 함.
		//	     보안상 무지 취약하거든. = 데이터에 직접 문자를 넣으면 쿼리문에 들어갈 데이터 변조 가능.
		//		 최악의 경우 그 테이블 내 데이터를 죄다 뽑을 수 있다.
		
		try {
			st = conn.createStatement();	
				//이제 여기서 작성한 데이터를 DB로 보내는 구간인데 실패할 가능성을 사전에 지정해야 함.
				//sql문을 보내기 위한 statement객체 생성
			st.executeUpdate(sql);
				//sql문을 DB에 전달.
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("데이터 저장 실패");
			
		}
	*/
	
	public Member[] select() {
		Member[] list = null;
		String sql = "select count(*) as cnt from test_member";
		
		try {
			int size = 0;
			st = conn.createStatement();
			rs = st.executeQuery(sql);
				//메서드에 따라 사용해야 할 구문이 달라짐 : 아까는 업데이트지만 지금은 쿼리.
			if(rs.next()) {
				size = rs.getInt("cnt"); // = db에 데이터(레코드) 수를 묻는 구문.
				//count에 대한 결과는 cnt컬럼에 있음(정수 타입으로 결과가 나오기에 getInt 사용)
				//rs = st~ 를 쓰려면 if(rs.next())이걸 먼저 해야 함.
				//주소를 지속적으로 이동하면서 데이터의 유무를 확인하는 변수가 rs의 역할임.
				//count는 값을 단발적으로만 낼 수 있어서 count는 이 상황에서 부적합함.
			}
			
			if(size!=0) {//=만약 배열에 데이터가 있다면 
				list = new Member[size];	//여기선 객체를 만든건 아님. 참조변수의 공간만 만든거.
				int i=0;
				sql = "select * from test_member";		//전체 데이터 조회 쿼리
				rs=st.executeQuery(sql);	//조회결과를 받기
				while(rs.next()) {	//조회 결과를 1개씩 순회, 언제 끝나는지 알 수 없으므로 while을 사용해야 함
					list[i] = new Member(rs.getInt("member_id"), rs.getString("name"), 
							 rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), 
							 rs.getInt("total"), rs.getInt("std_avg"));
					//생성자 메서드를 만든건 이쪽. 
					i++;	//배열의 다음 인덱스 표현을 위해 1씩 증가
				}
			}
			
		}catch(Exception e) {
			System.out.println("데이터 조회 실패");
		}
		
		return list;
	}
	
}

//근데 프레임워크 배울 쯤에는 알아서 다 해준다니 이 무슨 배신감!
package java0709_2;
//지금 이 클래스의 경우에는 DBeaver와 이클립스간을 연결하는 목적을 가짐.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Board_DAO {
//DAO 클래스는 아래 4가지는 일단 기본으로 만들고 시작하자. 이해 안 되면 먼저 외우자.
	
	private Connection conn;
	//DB에 접속 정보 저장 : sql명령어(쿼리문)을 전달하고 받을 수 있게 만듬.
	private Statement st;
	//conn에서 연결한 sql 명령어를 전달하고 받는 실질적인 역할(직렬 / 보안상 취약)
	//달리 말하면 보안상 그닥 위험하지 않으면 이걸 써도 몬다이나이
	private PreparedStatement pt;
	//st와 동일한 역할이나 병렬로 처리함(정부 권장사항)
	private ResultSet rs;
	//데이터의 조회 및 결과를 저장하는 역할.
	
	public Board_DAO(){
		DriverLoad();	//DB드라이버 로드 메서드
		Connect();		//DB접속 메서드
		//두 메서드는 내부에서만 시행할 것이므로 private 사용함
	}
	
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("드라이버 로드 실패");
		}
	}
	
	private void Connect() {
		String username="burnout";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/burnout";
		
		try {
			conn=DriverManager.getConnection(url, username,password);
		}catch(Exception e) {
			System.out.println("접속 실패");
		}
	}

//test_board의 테이블에 있는 데이터를 가져와 Board클래스의 객체로 저장하기
	
	public Board[] findByAll() {
		Board[] list = new Board[7];	//Board클래스에 객체 7개 저장
		
		String sql ="select * from test_board";
			//sql 질의문(쿼리문)만들기 = test_board에 있는 걸 모두 선택해라

		
		try {
			st=conn.createStatement();	//statement 형성
			rs=st.executeQuery(sql);
			//select 사용시 : executeQurey메서드 사용
			//insert, update, delete 사용시 : executeUpdate 메서드 사용
			int i=0;	//배열의 인덱스 표현
			while(rs.next()) {
				list[i] = new Board(rs.getInt("board_id"), rs.getString("title"),
						rs.getString("writter"), rs.getString("content"), rs.getInt("hit"));
				//여기엔 컬럼명으로 작성을 해야 함
				i++;	
			}
		}catch(Exception e) {
			System.out.println("데이터 가져오기 실패");
		}
		
		
		return list;	//해당 내용을 list라는 이름으로 정의해서 Board 배열에 정의
	}
	
	
	
	
}


/*
필수요소 : Connection, Statement(or PreparedStatement), ResultSet
	※각 필수요소에는 참조 변수 필요(줄여서 conn, st(or ps), rs로 간단히 사용)
	
1. DB와 연결하기 위한 드라이버 로드 : 
	= Class.forName("com.mysql.cj.jdbc.Driver");
	※MySQL 버전 5 이후 : com.mysql.cj.jdbc.Driver
	 		   5 이전 : com.mysql.jdbc.Driver
	 ※동작 실패의 원인이 있을 수 있어 예외처리가 필요 : try~catch
	 	= 드라이버 로드가 되지 않았을 때 catch에 지정한 문구를 실행
	 	= 실패 원인은 단 하나임 : 드라이버를 연결하지 않아서.
	 
2. DB에 접속하기 : 필수요소는 DB 계정명, 비밀번호, DB 주소
	1)접속방법 : conn = DriverManager.getConnection(주소, 계정명, 비번);
	2)접속시도 결과 : Connection의 참조변수(conn)에 저장

3. 참조변수 conn 통해 (Prepared)Statement의 객체를 생성 후 SQL명령어 전송

	
*/  
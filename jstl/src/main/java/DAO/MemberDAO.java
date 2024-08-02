package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBconnect{
//회원관련 DB 작업하는 클래스
//드라이버에 연결한 DB커넥트 클래스를 이용해 직접 데이터베이스에 저장하는 방식
public boolean login(String id, String pw) {
	String sql="select * from member where user_id=? and user_password=?";
		//쿼리 문에서 and or not 이런건 걍 영어로 쓰는거다
		//member 클래스에서 user id와 user password가 일치하는가?
		//아무것도 나오지 않으면 일치하지 않는다는 의미임
		//이렇게 하면 예전 jsp_study > study > signCheck에 있던 String sql문부터 그 아래까지 이어지는 그 긴거 대체함
	
	try {
		pt=conn.prepareStatement(sql);
		pt.setString(1, id);
		pt.setString(2, pw);
		rs=pt.executeQuery();
			//사용자가 입력한 로그인 정보가 존재하면 값이 있음
			//일치값이 없으면 아무것도 안 나옴
		if(rs.next() ) {
			//다양한 결과 값을 도출해야 하는 while문과 달리 있느냐 없느냐만
			return true;
		}
	}catch(SQLException e) {
		System.out.println("회원 로그인 조회 중 오류");
	}
	return false;
	
}	
	public void save(MemberDTO member) {
		//회원가입에 입력한 내용을 member 테이블에 저장할 예정임
		//MemberDTO 클래스
		String sql = "insert into member(user_id, user_password, user_email, user_name) "
				+ " values(?,?,?,?)";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("회원가입 member테이블 저장 실패");
			e.printStackTrace();
		}
	}
	public List<String> findAllUserId() {
		String sql = "select user_id from member";
			//멤버 테이블에 있는 user_id 컬럼을 가져온다.
		List<String> list = new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("user_id"));
			}
		}catch(SQLException e) {
			System.out.println("전체 아이디 조회 실패");
			e.printStackTrace();
		}
		return null;
	}
}

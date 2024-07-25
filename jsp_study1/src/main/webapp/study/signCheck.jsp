<%@page import="java.sql.*, java.util.ArrayList, study.Member"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
입력한 아이디와 비밀번호를 데이터 베이스에 저장된 member테이블들의 값과 비교,
일치하면 로그인 처리 세션을 진행, 불일치하면 아이디-비밀번호가 틀렸다고 말함.
--%>

<%
	request.setCharacterEncoding("UTF-8");

	String id = request.getParameter("userId");
	String pw = request.getParameter("userPassword");

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}catch(Exception e){
		System.out.println("드라이버 로드 실패");
	}

	String user = "burnout";
	String password ="1234";
	String url ="jdbc:mysql://localhost:3306/burnout";

	Connection conn =null;
	PreparedStatement pt = null;
	try{
		conn=DriverManager.getConnection(url, user, password);
	}catch(SQLException e){
		System.out.println("접속 실패");
	}

	//멤버테이블의 데이터와 비교해 로그인 처리 진행
	//자바코드와 데이터베이스를 이용해 각각 비교해보는 과정을 해볼거임
	
	String sql ="select * from member";

	ResultSet rs=null;//select문 결과를 받기 위한 참조 변수
    ArrayList<Member> list = new ArrayList<>();

	try{
		pt=conn.prepareStatement(sql);
		rs=pt.executeQuery();	
		while(rs.next()){
			list.add(
		new Member(rs.getString("user_id"), rs.getString("user_password"), 
				rs.getString("user_email"), rs.getString("user_name"), rs.getInt("level"))
			);
		}
	}catch(SQLException e){
		System.out.println("조회실패");
	}
	
	if(!list.isEmpty() ){//테이블 조회한 데이터를 ArrayList에 저장한 경우
		for(Member m : list){
			if(m.getUserId().equals(id) ){
				if(m.getUserPassword().equals(pw)){
					session.setAttribute("user", m);	
					//여기서 m = 입력한 아이디, 비밀번호가 일치한 멤버 클래스 객체
					String path = request.getContextPath()+"/study";
					response.sendRedirect(path);
				}
			}
		}
	}
	
%>
<script>
	alert("아이디 또는 비밀번호가 틀렸습니다.");
	history.back();
</script>


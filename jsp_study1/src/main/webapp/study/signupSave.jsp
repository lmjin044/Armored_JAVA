
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
이 페이지의 목표 : 회원가입을 위해 입력한 값을 Member 클래스의 객체로 저장
			  객체의 데이터를 데이터베이스에 저장 
--%>
<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="newMem" class="study.Member" />
<jsp:setProperty property="*" name="newMem"/>


<%
/*
newMem 객체의 데이터를 데이터베이스에 저장하기 순서
1. DB 드라이버 로드
2. DB 계정 접속
*/

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
/*멤버 테이블에 회원가입 입력한 값 저장하기
	1.sql 쿼리문 작성
	2.preparedstatement 혹은 statement 객체 생성
	3. 2.의 객체를 사용해 쿼리문 전달하기
*/
	String sql ="insert into member(user_id, user_password, user_email, user_name) values(?, ?, ?, ?)";

	boolean isSuccess = true;//테이블 저장성공의 유무 : true시 성공, false는 실패

	try{
		pt= conn.prepareStatement(sql);
		pt.setString(1, newMem.getUserId());
		pt.setString(2, newMem.getUserPassword());
		pt.setString(3, newMem.getUserEmail());
		pt.setString(4, newMem.getUserName());
		pt.executeUpdate();
		
	}catch(SQLException e){
		isSuccess=false;
		e.printStackTrace();
		System.out.println("member테이블 저장 실패");
		out.println("<h1>회원가입 실패, 다시 입력해주세요</h1>"+"<a href='javascript:history.back();'>이전</a>");
			//회원가입 실패시, 위 문구와 함께 '이전' 태그를 눌러 돌아가게 만드는거.
		//response.sendRedirect("/jsp_study1/study/?part=signup");
	}
	if(isSuccess){
		response.sendRedirect("/jsp_study1/study/?part=signin");
	//저장 성공시 로그인 페이지로, 그렇지 않으면 회원가입 페이지로 이동시키기
	}
%>
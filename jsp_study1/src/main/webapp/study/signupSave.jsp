<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
이 페이지의 목표 : 회원가입을 위해 입력한 값을 Member 클래스의 객체로 저장
			  객체의 데이터를 데이터베이스에 저장 
--%>

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
String url ="jdbc:mysql//localhost:3606/burnout";

Connection conn =null;
PreparedStatement pt = null;
try{
	
}catch(SQLException e){
	System.out.print("접속 실패");
}

%>
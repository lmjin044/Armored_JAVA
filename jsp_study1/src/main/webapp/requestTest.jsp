<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//request 객체 안에 담긴 것을 저장하는 방법
 	String name = request.getParameter("myName");
	String today = request.getParameter("today");
	String[] interest = request.getParameterValues("interest"); 
		//달력은 날짜 클래스가 아니라 문자열로 저장된다.
		//체크박스로 선택되는 것은 배열로 저장하여 getParameterValues로 복수형 사용해야 한다.
		//다만 받아오는 것은 데이터 이름이 아니라 데이터 자체의 값으로 출력이 되어버린다.
	String city = request.getParameter("city");	
%>

<div> 이름 : <%=name %></div>
<div> 날짜 : <%=today %></div>
<div> 관심 : <%=Arrays.toString(interest) %></div>
	<!-- 배열을 문자열로 출력하기 위해선 Arrays.toString(배열명)을 사용
		+ 상단에 Arrays를 import할 것. -->
<div> 도시 : <%=city %></div>
</body>
</html>
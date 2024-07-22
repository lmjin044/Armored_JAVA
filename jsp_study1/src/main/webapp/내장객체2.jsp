<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
response : 사용자 요청에 대한 응답을 위한 객체
		= 사용자 요청은 주로 새 페이지
		=response로 사용자가 요구하는 페이지 제공
				
*페이지 이동을 위한 메서드 : sendRedirect



 --%>    
<%
response.sendRedirect("requestTest2.jsp");
//페이지를 전달하는 메서드임.
%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
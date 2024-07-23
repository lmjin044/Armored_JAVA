<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
out.print("출력");
out.newLine();	//줄바꿈
out.println("출력 가능 : 정수, 실수, 문자, 문자열");

String name = "이순신";
pageContext.getRequest().getParameter(name);
pageContext.setAttribute("age", 25);

pageContext.include("requestTest2.jsp");
	//pageContext.include("경로.jsp"); 
	//= pageContext.forward("test3.jsp");

	//사실 아래와 같은 방식으로 쓰는게 더 쉽다.
%>

<jsp:include page ="main.jsp" />
<jsp:forward page =""/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
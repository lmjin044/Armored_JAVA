<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
request.setAttribute("name", "장보고");
session.setAttribute("age", 34);
application.setAttribute("job", "군인");

%>
request 객체 -> name : <%=request.getAttribute("name") %><br>
session 객체 -> age : <%=session.getAttribute("age") %><br>
application 객체 -> job : <%=application.getAttribute("job") %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>


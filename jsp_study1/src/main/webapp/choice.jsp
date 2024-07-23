<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 request.setCharacterEncoding("utf-8");
 %>   
 
<jsp:useBean id="Lunch" class ="test.Lunch" />
<jsp:setProperty name = "Lunch" property ="*" />


<jsp:getProperty name = "Lunch" property = "menu" />
<jsp:getProperty name = "Lunch" property = "price" />
<jsp:getProperty name = "Lunch" property = "restaurant" />



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
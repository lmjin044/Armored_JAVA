<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 int num =10;
 String name = "이순신";
 for(int i=1; i<=5; i++){
	 System.out.println(num);
 }
	 
 Test1 test = new Test1("김춘추", 45);
	
 out.println(test.getName());
 out.println(test.getAge());
 
 
 %>   
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=num %> <%=name %>></h1>
</body>
</html>
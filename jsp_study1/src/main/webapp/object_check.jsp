<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<h2>객체 속성 : </h2>
request 객체 -> name : <%=request.getAttribute("name") %><br>
session 객체 -> age : <%=session.getAttribute("age") %><br>
application 객체 -> job : <%=application.getAttribute("job") %>

<%--request, session은 브라우저를 닫으면 기존 객체가 사라짐
	application은 브라우저를 닫아도 유지 됨. 서버를 닫아야 객체가 사라짐.
 --%>

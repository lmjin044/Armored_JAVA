<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--
내장객체 : 
	JSP 페이지 생성하고 서버에 의해 페이지가 동작할 때
	서버에서 페이지에게 객체를 할당해주는 것을 의미
 -종류
 	1)서버(application) : 서버 첫 시작시 생성되는 객체
 	2)연결(session) : 사용자가 서버에 처음 요청할 때 생성.
 					 브라우저 종료 전까지 유지됨. 
 	3)페이지
 		-★request : 사용자 요청 저장 객체
 		-★response : 요청에 대한 응답 정보 저장 객체
		-out : 출력객체
		-page : JSP페이지 그 자체
		-config : JSP 페이지 설정 정보 저장 객체
		-exception : JSP 페이지 예외발생 처리 객체
		-pageCotext : JSP 페이지 정보를 저장
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	out.println( request.getLocale() );
	out.println( request.getMethod() );
	out.println( request.getRequestURI() );
	out.println( request.getRequestURL() );
%>

<form method ="get" action="requestTest.jsp"> 
	<input type = "text" name = "myName"><br>
	<input type = "date" name = "today"><br>
	<input type = "checkbox" name = "interest" value = "게임"> 게임
	<input type = "checkbox" name = "interest" value = "영화"> 영화
	<input type = "checkbox" name = "interest" value = "음악"> 음악
	<input type = "checkbox" name = "interest" value = "운동"> 운동
	<br>
	<select name = "city">
		<option value = "대전">대전</option>
		<option value = "서울">서울</option>
		<option value = "광주">광주</option>
		<option value = "부산">부산</option>
	</select>
	
	
	<br><button>전송</button>
	<!-- 이러면 requestTest 페이지에 myName과 today의 파라미터로 저장이 됨. 
	checkbox의 name은 하나의 이름으로 정해야 같은 그룹으로 지정됨.-->
</form>





</body>
</html>
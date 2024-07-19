<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
//이러면 자바코드 입력 가능
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");

	out.println(myId);

	if(myId.equals("moon")&&myPw.equals("1234")){
%>
	<script>
		alert("로그인 성공");
		location.href="login.jsp"
		
	</script>


<%	
	}
%>

<%=myPw %>




<%-- 이건 jsp 주석 양식 --%>

 



<!-- 이건 자바스크립트에서도 쓰던 주석 양식 -->
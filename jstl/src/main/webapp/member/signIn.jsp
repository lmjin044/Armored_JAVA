<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인화면</h2>
<div id ="signinBox">
	<form id="signFm" method ="post" action ="signCheck.jsp">
	<div class="loginInput">
		<b>아이디</b>
		<input type ="text" name ="userId" id="userId"><br>
		<p class ="error"></p>
	</div>
	<div class="loginInput">
		<b>비밀번호</b>
		<input type="text" name="userPassword" id="userPassword"><br>
		<p class ="error"></p>
	</div>	
	
		<button id="loginBt" type="button">로그인</button>	
	
	</form>
	
	<div class = "findAndJoin">
		<p><a href="findUser.jsp">아이디/비밀번호 찾기</a></p>
		<p><a href="/jsp_study1/study/?part=signup">회원가입</a></p>
		
	</div>
	
</div>

</body>
</html>
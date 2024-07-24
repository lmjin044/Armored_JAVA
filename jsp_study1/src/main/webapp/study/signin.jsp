<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <link rel="stylesheet" href ="signin.css" >
 
   
<div id ="signinBox">
	<form method ="post" action ="signCheck.jsp">
		<b>아이디</b> : <input type ="text" name ="userId"><br>
		<b>비밀번호</b> : <input type="text" name="userPassword"><br>
		<button id="loginBt">로그인</button>	
	</form>
	
		<p><a href="findUser.jsp"></a>아이디/비밀번호 찾기</p>
		<p><a href="signup.jsp"></a>회원가입</p>
	
</div>

<%--
전송방식 :post
전송주소 : signCheck.jsp
아이디 파라미터 : userId
비밀번호 파라미터 :userPassword
아이디/비밀번호 찾기 주소 : findUser.jsp
회원가입 주소 : signUp.jsp
--%>
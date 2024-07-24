<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div id="signupBox">
	<form method="post" action="signupSave.jsp">
		<div class="joinInput">
			<lable>아이디</lable>
			<input type="text" name="userId" placeholder="아이디 입력">
		</div>
	
		<div class="joinInput">
			<lable>비밀번호</lable>
			<input type="text" name="userPassword" placeholder="비밀번호 입력">
		</div>

		<div class="joinInput">
			<lable>이메일</lable>
			<input type="email" name="userEmail" placeholder="이메일 입력">
		</div>		

		<div class="joinInput">
			<lable>이름</lable>
			<input type="text" name="userName" placeholder="이름 입력">
		</div>
		<button id="joinBt">회원가입</button>
	</form>
	

</div>   
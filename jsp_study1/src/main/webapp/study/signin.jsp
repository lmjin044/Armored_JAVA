<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link rel="stylesheet" href ="signin.css" >
 
   
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
<style>
	.error{color:red; font-size: 14px;}
</style>
<script>
	let bt = document.getElementById("loginBt");
	bt.addEventListener("click", function(){
		let id = document.getElementById("userId");
		let pw = document.getElementById("userPassword");
		if(id.value==''){//아이디 입력 안한 경우
			document.getElementsByClassName("error")[0].innerText="아이디를 입력하세요";
		}else if(pw.value==''){//비번 입력 안한경우
			document.getElementsByClassName("error")[1].innerText="비밀번호를 입력하세요";
		}else{//입력했다면 로그인 처리페이지로 데이터 전송 및 이동
			document.getElementById("signFm").submit();
		}
		
		
			
	});



</script>


<%--
전송방식 :post
전송주소 : signCheck.jsp
아이디 파라미터 : userId
비밀번호 파라미터 :userPassword
아이디/비밀번호 찾기 주소 : findUser.jsp
회원가입 주소 : signup.jsp
--%>
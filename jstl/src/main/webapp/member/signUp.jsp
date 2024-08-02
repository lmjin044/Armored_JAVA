<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
    <script
        src="https://code.jquery.com/jquery-3.7.1.js"
        integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
        crossorigin="anonymous">
    </script>
</head>

<body>
<h2>회원가입</h2>
<div id="signupBox">
	<form id="signFm" method="post" action="/signUpSave.do">
	<input type="hidden" name="preURL" id="preURL">
		<div class="joinInput">
			<lable>아이디</lable>
			<input type="text" name="userId" placeholder="아이디 입력">
			<p class = "duplicate"></p>
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
		<button id="joinBt">등록</button>
	</form>
	

</div>   
</body>
<script>
	var temp = '${idList}';
	const IdList = temp.substring(1, temp.length-1).split(", ");
	
	$("input[name=userId]").on("keyup", function(){
		var id=$(this).val();
		if(IdList.indexOf(id) == -1){
			$(".duplicate").text("사용가능한 아이디입니다.");
			$(".duplicate").css("color","green");
		}else{
			$(".duplicate").text("이미 사용중인 아이디입니다.");
			$(".duplicate").css("color","red");
		}
	});
</script>

</html>
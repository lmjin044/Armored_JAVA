<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>이름과 점수를 입력하세요 : </h3>
<form method = "get" action = "result1.jsp">
	이름 : <input type = "text" name = "stuName"><br>
	국어성적 : <input type = "number" name = "kor"><br>
	수학성적 : <input type = "number" name = "mat"><br>
	과학성적 : <input type = "number" name = "sci"><br>
	
	<button>제출</button>
</form>


</body>
</html>
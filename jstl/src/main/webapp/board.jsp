<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/board">
		<button>글작성</button>
	</form>
<!-- form 태그 혹은 자바스크립트를 이용하면 post 방식으로 전송가능  -->
	
<table>
	<tr>
		<td> <a href="/board">게시글 첫번째 제목입니다.</a></td>
<!-- get 방식은 가장 쉬운에 a 태그를 이용하는거임. a태그가 곧 get방식이라. -->
		<td> 여기는 작성자</td>
	</tr>

</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<td>제목</td>
		<td>${board.title }</td>
	</tr>
	<tr>
		<td>조회수</td>
		<td>${board.hit }</td>
	</tr>
	<tr>
		<td>작성자</td>
		<td>${board.writer }</td>
	</tr>
	<tr>
		<td>내용</td>
		<td>${board.content }</td>
	</tr>
	<tr>
		<td colspan ='2'>
			<c:if test="${sessionScope.user eq board.writer }">
				<button type = "button" id="modify">수정</button>
				<button type = "button" id="delete">삭제</button>
			</c:if>
		
		</td>
			
	</tr>	
</table>

</body>
</html>
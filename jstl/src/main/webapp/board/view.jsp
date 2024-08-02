<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
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
<a href="/board.do">게시판 목록</a>
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
	<hr>
	<!-- 댓글다는 공간 -->
	<table>
		<c:if test ='${sessionScope.user != null }'>
			<!-- 로그인 해야 보이는 댓글창과 등록 버튼 -->
			<tr>
				<td>
					<textarea id = "comment" name="comment" rows=3 cols=30></textarea>
				</td>
				<td>
					<button id="commentBt">입력</button>
				</td>
			</tr>
		</c:if>
		<tr>
			<td></td>
			<td></td>
		</tr>
	</table>
	
</body>
</html>

<script>
	${"#commentBt"}.on("click", function(){//등록 버튼을 클릭하면 아래와 같은 폼태그를 형성
		let $fm=$('<form></form>');//폼태그 생성
			$fm.attr('method', 'get');	//방식 지정
			$fm.attr('action', '/commnet.do');	//경로 지정
			$fm.append($('#comment'));	//id가 comment인 댓글창에 반영
			$fm.appendTo("body");		//body태그로 전송
			$fm.submit();	//전송
	});

	$("#modify").on("click", function(){
		location.href="/boardUpdate.do?id=${board.board_id}";
	} );
	
	
	
	$("#delete").on("click", function(){
		var isOk = confirm("정말 삭제하시겠습니까?");
		if(isOk){
			location.href="/boardDelete.do?id=${board.board_id}";
		}
	});

</script>
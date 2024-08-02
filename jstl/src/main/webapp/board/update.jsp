<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <link rel="stylesheet" href ="board/boardWrite.css" >


<form method="post" action="/boardUpdate.do">
	<input type="hidden" name="method" value="update">
	<input type="hidden" name="boardId" value="${board.board_id }">
<!-- 액션 메서드가 같은 write.do로 지정되어있는데 필요에 따라 달리 주소 지정하는 방법
	input태그의 타입을 hidden으로 설정해 보이지 않지만 데이터를 지니게 만듬
	그 뒤에 name이 method인 파라미터의 유무로 같은 주소를 이용해도 다른 결과가 나오게 함.
 -->
	<div id="wirteInput">
		<label>제목</label>
		<input type="text" name="title" id="title" value='${board.title }'>
	</div>

	<div id="wirteInput">
		<label>내용</label>
		<textarea name="content" id="content" value='${board.content }'></textarea>
	</div>
	<button>작성</button>
</form>


</body>
</html>
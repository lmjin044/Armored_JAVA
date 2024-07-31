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
<link rel="stylesheet" href ="board/board.css" >

<div id="boardWrap">
	<h2>게시판</h2>
	<div id="boardBox">
		<div id="boardListBox">
			<table id="boardList">
				<tr>
					<th class="num">번호</th>
					<th class="title">제목</th>
					<th class="writer">작성자</th>
					<th class="hit">조회수</th>
				</tr>
				
				<tr>
					<td class="num"></td>
					<td class="title">
						<a href ="?part=view&id="> </a>
					</td>
					<!-- 파라미터와 파라미터를 구별하기 위해서는 &연산자를 사용한다. -->
					<td class="writer"></td>
					<td class="hit"></td>
				</tr>
				
			</table>
		</div>
		<div id="boardSearchBox">
			<form method="get" action="?part=board">
				<div class="boardSearch">
					<input type="search" name="word" id="word">
					<button>검색</button>
				</div>
			</form>
		</div>
		<div id="boardWriteBox">
			<a id="wrBt">글작성</a>
		</div>
	</div>
</div>


<script>
//글작성 클릭시 로그인 회원 중 권한 있는 사람만 작성 가능하게 하는 스크립트

$("#wrBt").on("click", function(){
	//글작성 클릭 시 일어나는 이벤트 
	if('${sessionScope.user}' != '' ){
		location.href="/write.do";//클릭한 사람이 로그인 한 유저일 경우 
	}else{
		var isOk = confirm("글작성 권한이 없습니다.")	
		//아니면 권한 부족을 '확인, 취소' 버튼을 포함한 알림창으로 안내
		if(isOk){	//'확인'을 누르면 로그인 창으로 이동
			location.href="/signIn.do";
		}
	}
	
});
</script>
</body>
</html>
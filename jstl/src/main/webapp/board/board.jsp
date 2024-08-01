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
<link rel="stylesheet" href ="board/board.css" >
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">

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
				
		<c:forEach var ="row" items='${list }' >
		<!-- BoardDTO에서 설정했던 변수명 -->	
				<tr>
					<td class="num">${row.board_id }</td>
					<!-- EL태그로 가져올 경우 get메서드를 알아서 호출해서 변수명만 지정해도 됨
					그치만 직접 호출이 아니라는 점은 유의해라 -->
					<td class="title">
						<a href ="/boardView.do?id=${row.board_id }">${row.title }</a>
					</td>
					<td class="writer">${row.writer }</td>
					<td class="hit">${row.hit }</td>
				</tr>
				<!-- 위 tr태그를 반복문으로 돌려야 함 -->
				
				
		</c:forEach>
				
			</table>
			
			<style>
				#pageNumList{list-style: none; padding : 30px 0; margin:0; display:flex;
				justify-content: center;}
				#pageNumList li{width:50px; text-align: center;}
				#pageNumList .nowPage{background: #ccc; font-weight: 800;}
			</style>
			
			<div id ="pageNumbers">
				<ul id = "pageNumList">
				
			<a href ="/board.do?page=${pageNum-skip <1 ? 1:pageNum-skip }"><i class="bi bi-arrow-bar-left"></i></a>
			
			<c:forEach var = "i" begin= '${startPage }' end='${endPage }' step="1">
			
				<c:if test='${pageNum == i }'>
					<li class = "nowPage"></li>
				</c:if>
				<c:if test='${pageNum != i }'>	
					<li><a href="/board.do?page=${i }${param.word==null ? '' : '&word'+param.word}">${i }</a></li>
				</c:if>	
			</c:forEach>
			<a href="/board.do?page=${pageNum+skip >pageTotalNum ? pageTotalNum : pageNum+skip }"><i class="bi bi-arrow-bar-right"></i></a>
			
				</ul>
			</div>
			
			
			
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
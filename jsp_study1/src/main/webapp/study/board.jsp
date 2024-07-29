<%@page import="study.board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="study.DBconnect"%>
<%@page import="study.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--  board.jsp --%>
 <link rel="stylesheet" href ="board.css" >

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
				<%
				DBconnect db = new DBconnect();
				String sql = "select * from board order by board_id desc";
				
				ArrayList<board> list = new ArrayList<>();		

				try{
					db.pt = db.conn.prepareStatement(sql);
					db.rs = db.pt.executeQuery();
					while(db.rs.next()){
						list.add(
							new board(db.rs.getInt("board_id"), db.rs.getString("title"), db.rs.getString("writer"),
									   db.rs.getString("content"), db.rs.getInt("hit"))
							);
						
					}
				}catch(Exception e){
					e.printStackTrace();
					System.out.println("board 테이블 조회 실패");
				}
					
				
					for(board row : list){
				%>
				<tr>
					<td class="num"><%=row.getBoard_id() %></td>
					<td class="title">
						<a href ="?part=view&id=<%=row.getBoard_id() %>"> <%=row.getTitle() %></a>
					</td>
					<!-- 파라미터와 파라미터를 구별하기 위해서는 &연산자를 사용한다. -->
					<td class="writer"><%=row.getWriter() %></td>
					<td class="hit"><%=row.getHit() %></td>
				</tr>
				<% } %>
				
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

<%
int level=0;
if(session.getAttribute("user") !=null){
	level=((study.Member)session.getAttribute("user")).getLevel();
}

%>
<script>
//글작성 클릭시 로그인 회원 중 권한 있는 사람만 작성 가능하게 하는 스크립트
let lv= '<%=level%>';
$("#wrBt").on("click", function(){
	//글작성 클릭 시 일어나는 이벤트 
	if(lv==3){
		location.href="?part=boardWrite";//클릭한 사람의 레벨이 3이면 글작성
	}else{
		alert("글작성 권한이 없습니다.")	//아니면 권한 부족 알림
	}
	
});
</script>
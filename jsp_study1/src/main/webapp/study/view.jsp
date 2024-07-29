<%@page import="study.BoardImg"%>
<%@page import="study.board"%>
<%@page import="java.sql.SQLException"%>
<%@page import="study.DBconnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
DBconnect db = new DBconnect();

int id = Integer.parseInt(request.getParameter("id"));
	//id 파라미터 값을 정수로 가져오기
String sql = "select * from board where board_id=?";
	
board data = null;	
try{
	db.pt = db.conn.prepareStatement(sql);
	db.pt.setInt(1,id);
	db.rs = db.pt.executeQuery();
	if(db.rs.next()){
		data = new board(db.rs.getInt("board_id"), db.rs.getString("title"), db.rs.getString("writer"),
				   db.rs.getString("content"), db.rs.getInt("hit"));
	}
}catch(SQLException e){
	e.printStackTrace();
	System.out.println("게시글 조회 실패");
}

sql = "select * from board_img where board_id=?";
	//게시글의 이미지도 가져오기
BoardImg img = null;
try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setInt(1, data.getBoard_id());
	db.rs = db.pt.executeQuery();
	if(db.rs.next() ){
		img = new BoardImg(db.rs.getInt("board_img_id"), db.rs.getInt("board_id"), db.rs.getString("img_name"),
				db.rs.getString("img_path"));
	}
}catch(SQLException e){
	e.printStackTrace();
	System.out.println("게시글 이미지 조회 실패");
}

%>

<h2>제목 : <%=data.getTitle() %></h2>
<h3>작성자 : <%=data.getWriter() %></h3>
<h3>내용 : <%=data.getContent() %></h3>
<h3>조회수 : <%=data.getHit() %></h3>
<img src="<%=img.getImgPath() %><%=img.getImgName() %>">    
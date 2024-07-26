<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.SQLException"%>
<%@page import="study.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.DBconnect"%>
    
<% 
request.setCharacterEncoding("utf-8");
String writer = ((Member)session.getAttribute("user")).getUserId();
	//작성자 가져오기
	
	 String path="C:\\LMJ\\Armored_JAVA\\jsp_study1\\src\\main\\webapp\\study\\image";
	//이미지업로드해서 저장될 위치 지정
	int size = 1024*1024*20;
	//업로드할 수 있는 이미지의 최대 크기. 사이즈와 mb 단위로 지정하는거임.
	
	String title = null;
	String content = null;
	String imgName =null;
	String imgPath = "/jsp_study1/study/image";
	try{
		MultipartRequest mr = new MultipartRequest(request, path, size, "utf-8", 
				new DefaultFileRenamePolicy());
			//요청하는거, 경로, 크기, 인코딩, 파일 이름의 중복을 방지해주는 역할의 메서드.
		Enumeration em = mr.getFileNames();
			//업로드 이미지의 파일 이름 가져오기
		String file = (String)em.nextElement();
			//이미지 1개만 업로드하는거(nextElement는 1번만 하면 됨)
		imgName = mr.getFilesystemName(file);
			//실제 저장되는 파일명 저장하기
			//오리지널 파일 이름을 저장하는 건 mr.getOriginalFileName(file);
		title = mr.getParameter("title");
		content = mr.getParameter("content");
			//제목과 내용 파라미터 가져오기
	}catch(Exception e){
		System.out.println("업로드 실패");
		e.printStackTrace();
	}
	

DBconnect db = new DBconnect();
	//= db.pt = db.conn.prepareStatement(sql);
	
String sql = "insert into board(title, writer, content) values(?,?,?)";

try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setString(1, title);
	db.pt.setString(2, writer);
	db.pt.setString(3, content);
	db.pt.executeUpdate();
	
}catch(SQLException e){
	e.printStackTrace();
}
int boardId=0;	//저장한 게시글의 번호를 저장하기 위한 변수
sql = "select board_id from board order by board_id desc limit 1";
try{
	db.pt=db.conn.prepareStatement(sql);
	db.rs=db.pt.executeQuery();
	if(db.rs.next()){
		boardId=db.rs.getInt("board_id");
	}
}catch(SQLException e){
	
}

sql = "insert into board_img(board_id, img_name, img_path) values(?,?,?)";

try{
	db.pt=db.conn.prepareStatement(sql);
	db.pt.setInt(1, boardId);
	db.pt.setString(2, imgName);
	db.pt.setString(3, imgPath);
	db.pt.executeUpdate();
}catch(SQLException e){
	
}

response.sendRedirect("/jsp_study1/study/?part=board");
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String select = request.getParameter("select");
 %>
    
<div id = "header">
	<ul id = "menuList">
		<li class = "menu"><a href ="mainPage.jsp">HOME</a></li>
		<li class = "menu">소개</li>
		<li class = "menu">자유게시판</li>
		<li class = "menu <%=select.equals("imageBoard") ? "active":"" %>"><a href ="imageBoard.jsp?part=img">이미지게시판</a></li>
		<!-- 파라미터로 구성된 것을 쿼리 스트링이라 함.
		jsp주소 뒤에 ?파라미터명=태그명 구성으로 직접 형성 가능 -->
		<li class = "menu"><a href ="login.jsp?part=notify"></a>신고</li>
	</ul>
</div>
	
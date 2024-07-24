<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path ="http://localhost:8080/jsp_study1/study/";


%>    
    
    
    
<div id ="header">
	<div id = "top">
	
		<span class="topMenu"><a href="<%=path+"?part=signin"%>">로그인</a></span>
		
		<span class="topMenu">고객센터</span>
		<span class="topMenu">사이트맵</span>
	</div>
	<div id = "nav">
		<div class="logo"></div>
		<ul class="menuList">
			<li><a href="<%=path%>"></a>HOME</li>
			<li><a href="<%=path%>"></a>게시판</li>
			<li><a href="<%=path%>"></a>자료실</li>
			<li><a href="<%=path%>"></a>공부방</li>
			<li><a href="<%=path+"?part=inquiry"%>"></a>문의</li>
		</ul>
	</div>


</div>
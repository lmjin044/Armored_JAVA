<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div if ="imgBoard">
	<%
		for(int i=1; i<=15; i++){
	%>
	<img src = "http://picsum.photos/300/350?random=<%=i %>">
	<%} %>
	<!-- 위와 같이 for 반복문을 설정 한 상태로 src에 i 변수를 걸어두면 15개가 나옴 -->
</div>
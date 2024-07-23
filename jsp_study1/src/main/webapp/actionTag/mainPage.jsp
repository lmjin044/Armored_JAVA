<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
String part = request.getParameter("part");
if(part != null){
	if(part.equals("notify") && session.getAtrribute("user")==null){//신고를 눌렀는데 로그인하지 않았을 경우
		//동작하는 요소를 명확하게 지정해야 npe 이슈가 안 생기기 때문에 위에서는 파트가 비지 않았다는 전제만.
%>		
	<jsp:forward page="login.jsp"/>	
<%
	}
}
%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel ="stylesheet" href="main.css">

</head>
<body>
	<div id="loginBox">
		<a href = "login.jsp">로그인</a>
	</div>

	<h2> 메인 페이지입니다 </h2>
	
	<!-- 이하 메뉴 입니다 header.jsp -->
	<jsp:include page ="header.jsp" /> 
		<jsp:param value="<%=part %>" name="select" />
		<!-- 헤더쪽에 리퀘스트로 들어감 -->
	</jsp:include>
	<div id="main">
		<%
			if(part == null){
		%>
				첫 페이지 내용 
		<%
			}else{
			part+= ".jsp";
			 %>
			<jsp:include page="<%=part %>" />
		<%} %>
		<!-- 파라미터에 파일의 이름을 넣었을 때 위 if문을 적용한다면 
		별도의 추가 항목을 생성하지 않고 이미지 추가 등이 가능. -->
	</div>
	
	<!-- 이하 footer.jsp 입니다 -->
	<jsp:include page="footer.jsp" />

</body>
</html>
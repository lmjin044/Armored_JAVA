<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
session : 웹서버에서 생성 및 저장, 복사하여 클라이언트에게도 전달
		  클라이언트-서버 간 연결 유지를 위해 사용됨
	-tomcat 기준 : 클라이언트 최초 요청 시 session 객체를 생성함.
 --%>    
 <%
 
 session.setAttribute("testUser","123456");
 	//세션 값을 가져오는 메서드 : 내장객체이기 때문에 이걸로 끝
 	//사용자 요청에 따른 것만 가져옴 = 다른 사람 것은 못 가져옴
 	
 session.setMaxInactiveInterval(10*60);
 	//세션만료 시간 설정 : 클라이언트의 별도 요청이 없으면 지정 시간 후 제거
 	//저러면 10분 뒤에 세션 종료하겠다는 소리임(디폴트는 30분)
 	
 session.removeAttribute("testUser"); 	
 	//특정 세션 값 삭제
 	
 session.invalidate();
 	//세션 값 전체 삭제
 	
 Enumeration attr = session.getAttributeNames();
 	//이거 임포트 안하면 오류 난다?
 while(attr.hasMoreElements()){
	 String name = (String)attr.nextElement();
	 String value = (String)session.getAttribute(name);
	 	//나오는 값이 전부 오브젝트이기 때문에 강제 형변환으로 해줘야 한다.
	out.println(name+ ", "+value);
	//현재 접속한 클라이언트 세션 값 가져오기
 }
 	
 	
 %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
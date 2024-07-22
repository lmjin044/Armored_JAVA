<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="java.util.ArrayList, java.util.LinkedList"
    session = "true" errorPage="error500.jsp"
    buffer ="1kb" autoFlush="false"%>

<%@ page import = "java.util.Date"  %>

<%
	String name = "이순신";
	out.println(name);

%>

<%@ include file= "menu.jsp" %>
	
<%
	//include = 다른 파일을 가져올 수 있음
 	out.println("테스트");

//출력은 include가 최우선이 아님. 그 앞에 삽입된 자바 코드 등이 있으면 그걸 먼저 출력함.





 %>

    
  
<%--
<%@ : JSP 지시어 스크립트 작성 부분
	   ㄴ 해당 JSP페이지 설정을 하기 위한 부분
	  page = JSP 페이지의 속성을 지정
	  	   -language :  페이지 언어셋 지정
	  	   -contentype :  문서 타입 지정
	  	   -pageEncoding : 인코딩 타입 지정
	  	   -import : 다른 패키지의 클래스 or 메서트 추가
	  	   -session : 세션 사용여부 지정
	  	   -isErrorPage : true일 경우 에러 페이지로 지정하겠다
	  	   -errorPage : 현재 페이지에서 에러가 발생 되는 페이지를 지정
	  	   	※클라이언트 브라우저에 절대 노출 되어서는 안 되는 페이지임
		   -info : 페이지 설명
		   -extends : 현재 페이지의 상속 받을 클래스 지정
		   -butter : jsp 페이지의 출력 버퍼값 지정(기본 8kb)
		   -autoFlush : 출력 버퍼 초과(=100%이면)수행할 기능 지정
		   		※true :  화면에 출력
		   		※false : IOException을 발생시킴 
		  
-include : 다른 JSP 페이지를 추가(현재 페이지에 내용 포함)
-taglib(태그라이브러리) : 태그 라이브러리의 태그 기능을 사용할 때 

jsp 주석 : 
 1) 사용자 브라우저에선 확인 불가
 2) 서버 컴퓨터에서 동작
 	 ㄴ 서비스 제공을 하는 컴퓨터.
 	 ※웹 전달 과정
 	   클라이언트가 주소에 의한 요청을 했을 때 그 응답을 함.
 	   페이지를 보기 위한 그 주소를 요청하면 
 	   페이지 내부에서 서버 언어(JAVA)를 실행 하고 
 	   클라이언트 언어가(HTML, CSS, JS) 클라이언트에게 전달됨.
 	   클라이언트는 서버로 받은 내용을 브라우저로 실행해 화면에 출력한다.
 
   
 



 --%>  
  
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
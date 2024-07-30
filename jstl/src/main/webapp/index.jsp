<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="num" value="10" />

<a href="/main.jsp">로그인 및 회원가입</a>
<a href="/board.jsp">게시판</a> 
<a href="/inquiry">문의</a> 
${num+20 }

<%--

taglib : 해당 jsp 내에서 태그 라이브러리를 사용할 수 있게 하는 지시어. 
	prefix = "" 를 뒤에 붙여 일종의 변수처럼 별칭을 지정하고 uri를 설정한다.
		c = 코어 태그.
		uri는 =까지 입력 후 ctrl+space로 자동완성이 가능하다.
		
 맨 위에서 c 태그를 사용하겠다고 지정한 후, num이라는 변수명과 10이라는 값을 지정함.
 *그리고 태그 끝은 />로 마무리 지어야 함.
 
 EL 표기식(= ${}) : <%= %>의 강화버전.
 				  더 쉽고, 더 깔끔하다. 
 				  
 <c:cet var ="num" value="300" scope="session" />

${sessionScope.num }				  
 				  
 scope 뒤에 session으로 설정하면 num이라는 변수를 session으로 설정하게 됨.
 만약 이 경우에는 session.num으로 저장한 공간을 호출하면 보인다.
  
--%>

<c:if test="${ 30>20}">
30>20은 참이다.</c:if>

<c:choose>
	<c:when test="${num>5}">
		<h1>5보다 크다.</h1>
	</c:when>
	<c:when test="${100>10 }">
		10보다 크다
	</c:when>
	<c:otherwise>
		otherwise는 위의 when 조건식이 모두 거짓일때 실행된다.
	</c:otherwise>


</c:choose>
<%--
core 태그 조건문 
<c:if test="조건식"/> : 
 --%>
 <c:forEach begin="1" end="10" step="1">
 	for문처럼 시작태그부터 종료태그까지 반복된다
 </c:forEach>
 <%
 ArrayList<String> list = new ArrayList<>();
 list.add("강감찬"); list.add("이순신"); list.add("장보고"); 
 request.setAttribute("list", list);
 %>
 
<c:forEach var ="name" items="${list }">
	${name }
</c:forEach>

<c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var ="fruit" delims="@">
	${fruit }
</c:forTokens> 
 
 <%-- 
 반복문 : 
 1) <c:forEach begin="1" end="10" step="1">내용</c:forEach>
 	시작값과 끝 값을 설정하고, 그 단계를 설정한다. 
 	위 예시의 경우 10번까지 반복하게 된다.
 	for문으로 따지자면 for(int i=1; i<=10; i++)의 형태이다.
 	
 2)<c:forEach var ="name" items="${list }"> ${name } </c:forEach>
 
  이 경우는 for(String name:list)와 유사한 역할이다.
  
 3) <c:forTokens> : 문자열 데이터만 취급 가능
 <c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var ="fruit" delims="@">
	${fruit }
 </c:forTokens> 

 의 경우, split과 유사한 역할로, 문자열만 사용한다. 

 --%>
<%--
웹모델 1 : 사용자 요청 > 서버 > 컨테이너 > 서블릿 >
		 페이지처리 > 컨테이너 > 서버 > 사용자. 
		 

웹모델 2(=MVC 디자인 패턴) : 
		사용자 요청 > 서버 > 컨테이너 > '요청에 맞는' 서블릿 >
		데이터베이스가 필요하다면 DAO, DTO > 서블릿 > 컨테이너 > 서버 > 사용자

	Model = service, DAO, DTO
	View = html, jsp 페이지 등 사용자에게 표시되는 부분
	Controller = 사용자 요청을 처리하는 결정(=서블릿)
	
	DAO : data access object = 데이터 접근 클래스
	DTO : data transfer object 데이터 저장 클래스
	
	
	 예시1 - 회원가입을 위한 정보를 입력 후 가입버튼을 클릭.
	 
	 	1)가입요청을 Controller가 받음
	 	2)가입요청을 처리할 Service를 실행
	 	3)Service에서 DB에 저장하기 위한 DAO 실행
	 	4)DAO실행 종료 후 가입완료 페이지를 Controller에 보냄
	 	5)Controller는 가입완료 페이지를 사용자에게 보냄.
	 	
	 예시2 - 회원가입시 등록한 정보로 로그인 하는 경우.
	 	1)로그인 요청을 Controller가 받음.
	 	2)로그인 처리를 할 수 있는 Service 실행.

 
 
 jsp에서 페이지 주소를 변경하는 방법.
 1) <jsp:forward page ="" />
 2)page.Context.forward("경로"와 기능이 유사함 --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
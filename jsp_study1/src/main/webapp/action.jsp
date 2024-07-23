<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%-- 
action : 서버, 클라이언트에게 동작을 명령함
		 include, forward와 같은 느낌인데 태그인.
		 xml형식으로 태그를 사용함 (html의 상위호환)
		 자바bin의 기능을 사용
-종류 
 <jsp:forward / > : 다른 페이지로 주소변경 없이 이동
 <jsp:include / > : 외푸페이지의 내용을 포함해 출력
 <jsp:plugin /> : 웹 브라우저에서 자바 애플릿 실행
 <jsp:useBean / > : jsp 페이지에서 자바 빈즈 설정(자바 클래스 객체)
 		-id = 클래스 객체 주소를 저장할 참조 변수
			 = Music music = new Music();
		-class = 클래스 경로(패키지 포함)
		-scope = 자바빈 객체가 저장될 영역 설정(내장객체 중 하나)
		
 <jsp:setProperty / > : 자바빈즈의 프로퍼티값 설정(=클래스의 인스턴스 변수 값 설정)
 		-name = 객체 이름
 		-property = 인스턴스변수 이름(set변수명 메서드가 호출됨)
 		-value = 저장할 데이터
 		
 <jsp:getProperty / > : 설정한 프로퍼티값을 가져오기(= 클래스에서 인스턴스 변수 값 가져오기)

 <jsp:param / > : forward, include의 인자 추가 (= 메서드의 매개변수에 값 저장) 



	
 --%>    

<jsp:useBean id="music" class="test.music" />
<jsp:setProperty name="music" property="*" /> 



<%--
근데 사실 위 방법이 제일 짜세다. 이걸 쓰면 별도 import도 필요없고 
알아서 다 해준다. 대신 클래스 명과 변수 이름이 완전히 같아야 가능함.
그리고 property에 들어가는 변수가 다양하다면 *로 처리해버리면 그만임.
+ 한글 깨지는 경우 : 페이지 맨 위에  request.setCharacterEncoding("utf-8"); 을 지정할 것
 --%>

<%
out.println(music.getSinger());
//이렇게 해도 되고 아님 아래 방식도 ok
%>

<%=music.getYear() %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
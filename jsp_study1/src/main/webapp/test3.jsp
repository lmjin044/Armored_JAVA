<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!//JSP 스크립트 선언문 파고 들기.

	class Worker{
		String name;
		String job;
		Worker(String name, String job){
			this.name=name;
			this.job=job;
		}
		
		@Override
		public String toString(){
			return name+", "+job;
			
		}
	}
%>   

<%//JSP 스크립트 - 스크립트릿
	Worker[] work = new Worker[]{
		new Worker("이순신", "군인"),
		new Worker("김춘추", "정치인"),
		new Worker("최무선", "연구원"),
		new Worker("정약용", "발명가")
	};

	for(int i=1; i<=10; i++){
		//out.println("<div>"+i+"</div>");
		//할거면 <div>태그를 이용하는 방법으로 더욱 익숙해져라.
%>
	<div> <%=i %> </div>
<%		
	}
%> 


    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>명단</h1>
	
	<%
		for(int i=0; i<work.length; i++){
	%>		
		<div><%=work[i]%></div>
		<!-- div 태그 안에 표현식을 삽입하고 위에 for문의 적용을 받도록 함. -->
	<%
		}//for 문 사이에 html태그를 삽입할 수 있도록 두 스크립트릿을 형성
	%>
	<h1>반복문을 사용하여 1부터 10까지 1줄에 하나씩 출력해보기</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Scanner"%>
    
    
<%--
JSP 스크립트의 종류
	1)JSP 스크립트릿 : <% %> / 일반적인 자바 로직 코드 작성
	2)선언문 : <%! %>	/ 자바 변수, 메서드, 클래스 정의에 작성
	3)표현식 : <%= %> / 결과 값 출력

q. Scanner 기능은 어디서 가능?(일단 최상단에 import로 java.util.Scanner를 삽입)
a. 일단 이건 콘솔 입력 방식이라 브라우저에선 안 나옴.
   결론 = 브라우저에 입력창을 띄우고 싶다면 쓰지 마라.

 --%>  
 
<%!//여기는 선언문
	int age = 20;	
	String name = "이순신";
		//처럼 변수 선언할 수 있고
	
	int sum(int a, int b){
		return a+b;
	}	//처럼 메서드 정의를 할수도 있고
	
	class mem{
		String userName;
	}	//처럼 클래스를 정의할 수도 있지롱.
	
	//if(age>15){} / sum (10, 20);
		//선언문 내에서 불가능 한 것 :
		// 1)if, 반복문
		// 2)계산식, 제어문!
	Scanner scan = new Scanner(System.in);
	
%>

<%//여기는 스크리틀릿
	int num = scan.nextInt();
	
	sum(10, 20);
		//일반식은 여기서 가능!
	
	if(age >15 ){}
		//제어문도 사용 가능!
	String job = "군인";
		//변수 사용 가능!
		
	//void print(){
	//		out.println("출력");
	//	}
		//그러나 메서드나 클래스 정의는 안 된다!
%>


<%=100%>
<%= "<br> 이순신" %>
<%= 10>5 ? "크다" : "작다" %>
<%= sum(10,20) %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>
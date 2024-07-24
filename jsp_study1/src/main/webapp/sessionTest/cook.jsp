<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
쿠키의 종류
	1)세션 쿠키 : 정해진 기간 없이 클라이언트 연결을 끊으면 삭제됨
	2)영구 쿠키 : 정해진 기간 내에서는 클라이언트 연결 관계없이 유지됨
	3)인증 쿠키 : 사용자 정보를 저장(로그인 유지 옵션 등에 사용)
	4)추적 쿠키 : 사용자의 브라우저 내 활동을 기록                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
	5)좀비 쿠키 : 삭제 된 이후에도 다시 생성되는 쿠키(악의적 목적)
			   컴퓨터의 이상한 광고를 띄우는게 주로 이거
			   백신을 돌리기 
			   or 브라우저 내에서 쿠키 삭제 후작업관리자의 세부경로 확인
			   갑자기 없다가 나타나는 것을 찾아내서 빠르게 삭제

문제 : form 태그 로 전송된 데이터 매개변수로 받기
	각각 food, price, rest의 name으로 쿠키에 저장
	만료 시간은 1시간 10분 
			   
 --%>

<% request.setCharacterEncoding("utf-8"); 
 %>

<% 

String food = request.getParameter("food");
String price = request.getParameter("price");
String rest = request.getParameter("rest");
	//food, price, rest의 파라미터 값 받아와서 food, price, rest의 이름으로 저장.


Cookie[] cooks = request.getCookies();
	for(Cookie cook : cooks){
		if(cook.getName().equals("food")) food = cook.getValue()+"-"+food;
		if(cook.getName().equals("price")) price = cook.getValue()+"-"+price;
		if(cook.getName().equals("rest")) rest = cook.getValue()+"-"+rest;
		//기존 쿠키가 존재할 경우 가져와서 새로 입력한 값과 합치기		
		//그러니까 쿠키가 기존에 존재할 경우 별도로 새 값을 만드는 건 아님.
	}
	

Cookie food_cook = new Cookie("food", food);
Cookie price_cook = new Cookie("price", price);
Cookie rest_cook = new Cookie("rest", rest);
	//food, price, rest에 대한 쿠키 클래스 생성
	
food_cook.setMaxAge(4200);
price_cook.setMaxAge(4200);
rest_cook.setMaxAge(4200);
	//3개의 쿠키 클래스의 제한 시간을 설정
	
response.addCookie(food_cook);
response.addCookie(price_cook);
response.addCookie(rest_cook);
	//3개의 쿠키 클래스로 받아온 값을 서버에 전달.

response.sendRedirect("cook_read.jsp");
	//강제로 입력 페이지로 이동해 다시 입력할 수 있도록 설정 
	
	
//Cookie ck = new Cookie("name", "이순신");
	//쿠키는 클라이언트에 표시가 되고 서버에 저장 된다.
	//클라이언트에게 어떻게 보내는가?
//ck.setMaxAge(3600);
	//쿠키 시간 설정 : 초 단위로 설정됨
	//기준은 그리니치 천문대 시간 기준임
			
//response.addCookie(ck);
	//생성된 쿠키를 클라이언트에 전송
	//개발자 도구 > 어플리케이션 > 쿠키에서 전송 확인이 가능

//Cookie[] cooks = request.getCookies();
	//클라이언트에서 쿠키 가져오기
//	for(Cookie c : cooks){
//		if(c.getName().equals("name")){
//			c.setMaxAge(0);
//			response.addCookie(c);
			//쿠키 만료 시간을 0으로 변경해 클라이언트에 전송
			//자바는 직접 삭제를 할 수 없어서 이 방법으로 우회
//			break;
//		}
//	}
	//쿠키 삭제하는 방법 : 웹브라우저에서 사용자가 직접 삭제
	
	




%>
  
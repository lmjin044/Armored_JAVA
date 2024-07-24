<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method ="post" action ="cook.jsp">
		<input type = "text" name = "food" placeholder="점심메뉴"><br>
		<input type = "text" name = "price" placeholder="가격"><br>
		<input type = "text" name = "rest" placeholder="식당명"><br>
		
		<button>등록</button>

		<hr>
		
		<h3> 점심 메뉴 </h3>
		<ol>
		<%
		Cookie[] cooks = request.getCookies();
		String food="", price="", rest="";
		for(Cookie cook : cooks){
			if(cook.getName().equals("food")) food=cook.getValue();
			if(cook.getName().equals("price")) price=cook.getValue();
			if(cook.getName().equals("rest")) rest=cook.getValue();
		}
		//각자 클라이언트 쿠키 중 food, price, rest의 value 값 가져오기.
		
		String[] foodList = food.split("-");
		String[] priceList = price.split("-");
		String[] restList = rest.split("-");
			//현재 쿠키로 저장된 데이터는 배열로 저장 되어있으며, -를 기준으로 데이터를 분리
		
			for(int i=0; i<foodList.length; i++){
				//이러면 한 번만 시행
				
		%>
			<li><b><%=foodList[i] %>, <%=priceList[i] %>, <%=restList[i] %> </b> <button class ="selBt">선택</button> </li>
		<%
			}
		%>
		
		
		</ol>
	
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
    String name = request.getParameter("stuName");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int mat = Integer.parseInt(request.getParameter("mat"));
	int sci = Integer.parseInt(request.getParameter("sci"));
//   	String korStr = request.getParameter("kor");
//   	String matStr = request.getParameter("mat");
//   	String sciStr = request.getParameter("sci");
	String print = "이름 : " + name;
	
  	int total = kor+mat+sci;
  	int avr = total/3;
  	
  	if(avr>=90){
  		print+=" 참 잘했어요";

  	}else if(avr>=80){
  		print+=" 잘했어요";

  	}else if(avr>=70){
  		print+=" 노력하세요";

  	}else{
  		print +=" NAGA";

  	}
  	
  	
//    try{
  //  	int kor = Integer.parseInt(korStr);
    //	int mat = Integer.parseInt(matStr);
    // int sci = Integer.parseInt(sciStr);
    	
   // 	double avr = (kor+mat+sci)/3;
   // 	response.getWriter().println(name);
   //    	response.getWriter().println("국어점수 : "+kor); 
  //		response.getWriter().println("수학점수 : "+mat); 
 //		response.getWriter().println("과학점수 : "+sci); 
//		response.getWriter().println("평균 : "+avr);
		
	//	if(avr>=90){
	//		response.getWriter().println("참 잘했어요");
	//	}else if(avr>=80){
	//		response.getWriter().println("잘했어요");
	//	}else if(avr>=70){
	//		response.getWriter().println("노력하세요");
	//	}else{
	//		response.getWriter().println("NAGA");
	//	}
    //	
//    }catch(Exception e){
 //   	response.getWriter().println("잘못 입력되었으니까 다시 하십쇼");
 //   }
 %>
 
 <%=print %>
 <%@include file = "requestTest2.jsp" %>
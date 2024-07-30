package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String detail = "신규회원 가입 10명 남았습니다.";
		
		//forward :  서블릿 클래스에 의해 생성된 데이터를 사용자가 보는 페이지에 출력
		//sendRedirect : 사용자가 보는 페이지에 html내용만 필요하거나 보여줄 데이터가 없는 경우
		request.setAttribute("message", detail);
		RequestDispatcher rds = request.getRequestDispatcher("signin.jsp");
		rds.forward(request, response);
	}                              

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		if(id.equals("gold")&&pw.equals("1234")) {
			//아이디가 gold, 비밀번호가 1234일경우만 로그인 성공
			//response.sendRedirect("/");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);


		}else {
			//로그인 실패 경우
			request.setAttribute("fail", "아이디 또는 비밀번호가 잘못 되었습니다.");
			RequestDispatcher rsd=request.getRequestDispatcher("main.jsp");
			rsd.forward(request, response);
		}
	}

}

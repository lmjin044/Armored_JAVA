package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
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
		doMethod(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod(request, response);
	}

	protected void doMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//요청시 입력 값에 대한 인코딩
		String uri = request.getRequestURI();
		//uri = http://localhost/signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		String view = "/";	//사용자가 보는 뷰페이지
		
		if(cmd.equals("signUp.do")) {
			MemberJoin save = new MemberJoin();
			save.join(request, response);
			view="member/signUp.html";
		}else if(cmd.equals("signIn.do")) {
			view="member/signIn.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
			//만약 signUp에 해당되는 글자를 클릭했다면 회원가입으로 들어가서 
			//signUp.html이 보이도록 하기.
			//signIn에 해당되는 글자를 눌렀으면 로그인으로 이동해서 
			//signIn.jsp가 보이게 하기.
	}
	
	
	
	
	
	
}

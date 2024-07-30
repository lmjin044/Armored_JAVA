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
		request.setCharacterEncoding("utf-8");//��û�� �Է� ���� ���� ���ڵ�
		String uri = request.getRequestURI();
		//uri = http://localhost/signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		String view = "/";	//����ڰ� ���� ��������
		
		if(cmd.equals("signUp.do")) {
			MemberJoin save = new MemberJoin();
			save.join(request, response);
			view="member/signUp.html";
		}else if(cmd.equals("signIn.do")) {
			view="member/signIn.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
			//���� signUp�� �ش�Ǵ� ���ڸ� Ŭ���ߴٸ� ȸ���������� ���� 
			//signUp.html�� ���̵��� �ϱ�.
			//signIn�� �ش�Ǵ� ���ڸ� �������� �α������� �̵��ؼ� 
			//signIn.jsp�� ���̰� �ϱ�.
	}
	
	
	
	
	
	
}

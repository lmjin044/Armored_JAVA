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
		
		String detail = "�ű�ȸ�� ���� 10�� ���ҽ��ϴ�.";
		
		//forward :  ���� Ŭ������ ���� ������ �����͸� ����ڰ� ���� �������� ���
		//sendRedirect : ����ڰ� ���� �������� html���븸 �ʿ��ϰų� ������ �����Ͱ� ���� ���
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
			//���̵� gold, ��й�ȣ�� 1234�ϰ�츸 �α��� ����
			//response.sendRedirect("/");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);


		}else {
			//�α��� ���� ���
			request.setAttribute("fail", "���̵� �Ǵ� ��й�ȣ�� �߸� �Ǿ����ϴ�.");
			RequestDispatcher rsd=request.getRequestDispatcher("main.jsp");
			rsd.forward(request, response);
		}
	}

}

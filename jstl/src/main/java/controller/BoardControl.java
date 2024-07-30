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
 * Servlet implementation class BoardControl
 */
@WebServlet("/board")
public class BoardControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardControl() {
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
		//�Խñ� ���� Ŭ���� ��û ����� get�̹Ƿ� ���⼭ �ۼ��ؾ� �Ѵ�.
		RequestDispatcher rd= request.getRequestDispatcher("boardView.jsp");
		rd.forward(request, response);

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ۼ� Ŭ���� Ŭ���̾�Ʈ�� ��û����� post�̹Ƿ� ���⼭ �����ؾ� ��.
		
		RequestDispatcher rp = request.getRequestDispatcher("boardWrite.jsp");
		rp.forward(request, response);
	
	}

}

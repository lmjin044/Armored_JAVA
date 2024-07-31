package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String, MainActive> map = new HashMap<>();
       
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
		ResourceBundle rb = ResourceBundle.getBundle("class_bundle/mainProp");
		Enumeration key = rb.getKeys();
		while(key.hasMoreElements()) {
			String k=(String)key.nextElement();	//signup.do, signin.do��
			String value = rb.getString(k);//service.MemberJoin
			
			try {
				Class<?> hcl= Class.forName(value);
				MainActive his = (MainActive)hcl.newInstance();	//��ü����
				map.put(k, his);
			}catch(Exception e) {
				System.out.println("mainProp ���� Map ��ȯ ����");
			}
		}
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
		
		MainActive target=map.get(cmd);	//��û �ּҿ� �´� Ŭ���� ��ü ��������
		view = target.action(request, response);
		
		
//		
//		if(cmd.equals("signUp.do")) {	//ȸ������ ��� ������ �̵�
//			if(request.getMethod().equals("POST") ) {//.getMethod = ����� ��û ��� 
//				MemberJoin save = new MemberJoin();
//				save.join(request, response);
//			}else {
//				view="member/signUp.html";
//			}
//		}else if(cmd.equals("signIn.do")) {
//			view="member/signIn.jsp";
//		}
//		�� ������� �ϸ� �޴��� �þ ���� else if�� �þ. >> map ������� �ϴ°� �� ȿ������.
		
		
		
		if(view!=null) {
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
			//���� signUp�� �ش�Ǵ� ���ڸ� Ŭ���ߴٸ� ȸ���������� ���� 
			//signUp.html�� ���̵��� �ϱ�.
			//signIn�� �ش�Ǵ� ���ڸ� �������� �α������� �̵��ؼ� 
			//signIn.jsp�� ���̰� �ϱ�.
	}
	
	
	
	
	
	
}

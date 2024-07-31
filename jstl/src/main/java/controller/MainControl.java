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
			String k=(String)key.nextElement();	//signup.do, signin.do등
			String value = rb.getString(k);//service.MemberJoin
			
			try {
				Class<?> hcl= Class.forName(value);
				MainActive his = (MainActive)hcl.newInstance();	//객체생성
				map.put(k, his);
			}catch(Exception e) {
				System.out.println("mainProp 파일 Map 변환 실패");
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
		request.setCharacterEncoding("utf-8");//요청시 입력 값에 대한 인코딩
		String uri = request.getRequestURI();
		//uri = http://localhost/signUp.do
		String cmd = uri.substring(uri.lastIndexOf("/")+1);
		String view = "/";	//사용자가 보는 뷰페이지
		
		MainActive target=map.get(cmd);	//요청 주소에 맞는 클래스 객체 가져오기
		view = target.action(request, response);
		
		
//		
//		if(cmd.equals("signUp.do")) {	//회원가입 양식 페이지 이동
//			if(request.getMethod().equals("POST") ) {//.getMethod = 사용자 요청 방식 
//				MemberJoin save = new MemberJoin();
//				save.join(request, response);
//			}else {
//				view="member/signUp.html";
//			}
//		}else if(cmd.equals("signIn.do")) {
//			view="member/signIn.jsp";
//		}
//		이 방식으로 하면 메뉴가 늘어날 수록 else if가 늘어남. >> map 방식으로 하는게 더 효율적임.
		
		
		
		if(view!=null) {
			RequestDispatcher rd = request.getRequestDispatcher(view);
			rd.forward(request, response);
		}
			//만약 signUp에 해당되는 글자를 클릭했다면 회원가입으로 들어가서 
			//signUp.html이 보이도록 하기.
			//signIn에 해당되는 글자를 눌렀으면 로그인으로 이동해서 
			//signIn.jsp가 보이게 하기.
	}
	
	
	
	
	
	
}

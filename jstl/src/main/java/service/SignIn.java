package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class SignIn implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response){
		if(request.getSession().getAttribute("user")!=null) {
			request.getSession().removeAttribute("user");
			//여기에 해당되면 로그인 상태인 것으로, 로그인 상태일 때 user세션을 삭제하겠다.
		}else {//아니니까 로그인 상태로 하겠다.
			String id = request.getParameter("userId");
			String pw = request.getParameter("userPassword");
		
			MemberDAO dao=new MemberDAO();
			boolean isSuccess = dao.login(id,pw);
			if(isSuccess) {
				request.getSession().setAttribute("user", id);
			}
		}
		
		try {
			response.sendRedirect("/");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(" ");
		}

		return null;
	}



}


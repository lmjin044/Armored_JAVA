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
			//���⿡ �ش�Ǹ� �α��� ������ ������, �α��� ������ �� user������ �����ϰڴ�.
		}else {//�ƴϴϱ� �α��� ���·� �ϰڴ�.
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


package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class SignUpPage implements MainActive {
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response){
		//아이디 중복 가입 방지 : 현재 회원 가입 완료 된 아이디를 회원가입 페이지로 보내기
		MemberDAO dao = new MemberDAO();
		List<String> ids = dao.findAllUserId();
		
		request.setAttribute("idList", ids);
		
		return "member/signUp.jsp";
	}

}

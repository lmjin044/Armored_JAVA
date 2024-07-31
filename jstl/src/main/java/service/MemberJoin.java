package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoin implements MainActive {
	public String action(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPassword");
		String email = req.getParameter("userEmail");
		String name = req.getParameter("userName");
		//회원가입 처리하는 곳 : 사용자 입력한 값을 데이터베이스에 저장
		//request를 req라는 이름의 매개변수로 지정해서 req로 지정.
		
		MemberDTO dto = new MemberDTO(id, pw, email, name); 
		//데이터베이스 저장은 DAO 패키지에서 해결한다.
		
		MemberDAO dao = new MemberDAO();
		dao.save(dto);
		
		try {
			res.sendRedirect("/");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}

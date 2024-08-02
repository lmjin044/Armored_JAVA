package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.CommentDAO;

public class CommentDelete implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		int bid = Integer.parseInt(request.getParameter("id"));
		CommentDAO cdao = new CommentDAO();
		cdao.delete(bid);
		
		try {
			response.sendRedirect("/board.do");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}

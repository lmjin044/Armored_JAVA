package service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;

public class DeleteService implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		int bid=Integer.parseInt(request.getParameter("id"));
		BoardDAO dao = new BoardDAO();
		dao.delete(bid);
				
		try {
			response.sendRedirect("/board.do");
		}catch(IOException  e) {
			e.printStackTrace();

		}
		
		return null;
	}

}

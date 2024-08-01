package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardView implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		return "board/view.jsp";
	}

}

package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DAO.CommentDAO;
import DTO.BoardDTO;
import DTO.CommentDTO;

public class BoardView implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		
		int bid = Integer.parseInt(request.getParameter("id"));
		BoardDAO dao = new BoardDAO();
		BoardDTO dto = dao.findById(bid);
			//�Խñ� �� ���� ��������
		
		CommentDAO cdao = new CommentDAO();
		List<CommentDTO> clist = cdao.findByBoardId(bid);
		
		
		
		
		
		
			//�ش� �Խñ��� ����� ���� ��������
		request.setAttribute("board", dto);
		request.setAttribute("comment", clist);

		return "board/view.jsp";
	}

}

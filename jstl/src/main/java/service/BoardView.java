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
			//게시글 상세 내용 가져오기
		
		CommentDAO cdao = new CommentDAO();
		List<CommentDTO> clist = cdao.findByBoardId(bid);
		
		
		
		
		
		
			//해당 게시글의 댓글을 전부 가져오기
		request.setAttribute("board", dto);
		request.setAttribute("comment", clist);

		return "board/view.jsp";
	}

}

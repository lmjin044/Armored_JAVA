package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class UpdateService implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
	//게시글 수정 = 상세페이지 + 새 게시글의 작성
	//변경한 내용으로 저장한 파라미터 값(update)를 반영하는 if문 작성
		if(request.getParameter("method") !=null) {
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			int bid = Integer.parseInt(request.getParameter("boardId"));
			
			BoardDTO dto = new BoardDTO(bid, title, null, content, 0);
			//수정했기 때문에 작성자는 어차피 동일해서 상관 없음.
			//DTO자체가 작성자도 같이 반영되도록 되어있어서 null값으로 대체
			BoardDAO dao = new BoardDAO();
			dao.update(dto);
			
			
			try { response.sendRedirect("/boardView.do?id="+bid); }catch(Exception e) {}
			return null;
		}else {
			int bid = Integer.parseInt(request.getParameter("id"));
			BoardDAO dao = new BoardDAO();
			BoardDTO dto = dao.findById(bid);
			
			request.setAttribute("board", dto);
			
			return "board/update.jsp";
		}
		
	}

}

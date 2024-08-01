package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{
	@Override
	public String action(HttpServletRequest request, HttpServletResponse response){
		BoardDAO dao = new BoardDAO();
		String keyWord = request.getParameter("word");
		if(keyWord == null) keyWord="";

		int pageNum =1;//현재 페이지 번호
		if(request.getParameter("page") != null) {
			//만약 페이지 번호가 2번 이상인 것을 클릭했다면
			pageNum=Integer.parseInt(request.getParameter("page"));
			//
		}
		int total = dao.totalCount(keyWord);
		int skip = 5;	//페이징 번호 지정
		int pagePost = 10; //한 페이지에 보여줄 게시글 수 지정
		int pageTotalNum = total/pagePost;	
			//총 몇 페이지를 만들 것인지 지정(총 게시글 수/한 페이지의 게시글 수)
		if(total%pagePost !=0) pageTotalNum++;
			//만약 총 페이지와 한 페이지의 게시글의 값을 나눴을 때 0이 아니라면
			//pageTotalNum의 변수 값을 추가할 것
		int startPage = 1;
			//현재 보여지는 시작 페이지 번호 지정
		int endPage = pageTotalNum>skip ? skip:pageTotalNum;
			//현재 보여지는 끝 페이지의 값 지정
		if(pageTotalNum>skip && pageNum>=(skip/2+1) ) { //페이지 번호의 위치를 이동시키면서 현재 페이지번호를 가운데 출력
			startPage = pageNum-2;
			endPage = pageTotalNum>pageNum+2 ? pageNum+2 : pageTotalNum;
		}
		//게시글 페이지 만들기
		
		


		//dbeaver 기준 select * from board where title like " ";
		//로 데이버베이스 내 검색이 가능함. board 테이블의 title 컬럼에서 " "안에 있는 걸 찾겠다는 의미임
		//이때 ""안에 특정 키워드가 들어있는 걸 검색할 때는 "A%" "%A%" "%A" 방식이 있음
		//A로 시작하는거, A가 가운데 들어간거, 맨 끝에 A로 끝나는거 라는 뜻.
		//그러므로 본문 내용에서도 찾고 싶다면 아래와 같이 써야 함.
		//select * from board where title like "검색키워드" && content like "검색키워드";
		//그리고 내림차순으로 정렬하고 싶다면 뒤에 order by 내림차순으로 할 기준 컬럼명 desc를 붙이고
		//검색결과를 제한적으로 표시하고 싶다면 그 뒤에 또 limit ?, 10;을 붙이면 된다.
		int start=(pageNum-1)*10;
		List<BoardDTO> list = dao.findAll(start, keyWord);
		//게시글 목록 가져오기
		
		
		
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("skip", skip);
		request.setAttribute("pageTotalNum", pageTotalNum);
		
		
		request.setAttribute("list", list);
		
		return "board/board.jsp";
	}
}

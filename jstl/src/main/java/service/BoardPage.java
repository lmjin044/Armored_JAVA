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

		int pageNum =1;//���� ������ ��ȣ
		if(request.getParameter("page") != null) {
			//���� ������ ��ȣ�� 2�� �̻��� ���� Ŭ���ߴٸ�
			pageNum=Integer.parseInt(request.getParameter("page"));
			//
		}
		int total = dao.totalCount(keyWord);
		int skip = 5;	//����¡ ��ȣ ����
		int pagePost = 10; //�� �������� ������ �Խñ� �� ����
		int pageTotalNum = total/pagePost;	
			//�� �� �������� ���� ������ ����(�� �Խñ� ��/�� �������� �Խñ� ��)
		if(total%pagePost !=0) pageTotalNum++;
			//���� �� �������� �� �������� �Խñ��� ���� ������ �� 0�� �ƴ϶��
			//pageTotalNum�� ���� ���� �߰��� ��
		int startPage = 1;
			//���� �������� ���� ������ ��ȣ ����
		int endPage = pageTotalNum>skip ? skip:pageTotalNum;
			//���� �������� �� �������� �� ����
		if(pageTotalNum>skip && pageNum>=(skip/2+1) ) { //������ ��ȣ�� ��ġ�� �̵���Ű�鼭 ���� ��������ȣ�� ��� ���
			startPage = pageNum-2;
			endPage = pageTotalNum>pageNum+2 ? pageNum+2 : pageTotalNum;
		}
		//�Խñ� ������ �����
		
		


		//dbeaver ���� select * from board where title like " ";
		//�� ���̹����̽� �� �˻��� ������. board ���̺��� title �÷����� " "�ȿ� �ִ� �� ã�ڴٴ� �ǹ���
		//�̶� ""�ȿ� Ư�� Ű���尡 ����ִ� �� �˻��� ���� "A%" "%A%" "%A" ����� ����
		//A�� �����ϴ°�, A�� ��� ����, �� ���� A�� �����°� ��� ��.
		//�׷��Ƿ� ���� ���뿡���� ã�� �ʹٸ� �Ʒ��� ���� ��� ��.
		//select * from board where title like "�˻�Ű����" && content like "�˻�Ű����";
		//�׸��� ������������ �����ϰ� �ʹٸ� �ڿ� order by ������������ �� ���� �÷��� desc�� ���̰�
		//�˻������ ���������� ǥ���ϰ� �ʹٸ� �� �ڿ� �� limit ?, 10;�� ���̸� �ȴ�.
		int start=(pageNum-1)*10;
		List<BoardDTO> list = dao.findAll(start, keyWord);
		//�Խñ� ��� ��������
		
		
		
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("skip", skip);
		request.setAttribute("pageTotalNum", pageTotalNum);
		
		
		request.setAttribute("list", list);
		
		return "board/board.jsp";
	}
}

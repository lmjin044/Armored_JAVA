package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberJoin {
	public void join(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("userId");
		String pw = req.getParameter("userPassword");
		String email = req.getParameter("userEmail");
		String name = req.getParameter("userName");
		//ȸ������ ó���ϴ� �� : ����� �Է��� ���� �����ͺ��̽��� ����
		//request�� req��� �̸��� �Ű������� �����ؼ� req�� ����.
		
		
		//�����ͺ��̽� ������ DAO ��Ű������ �ذ��Ѵ�.
	}
}

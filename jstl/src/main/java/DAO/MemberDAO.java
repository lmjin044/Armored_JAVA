package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.MemberDTO;

public class MemberDAO extends DBconnect{
//ȸ������ DB �۾��ϴ� Ŭ����
//����̹��� ������ DBĿ��Ʈ Ŭ������ �̿��� ���� �����ͺ��̽��� �����ϴ� ���
public boolean login(String id, String pw) {
	String sql="select * from member where user_id=? and user_password=?";
		//���� ������ and or not �̷��� �� ����� ���°Ŵ�
		//member Ŭ�������� user id�� user password�� ��ġ�ϴ°�?
		//�ƹ��͵� ������ ������ ��ġ���� �ʴ´ٴ� �ǹ���
		//�̷��� �ϸ� ���� jsp_study > study > signCheck�� �ִ� String sql������ �� �Ʒ����� �̾����� �� ��� ��ü��
	
	try {
		pt=conn.prepareStatement(sql);
		pt.setString(1, id);
		pt.setString(2, pw);
		rs=pt.executeQuery();
			//����ڰ� �Է��� �α��� ������ �����ϸ� ���� ����
			//��ġ���� ������ �ƹ��͵� �� ����
		if(rs.next() ) {
			//�پ��� ��� ���� �����ؾ� �ϴ� while���� �޸� �ִ��� �����ĸ�
			return true;
		}
	}catch(SQLException e) {
		System.out.println("ȸ�� �α��� ��ȸ �� ����");
	}
	return false;
	
}	
	public void save(MemberDTO member) {
		//ȸ�����Կ� �Է��� ������ member ���̺� ������ ������
		//MemberDTO Ŭ����
		String sql = "insert into member(user_id, user_password, user_email, user_name) "
				+ " values(?,?,?,?)";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, member.getUserId());
			pt.setString(2, member.getUserPassword());
			pt.setString(3, member.getUserEmail());
			pt.setString(4, member.getUserName());
			pt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("ȸ������ member���̺� ���� ����");
			e.printStackTrace();
		}
	}
	public List<String> findAllUserId() {
		String sql = "select user_id from member";
			//��� ���̺� �ִ� user_id �÷��� �����´�.
		List<String> list = new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			rs=pt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString("user_id"));
			}
		}catch(SQLException e) {
			System.out.println("��ü ���̵� ��ȸ ����");
			e.printStackTrace();
		}
		return null;
	}
}

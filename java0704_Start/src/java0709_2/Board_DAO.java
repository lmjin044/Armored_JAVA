package java0709_2;
//���� �� Ŭ������ ��쿡�� DBeaver�� ��Ŭ�������� �����ϴ� ������ ����.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Board_DAO {
//DAO Ŭ������ �Ʒ� 4������ �ϴ� �⺻���� ����� ��������. ���� �� �Ǹ� ���� �ܿ���.
	
	private Connection conn;
	//DB�� ���� ���� ���� : sql��ɾ�(������)�� �����ϰ� ���� �� �ְ� ����.
	private Statement st;
	//conn���� ������ sql ��ɾ �����ϰ� �޴� �������� ����(���� / ���Ȼ� ���)
	//�޸� ���ϸ� ���Ȼ� �״� �������� ������ �̰� �ᵵ ����̳���
	private PreparedStatement pt;
	//st�� ������ �����̳� ���ķ� ó����(���� �������)
	private ResultSet rs;
	//�������� ��ȸ �� ����� �����ϴ� ����.
	
	public Board_DAO(){
		DriverLoad();	//DB����̹� �ε� �޼���
		Connect();		//DB���� �޼���
		//�� �޼���� ���ο����� ������ ���̹Ƿ� private �����
	}
	
	private void DriverLoad() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println("����̹� �ε� ����");
		}
	}
	
	private void Connect() {
		String username="burnout";
		String password="1234";
		String url="jdbc:mysql://localhost:3306/burnout";
		
		try {
			conn=DriverManager.getConnection(url, username,password);
		}catch(Exception e) {
			System.out.println("���� ����");
		}
	}

//test_board�� ���̺� �ִ� �����͸� ������ BoardŬ������ ��ü�� �����ϱ�
	
	public Board[] findByAll() {
		Board[] list = new Board[7];	//BoardŬ������ ��ü 7�� ����
		
		String sql ="select * from test_board";
			//sql ���ǹ�(������)����� = test_board�� �ִ� �� ��� �����ض�

		
		try {
			st=conn.createStatement();	//statement ����
			rs=st.executeQuery(sql);
			//select ���� : executeQurey�޼��� ���
			//insert, update, delete ���� : executeUpdate �޼��� ���
			int i=0;	//�迭�� �ε��� ǥ��
			while(rs.next()) {
				list[i] = new Board(rs.getInt("board_id"), rs.getString("title"),
						rs.getString("writter"), rs.getString("content"), rs.getInt("hit"));
				//���⿣ �÷������� �ۼ��� �ؾ� ��
				i++;	
			}
		}catch(Exception e) {
			System.out.println("������ �������� ����");
		}
		
		
		return list;	//�ش� ������ list��� �̸����� �����ؼ� Board �迭�� ����
	}
	
	
	
	
}


/*
�ʼ���� : Connection, Statement(or PreparedStatement), ResultSet
	�ذ� �ʼ���ҿ��� ���� ���� �ʿ�(�ٿ��� conn, st(or ps), rs�� ������ ���)
	
1. DB�� �����ϱ� ���� ����̹� �ε� : 
	= Class.forName("com.mysql.cj.jdbc.Driver");
	��MySQL ���� 5 ���� : com.mysql.cj.jdbc.Driver
	 		   5 ���� : com.mysql.jdbc.Driver
	 �ص��� ������ ������ ���� �� �־� ����ó���� �ʿ� : try~catch
	 	= ����̹� �ε尡 ���� �ʾ��� �� catch�� ������ ������ ����
	 	= ���� ������ �� �ϳ��� : ����̹��� �������� �ʾƼ�.
	 
2. DB�� �����ϱ� : �ʼ���Ҵ� DB ������, ��й�ȣ, DB �ּ�
	1)���ӹ�� : conn = DriverManager.getConnection(�ּ�, ������, ���);
	2)���ӽõ� ��� : Connection�� ��������(conn)�� ����

3. �������� conn ���� (Prepared)Statement�� ��ü�� ���� �� SQL��ɾ� ����

	
*/  
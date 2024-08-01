package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;

public class BoardDAO extends DBconnect{
	
	public int totalCount(String keyWord) {
		//�Խñ� �� ������ ���� �޼���
		keyWord = "%"+keyWord+"%";
		String sql="select COUNT(board_id) as cnt from board where title like ? or content like ?";
			//board�� cnt��� �ӽ� �÷��� ����� COUNT(board_id)�� ����� ������
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			rs=pt.executeQuery();
			if(rs.next()) {
				return rs.getInt("cnt");
				//�� return�� rs.getInt�� ���϶��� ��ȯ��
			}
		}catch(SQLException e) {
			System.out.println("�� �Խñ� �� ��ȸ ����");
			e.printStackTrace();
		}
		return 0;	//�׷��� ���ʿ��� return���� ��� ��ȯ��
	}

	
	
	
	public List<BoardDTO> findAll(int row, String keyWord){
		keyWord = "%"+keyWord+"%";
		
		//�츮 �����ͺ��̽��� mysql�̾�... ������
		String sql = "select * from board where title like ? or content like ? order by board_id desc limit 0, 10";
		//sql�̶�� ���������� board�� board_id �������� �������� �����ϰڴ�.
		List<BoardDTO> list = new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			pt.setInt(3,row);
			rs=pt.executeQuery();
			while(rs.next() ) {
				list.add(new BoardDTO(rs.getInt("board_id"), rs.getString("title"), rs.getString("content"), rs.getString("writer"), rs.getInt("hit")));
			}
			
		}catch(SQLException e) {
			System.out.println("�Խñ� select ����");
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	public void save(BoardDTO board) {
	
		String sql = "insert into board(title, writer, content) values(?,?,?)";
		
		DBconnect db = new DBconnect();
		
		try {
			db.pt=db.conn.prepareStatement(sql);
			db.pt.setString(1, board.getTitle());
			db.pt.setString(2, board.getContent());
			db.pt.setString(3, board.getWriter());
			db.pt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("�Խñ� ���� ����");
		}
		

	}
}

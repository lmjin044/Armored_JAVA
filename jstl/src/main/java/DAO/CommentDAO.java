package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CommentDTO;

public class CommentDAO extends DBconnect {
	public void save(int bid, String comment, String writer) {
		String sql = "insert into comment(board_id, comment, writer, write_date) values(?,?,?,now())";
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.setString(2, comment);
			pt.setString(3, writer);
			pt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("��� ���� ����");
			e.printStackTrace();
		}
	
	}

	public List<CommentDTO> findByBoardId(int bid) {
		String sql = "select * from comment where board_id=? ";
		List<CommentDTO> list = new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.executeQuery();
			while(rs.next()) {
				list.add(CommentDTO.of(
						rs.getInt("comment_id"), 
						rs.getInt("board_id"), 
						rs.getString("writer"), 
						rs.getString("comment"), 
						rs.getDate("write_date").toLocalDate()
					));
				
			}
		}catch(SQLException e) {
			System.out.println("��� ��ȸ ����");
		}
		return list;
	}

	public void delete(int bid) {
		String sql = "delete from comment where board_id=?";
	
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.executeQuery();
		}catch(SQLException e) {
			System.out.println("��� ���� ����");
			e.printStackTrace();
		}
	}
}

package DAO;

import java.sql.SQLException;

import DTO.BoardDTO;
import DTO.MemberDTO;

public class BoardDAO extends DBconnect{
	
	public void save(BoardDTO board) {
		
		String title = board.getTitle();
		String content = board.getContent();
		String writer = board.getWriter();
		String sql = "insert into board(title, writer, content) values(?,?,?)";
		
		DBconnect db = new DBconnect();
		
		try {
			db.pt=db.conn.prepareStatement(sql);
			db.pt.setString(1, title);
			db.pt.setString(2, writer);
			db.pt.setString(3, content);
			db.pt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		int boardId=0;
		sql="select board_id from board order by board_id desc limit 1";
		try{
			db.pt=db.conn.prepareStatement(sql);
			db.rs=db.pt.executeQuery();
			if(db.rs.next()){
				boardId=db.rs.getInt("board_id");
			}
		}catch(SQLException e){
			
		}
	}
}

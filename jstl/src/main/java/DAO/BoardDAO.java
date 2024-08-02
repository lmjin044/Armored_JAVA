package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;

public class BoardDAO extends DBconnect{
	
	public BoardDTO findById(int bid){//게시글 상세 페이지
		String sql="select * from board where board_id=?";
			
		try {
			pt=conn.prepareStatement(sql);
			pt.setInt(1, bid);	
				//board_id 컬럼 내 데이터를 조회하기 위함
				//board_id는 int 타입이니까 setInt임.
			rs=pt.executeQuery();
			if(rs.next()) {
				return new BoardDTO(
						rs.getInt("board_id"),
						rs.getString("title"), 
						rs.getString("writer"),
						rs.getString("content"), 
						rs.getInt("hit"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("게시글 상세 데이터조회 실패");
		}
		return null;
	}
	
	public int totalCount(String keyWord) {
		//게시글 총 갯수를 구할 메서드
		keyWord = "%"+keyWord+"%";
		String sql="select COUNT(board_id) as cnt from board where title like ? or content like ?";
			//board에 cnt라는 임시 컬럼을 만들어 COUNT(board_id)의 결과를 저장함
		
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			rs=pt.executeQuery();
			if(rs.next()) {
				return rs.getInt("cnt");
				//이 return은 rs.getInt가 참일때만 반환됨
			}
		}catch(SQLException e) {
			System.out.println("총 게시글 수 조회 실패");
			e.printStackTrace();
		}
		return 0;	//그래서 이쪽에도 return값을 줘야 반환됨
	}

	
	
	
	public List<BoardDTO> findAll(int row, String keyWord){
		keyWord = "%"+keyWord+"%";
		
		//우리 데이터베이스는 mysql이야... 잊지마
		String sql = "select * from board where title like ? or content like ? order by board_id desc limit ?, 10";
		//sql이라는 변수명으로 board의 board_id 기준으로 내림차순 정렬하겠다.
		List<BoardDTO> list = new ArrayList<>();
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, keyWord);
			pt.setString(2, keyWord);
			pt.setInt(3,row);
			rs=pt.executeQuery();
			while(rs.next() ) {
				list.add(
						new BoardDTO(
								rs.getInt("board_id"), 
								rs.getString("title"), 
								rs.getString("writer"), 
								rs.getString("content"), 
								rs.getInt("hit")));
			}
			
		}catch(SQLException e) {
			System.out.println("게시글 select 실패");
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	public void save(BoardDTO board) {
	
		String sql = "insert into board(title, writer, content) values(?,?,?)";
				
		try {
			pt=conn.prepareStatement(sql);
			pt.setString(1, board.getTitle());
			pt.setString(2, board.getWriter());
			pt.setString(3, board.getContent());
			pt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			System.out.println("게시글 저장 실패");
		}
		

	}

	public void delete(int bid) {
		//게시글
		String sql = "delete from board where board_id=?";
		
		try {
			pt = conn.prepareStatement(sql);
			pt.setInt(1, bid);
			pt.executeUpdate();
		}catch(SQLException e) {
			System.out.println("게시물 삭제 실패");
			e.printStackTrace();
		}
		
	}

	public void update(BoardDTO dto) {
	    String sql = "update board set title = ?, content = ? where board_id = ?";

	    try {
	        pt = conn.prepareStatement(sql);
	        pt.setString(1, dto.getTitle());
	        pt.setString(2, dto.getContent());   // content를 올바른 위치에 설정
	        pt.setInt(3, dto.getBoard_id());

	        pt.executeUpdate();
	    } catch (SQLException e) {
	        System.out.println("게시글 수정 실패");
	        e.printStackTrace();
	    }
	}





}


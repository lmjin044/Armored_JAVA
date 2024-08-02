package DTO;

import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
@Data
//이걸로 get-set tostring까지 전부 만들어짐
//@Data 설치하면 데이터 전송에 필요한 모든 구성이 갖춰짐.
public class CommentDTO {
	private int commentId;
	private int boardId;
	private String writer;
	private String comment;
	private LocalDate writeDate;
	
	public static CommentDTO of(int cid, int bid, String writer,
			String comment, LocalDate date) {
		CommentDTO dto = new CommentDTO();
		dto.commentId=cid;
		dto.boardId=bid;
		dto.writer=writer;
		dto.comment=comment;
		dto.writeDate=date;
		
		return dto;
	}
}

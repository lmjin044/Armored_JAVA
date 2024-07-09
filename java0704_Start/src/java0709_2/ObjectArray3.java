package java0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board_DAO dao = new Board_DAO();
		Board[] list = dao.findByAll();
		
//		for(Board board:list) {
//			if(board.getTitle().contains("S")) {
//				System.out.println(board);
//			}
//			
//		}
//		
//		for(Board board:list) {
//			if(board.getHit()>=9) {
//				System.out.println(board);
//			}
//		}	
		
//		for(Board board:list) {
//			if(board.getTitle().length()>=4) {
//				System.out.println(board);
//			}
//		}
		
//		System.out.println("title이 4자 이상인 title과 writter만 출력하시오\n");
//		for(Board board:list) {
//			if(board.getTitle().length()>=4) {
//				System.out.println(board.getTitle()+", "+board.getWritter());
//			}
//				
//		}
		
//		System.out.println("contents의 길이가 5이상인 객체들만 추출, hot 배열에 저장");
//		
//		Board[] hot = new Board[list.length];
//			//1)hot이라는 배열을 추가하기.
//		
//		int i=0;
//			//2)hot 배열의 인덱스를 임의로 정의하기.
//		for(Board board:list) {
//			if(board.getContent().length()>=5) {
//				hot[i] = board;
//			}
//			//3)임의로 생성된 hot 배열 안에 조건에 맞는 데이터를 넣어주기.
//		}
//		for(Board data : hot) {
//			if(data == null) break;	//hot 배열에 아무것도 없다면
//			System.out.println(data);//그대로 출력하기.
//		}
//		
		System.out.println("writter에 '신'이 포함된 객체만 추출하시오\n");
		
		Board[] sin = new Board[list.length];
		int i=0;
	
		for(Board board:list) {
			if(board.getWritter().contains("신")) {
				sin[i]=board;	//혹은 sin[i++;]로 퉁쳐도 됨
				i++;
			}
		}
		for(Board data:sin) {
			if(data == null) break;
			System.out.println(data);
		}
		
	}

}

/*
객체가 여러개인 상황에서 조건을 걸고 그 조건에 맞는 것만 추출하기
*/
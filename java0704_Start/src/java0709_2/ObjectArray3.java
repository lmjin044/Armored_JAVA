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
		
//		System.out.println("title�� 4�� �̻��� title�� writter�� ����Ͻÿ�\n");
//		for(Board board:list) {
//			if(board.getTitle().length()>=4) {
//				System.out.println(board.getTitle()+", "+board.getWritter());
//			}
//				
//		}
		
//		System.out.println("contents�� ���̰� 5�̻��� ��ü�鸸 ����, hot �迭�� ����");
//		
//		Board[] hot = new Board[list.length];
//			//1)hot�̶�� �迭�� �߰��ϱ�.
//		
//		int i=0;
//			//2)hot �迭�� �ε����� ���Ƿ� �����ϱ�.
//		for(Board board:list) {
//			if(board.getContent().length()>=5) {
//				hot[i] = board;
//			}
//			//3)���Ƿ� ������ hot �迭 �ȿ� ���ǿ� �´� �����͸� �־��ֱ�.
//		}
//		for(Board data : hot) {
//			if(data == null) break;	//hot �迭�� �ƹ��͵� ���ٸ�
//			System.out.println(data);//�״�� ����ϱ�.
//		}
//		
		System.out.println("writter�� '��'�� ���Ե� ��ü�� �����Ͻÿ�\n");
		
		Board[] sin = new Board[list.length];
		int i=0;
	
		for(Board board:list) {
			if(board.getWritter().contains("��")) {
				sin[i]=board;	//Ȥ�� sin[i++;]�� ���ĵ� ��
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
��ü�� �������� ��Ȳ���� ������ �ɰ� �� ���ǿ� �´� �͸� �����ϱ�
*/
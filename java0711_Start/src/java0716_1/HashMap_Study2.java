package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMap_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, ImageBoard> board = new HashMap<>();
		ImageBoard temp = new ImageBoard("자바설치", "javava", "설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("MySQL 설치 방법", "설치인생", "MySQL설치.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("천장결과", "운수없는날", "백만원의결과.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("최저임금", "편의점사장", "나홀로편의점.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("MySQL 설치 방법2", "설치인생", "MySQL설치2.jpg");
		board.put(temp.getTitle(), temp);
		
		
		System.out.println(board.get("자바설치"));
		
		Scanner scan = new Scanner(System.in);
//이미지 게시판에 글 제목을 출력하고 보고 싶은 글 제목을 입력하면 글 내용을 보자
		Set<String> titles = board.keySet();
		
		System.out.println("=====이미지 게시판 목록 ======");
		titles.forEach(title -> System.out.println(title));
		
		System.out.println("글 제목을 입력해주세요 : ");
		String inputTitle = scan.nextLine();
		
		System.out.println(board.get(inputTitle));
	
	
	
	
	
	
	
	
	
	
	
	
	} 

}

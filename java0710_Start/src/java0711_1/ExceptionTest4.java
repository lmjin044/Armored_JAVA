package java0711_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(BufferedReader br=
			new BufferedReader(new FileReader("c:/test/data.txt")))
	{
		String text = br.readLine();
		System.out.println(text);
		
	}catch(Exception e){
		System.out.println("파일 열기 혹은 쓰기 실패");
	}
		
		
		//파일에 쓰기
//		BufferedWriter br =null;
//		try {
//			BufferedWriter br = new BufferedWriter(new FileWriter("c:/test1/data.txt"));
//			String name = "이순신";
//			br.write("이순신 34 군인"+name.substring(10));
//				//여기까지만 하면 메모리에 저장되는 단계에 불과하다.
//			br.close();	
//				//닫기가 되어야 쓰기가 완료된다.
//		}catch(Exception e) {
//			System.out.println("파일 쓰기 불가!");
//			try {
//				br.close();
//			}catch(IOException e1){
//				e1.printStackTrace();
//			}
//		}
	}

}

//예외처리 = 자동 자원 반환
//파일의 읽기와 쓰기 : 하기 위해선 일단 파일을 열어야지?
//파일의 열람과 사용이 끝나면 사용한 메모리(자원)를 반납해야 한다. = 닫기
//DB에 데이터 저장 혹은 가져오기 행위를 했다면 그 행위가 종료되는 시점에서 닫기가 시행되어야 한다.
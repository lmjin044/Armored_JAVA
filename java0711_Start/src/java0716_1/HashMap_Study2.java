package java0716_1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMap_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, ImageBoard> board = new HashMap<>();
		ImageBoard temp = new ImageBoard("�ڹټ�ġ", "javava", "��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("MySQL ��ġ ���", "��ġ�λ�", "MySQL��ġ.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("õ����", "������³�", "�鸸���ǰ��.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("�����ӱ�", "����������", "��Ȧ��������.jpg");
		board.put(temp.getTitle(), temp);
		temp = new ImageBoard("MySQL ��ġ ���2", "��ġ�λ�", "MySQL��ġ2.jpg");
		board.put(temp.getTitle(), temp);
		
		
		System.out.println(board.get("�ڹټ�ġ"));
		
		Scanner scan = new Scanner(System.in);
//�̹��� �Խ��ǿ� �� ������ ����ϰ� ���� ���� �� ������ �Է��ϸ� �� ������ ����
		Set<String> titles = board.keySet();
		
		System.out.println("=====�̹��� �Խ��� ��� ======");
		titles.forEach(title -> System.out.println(title));
		
		System.out.println("�� ������ �Է����ּ��� : ");
		String inputTitle = scan.nextLine();
		
		System.out.println(board.get(inputTitle));
	
	
	
	
	
	
	
	
	
	
	
	
	} 

}

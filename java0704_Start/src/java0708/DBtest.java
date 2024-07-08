package java0708;

import java.util.Scanner;

public class DBtest {

	static Scanner scan = new Scanner(System. in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Dao dao = new Dao();	//Dao ��ü�� �־�� DB�� �ڹ� ���� ������ΰ� ���õȰ���.
	Member[] list;//Member Ŭ���� Ÿ���� �迭 �ּҸ� ������ ���������� list�� ������.
	
	
	
	
	System.out.print("1. �Է� 2. ��� : ");
	int menu = scan.nextInt();
		//1���� ������ �Է�, 2���� ������ ����� �Ʒ� ����ġ �������� �����Ű�� ����.
	scan.nextLine();
		switch(menu) {
		case 1:
			System.out.println("�л� �̸� : ");
			String name = scan.nextLine();
			System.out.println("���� ���� : ");
			int kor = scan.nextInt() ;
			System.out.println("���� ���� : ");
			int eng = scan.nextInt();
			System.out.println("���� ���� : ");
			int mat = scan.nextInt();
			
			Member member = new Member(name, kor, eng, mat);
			total_avg(member);
				//���� Ű����� �Է¹��� ������ ������ �ִ� ������Ҵ� member��.
			System.out.println(member);
		//������ ���̽��� ����		
			dao.insert(member);
			break;
		
		case 2:	//������ ���� ����� ���
			list = dao.select();	
				//DB�� �����͸� Member Ŭ���� �迭�� ��������
				//member Ŭ������ �迭�� ��ȯ���� �ִ�. 
			for(Member data : list) {
				System.out.println(data);
			}
			break;
		}
		
		
	}
	
	static void total_avg(Member m){
		int total = m.getKor()+m.getEng()+m.getMat();
		m.setTotal(total);
			//������ ���� �����ϱ� ���ؼ��� set~�� ��� �Ѵ�.
		m.setStd_avg(total/3);
	}
	
}

package java0711_2;

import java.util.ArrayList;

public class ArrayListStudy1 {

	private static String temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Member> list =new ArrayList<>();
		
		list.add(new Member("�̼���",34,"19900405"));
		list.add(new Member("������", 25, "19991208"));
		list.add(new Member("�庸��", 28, "19960712"));
		list.add(new Member("�Ѽ���", 31,"19930120"));
		list.add(new Member("�豤��", 39, "19851010"));
		
		
//		System.out.println(list);
//		
//		for(Member m : list) {
//			if(m.getAge()>=30)
//				System.out.println(m);
//			
//		}
//	System.out.println("1995�� ���Ŀ� �¾ �����?");
//	
//	for(Member m :list) {
//		String temp = m.getBirth().substring(0, 4);
//		int year = Integer.parseInt(temp);
//		if(year>1995)
//			System.out.println(m);
//	}
	System.out.println("8~11���� �¾ �����?");
	for(Member m:list) {
		String a = m.getBirth().substring(4, 6);
		int month = Integer.parseInt(a);
		if((month>7)&&(month<12))
			System.out.println(m);
	}
	
	list.add(2, new Member("�念��",34,""));
	System.out.println(list);
	
	System.out.println("���� ������ ���� ����� ã�� ���̴� ������ �ϰ� 0�� 0�Ϸ� �����");
	for(Member mem:list) {
		if(mem.getBirth().isBlank()) {
			int year = 2024 - mem.getAge();
			mem.setBirth(year+"0000");
			
		}
	}
	System.out.println(list);
	
	Object obj;
	
	
	
	
	}
	
	

}

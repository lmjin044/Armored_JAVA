package java0717_2;

import java.util.ArrayList;

public class Generic_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		book.add(new Book("A1478", "�ڹٿ�������", "�赿��"));
		book.add(new Book("B1579", "�������ɹ�����", "�̼���"));
		book.add(new Book("C2486", "���������ָ��Դ�", "������"));
		dvd.add(new DVD("D2684", "�����ڰ����ִܴ�", "�ָ���"));
		dvd.add(new DVD("E3654", "�������մ�", "�۸���"));
		dvd.add(new DVD("F3578", "������Ÿ", "������"));
		
		
		//�뿩�ϱ� : '�������� �̿��� ��𾾰�' + 'å or DVD�� ���ȴ�'
		Library lib = new Library();
		lib.addRental(book.get(0), "�̼���");
		lib.addRental(dvd.get(1), "������");
		//lib.showRentalList();
		
		
		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "�̼���");
//		System.out.println(rent);
//		
//		Rental<Book> rent1 = new Rental<>(book.get(1), "������");
//		System.out.println(rent1);
//		
		
		
	}

}

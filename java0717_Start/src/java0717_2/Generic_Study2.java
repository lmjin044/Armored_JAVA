package java0717_2;

import java.util.ArrayList;

public class Generic_Study2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> book = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		book.add(new Book("A1478", "자바완전정복", "김동명"));
		book.add(new Book("B1579", "오늘점심뭐먹지", "이순간"));
		book.add(new Book("C2486", "설렁탕을왜못먹니", "박진사"));
		dvd.add(new DVD("D2684", "봄감자가맛있단다", "최마름"));
		dvd.add(new DVD("E3654", "마지막손님", "송막차"));
		dvd.add(new DVD("F3578", "라디오스타", "정형돈"));
		
		
		//대여하기 : '도서관의 이용자 모모씨가' + '책 or DVD를 빌렸다'
		Library lib = new Library();
		lib.addRental(book.get(0), "이순신");
		lib.addRental(dvd.get(1), "김춘추");
		//lib.showRentalList();
		
		
		
//		Rental<DVD> rent = new Rental<>(dvd.get(0), "이순신");
//		System.out.println(rent);
//		
//		Rental<Book> rent1 = new Rental<>(book.get(1), "김춘추");
//		System.out.println(rent1);
//		
		
		
	}

}

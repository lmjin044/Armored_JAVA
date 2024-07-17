package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	//DVD와 도서 두 종류를 한번에 대여 관리해야 함
	//제네릭 표현은 Rental 클래스에서 하고, 여기서는 와일드카드를 써서 해결하자.
	
	private List<Rental<? extends Media>>list = new ArrayList<>();
	public <T extends Media> void addRental(T item, String renter) {
		//위 클래스 표시 부분에서는 제네릭 표현을 쓰지 않음
		//클래스에 제네릭 표현을 쓰면 클래스 단위로 쓰고
		//메서드 단위에 제네릭 표현을 쓰면 메서드 안에서만 사용
		
		Rental<T> rental = new Rental<>(item, renter);
		list.add(rental);
		System.out.println("대여한 사람 : " + rental);
		
//		public void showRentalList() {
//			for(Rental<? extends Media> r : list) {
//				System.out.println(r);
//			}
		}
	}


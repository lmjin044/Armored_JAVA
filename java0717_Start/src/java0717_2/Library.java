package java0717_2;

import java.util.ArrayList;
import java.util.List;

public class Library {
	//DVD�� ���� �� ������ �ѹ��� �뿩 �����ؾ� ��
	//���׸� ǥ���� Rental Ŭ�������� �ϰ�, ���⼭�� ���ϵ�ī�带 �Ἥ �ذ�����.
	
	private List<Rental<? extends Media>>list = new ArrayList<>();
	public <T extends Media> void addRental(T item, String renter) {
		//�� Ŭ���� ǥ�� �κп����� ���׸� ǥ���� ���� ����
		//Ŭ������ ���׸� ǥ���� ���� Ŭ���� ������ ����
		//�޼��� ������ ���׸� ǥ���� ���� �޼��� �ȿ����� ���
		
		Rental<T> rental = new Rental<>(item, renter);
		list.add(rental);
		System.out.println("�뿩�� ��� : " + rental);
		
//		public void showRentalList() {
//			for(Rental<? extends Media> r : list) {
//				System.out.println(r);
//			}
		}
	}


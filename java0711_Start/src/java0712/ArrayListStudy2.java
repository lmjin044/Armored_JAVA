package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Asset> account = new ArrayList<>();
		
		account.add(new Asset("�츮����", 3450000, "1004-91-123455","�̼���" ));
		account.add(new Asset("����", 513350, "34-123-349393","������"));
		account.add(new Asset("��������", 891003, "394-3412-2323","���س�"));
		account.add(new Asset("��������", 899900, "93-2384-19939", "�ֹ���"));
		account.add(new Asset("�츮����", 28300, "1002-93-878888", "������"));
		account.add(new Asset("��������", 98000, "293-0123-1234","������"));
		account.add(new Asset("�츮����", 1920000, "1006-23-123456", "��ù�"));
		account.add(new Asset("��������", 932000, "23-2555-29991", "������"));
		
		
		
		
System.out.println("�츮������ �̿��ϴ� �������?");
	for(Asset uri : account) {
		if(uri.getBank().equals("�츮����")) {
			System.out.println(uri);
		}
	}
//	for(Asset a : account) {
//		if(a.getBank() == "�츮����") {
//			System.out.println(a);
//		}
//	}
	
System.out.println("\n�ܾ��� 100���� �̻��� �����?");
	account.forEach(hun -> {
		//forEach(������ -> );�� �ݺ����̴�!
		if(hun.getBalance()>=1000000) {
			System.out.println(hun);
		}
	});
		

//	for(Asset a:account) {
//		if(a.getBalance()>=1000000) {
//			System.out.println(a);
//		}
//	}
	
	
System.out.println("\n�ֹ����� �츮���� ���¹�ȣ��? ���ٸ� 1007-23-128954 ���¸� �����");
//�� ������ ���⼭ �ذ��ϱ� ���ٴ� ���� ������ ���� Ŭ�������� ������ �������ִ°� ����.
	Asset asset = new Asset("�츮����", 0, "1007-23-128954", "�ֹ���");
		//�ӽ÷� �߰��� �迭�� ���� ����.
	if(!account.contains(asset) ) {
		account.add(asset);
		//�� if���� not����, account�� ������ �迭�� asset�� ������ ���� 
		//���ٸ� �� �ؿ� �߰��ض�.
	}
	
	account.forEach(info -> System.out.println(info));


//	boolean check = true;
//	for(Asset a:account) {
//		if(a.getHolder() == "�ֹ���")
//			if(a.getBank() == "�츮����") {
//				check = false;}
//				a.setBank("�츮����");
//				a.setAccountNum("1007-23-128954");
//						
//		
//	}
	
	
	
	}

}

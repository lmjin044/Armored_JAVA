package java0712;

import java.util.ArrayList;

public class ArrayListStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Asset> account = new ArrayList<>();
		
		account.add(new Asset("우리은행", 3450000, "1004-91-123455","이순신" ));
		account.add(new Asset("농협", 513350, "34-123-349393","김유신"));
		account.add(new Asset("신한은행", 891003, "394-3412-2323","박팽년"));
		account.add(new Asset("국민은행", 899900, "93-2384-19939", "최무선"));
		account.add(new Asset("우리은행", 28300, "1002-93-878888", "문익점"));
		account.add(new Asset("신한은행", 98000, "293-0123-1234","이율곡"));
		account.add(new Asset("우리은행", 1920000, "1006-23-123456", "김시민"));
		account.add(new Asset("국민은행", 932000, "23-2555-29991", "이율곡"));
		
		
		
		
System.out.println("우리은행을 이용하는 사람들은?");
	for(Asset uri : account) {
		if(uri.getBank().equals("우리은행")) {
			System.out.println(uri);
		}
	}
//	for(Asset a : account) {
//		if(a.getBank() == "우리은행") {
//			System.out.println(a);
//		}
//	}
	
System.out.println("\n잔액이 100만원 이상인 사람은?");
	account.forEach(hun -> {
		//forEach(변수명 -> );도 반복문이다!
		if(hun.getBalance()>=1000000) {
			System.out.println(hun);
		}
	});
		

//	for(Asset a:account) {
//		if(a.getBalance()>=1000000) {
//			System.out.println(a);
//		}
//	}
	
	
System.out.println("\n최무선의 우리은행 계좌번호는? 없다면 1007-23-128954 계좌를 만들기");
//이 문제는 여기서 해결하기 보다는 먼저 참조할 서브 클래스에서 조건을 지정해주는게 좋음.
	Asset asset = new Asset("우리은행", 0, "1007-23-128954", "최무선");
		//임시로 추가할 배열을 만든 것임.
	if(!account.contains(asset) ) {
		account.add(asset);
		//위 if문은 not으로, account로 지정한 배열에 asset과 동일한 것이 
		//없다면 맨 밑에 추가해라.
	}
	
	account.forEach(info -> System.out.println(info));


//	boolean check = true;
//	for(Asset a:account) {
//		if(a.getHolder() == "최무선")
//			if(a.getBank() == "우리은행") {
//				check = false;}
//				a.setBank("우리은행");
//				a.setAccountNum("1007-23-128954");
//						
//		
//	}
	
	
	
	}

}

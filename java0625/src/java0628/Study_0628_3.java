package java0628;

import java.util.Arrays;
import java.util.Scanner;

public class Study_0628_3 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//과자배열에 좋아하는 과자의 판매가를 키보드로 입력하여 저장할 것
	//저장된 판매가격의 총합과 평균을 구하시오.
	/*
	int[] snack= new int[5];
	for(int i=0; i<snack.length; i++) {
		System.out.print((i+1)+"번째 과자 가격은 : ");
		snack[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i=0; i<snack.length; i++) {
		sum = sum + snack[i];
	}
	
	int ava = sum/snack.length;

	System.out.printf("과자값 총합은 %d원, 과자값 평균은 %d원 입니다.", sum, ava);
	//다음은 tall 배열에 6명의 키를 저장한 것이다.
	//키가 175미만인 경우를 출력하시오.
	float[] tall = new float[] {173.4f, 175.1f, 169.5f, 181.4f, 178.8f, 185.3f};
	
	for(int i=0; i<tall.length; i++) {
		if(tall[i]<175)
			System.out.println(tall[i]);
		//
	}
	
	//문제 : name 배열의 문자열 중, 이성계, 문익점, 정도전, 최영을 first 배열에 저장하고 출력하시오.
	String[] name = new String[] {
			"이순신", "김유신", "장보고", "이성계", "문익점", "정도전", "최영", "양만춘"};
	
	String[] first = new String[4];
	
	System.arraycopy(name, 3, first, 0, 4);
		//인덱스 3번(=4번째) 자리에 이성계가 있고
		//이성계를 시작으로 first의 0번(=1번째) 자리부터 4개의 데이터를 저장한다는 소리
	System.out.println(Arrays.toString(first));
	
	String word = "I like banana.";
	System.out.println(word.indexOf("i"));
		//indexOf = 문자열에서 특정 문자~문자열의 위치 찾기(인덱스 방식으로)
		//			대소문자를 구분하므로 같은 i더라도 대문자 I는 0, 소문자는 3이 나옴
		//			띄어쓰기도 배열에 속하기 때문에 이 점 참고 해야 함.
	
	System.out.println(word.contains("bn"));
		//contains = 문자열에서 특정 문자~문자열의 존재 유무
		//			 b와 n이 banana 안에 있지만 이건 붙어 있는 기준만 알아봄.
	
	String[] a = new String[] {"banana", "orange"};
	a[0].indexOf("na");	
	a[1].indexOf("ge");
	
	
	String[]t =new String[] {
			"김유신", "한석봉", "양만춘", "김춘추", "정도전",
			"정약용", "이순신", "이사부", "이사람", "한가인"};
	
	System.out.print("이름 검색 : ");
	String search = scan.nextLine();
	
	for(int i=0; i<t.length; i++) {
		if(t[i].contains(search)) {
			System.out.println("검색 결과 : "+t[i]);
		}
	}
	*/	
	//문제 : 음료를 검색하여 그 음료의 이름과 금액이 출력되도록 하시오. 
	
	String[] menu = new String[] {
			"아메리카노 : 2000원", "화이트 아메리카노 : 2800원", "카페라떼 : 3000원", 
			"돌체라떼 : 3800원", "카페모카 : 3800원", "수박주스 : 4000원", 
			"써머 아이스티 : 2900원", "복숭아 아이스티 : 2800원", "자두 아이스티 : 2800원",
			"유자에이드 : 3500원", "레몬에이드 : 3500원", "청포도에이드 : 3500원"
			};
	
	System.out.print("음료 검색 : ");
	String find = scan.nextLine();
	
	boolean isDrink = true;	//isDrink라는 변수가 참일 경우를 전제함. 
	for(int i=0; i<menu.length; i++) {
		if(menu[i].contains(find)) {
			System.out.println(menu[i]);
			isDrink=false;
		}
		
		
		}if(isDrink) {//참이면 존재하지 않는다는 의미
			System.out.print("죄송합니다. 준비중 입니다.");
		
		
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}

}

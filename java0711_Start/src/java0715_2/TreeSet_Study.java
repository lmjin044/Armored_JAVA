package java0715_2;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer>tree = new TreeSet<>();
		tree.add(34); tree.add(45); tree.add(20); tree.add(9);
		tree.add(40); tree.add(15); tree.add(48); tree.add(2);
		tree.add(11); tree.add(39);
		
		System.out.println(tree);
		//숫자가 작은 순서대로 출력되어 나옴.
		System.out.println("첫번째 순서의 데이터 호출 : "+tree.first());
		System.out.println("마지막 순서의 데이터 호출 : "+tree.last());
		System.out.println("입력 값보다 가장 가까운 큰 값을 호출 : "+tree.higher(20));
		System.out.println("입력 값보다 가장 가까운 작은 값을 호출 : "+tree.lower(30)); 
		System.out.println("입력 값보다 작은 모든 값을 호출 : "+tree.headSet(15));
		System.out.println("입력 값보다 큰 모든 값을 호출"+tree.tailSet(20)); 
		System.out.println("입력한 값들의 사이에 있는 값을 호출 : "+tree.subSet(15, 30));
		
		
		TreeSet<String> word = new TreeSet<>();
		word.add("이순신"); word.add("문익점"); word.add("장보고"); word.add("김유신"); word.add("정도전");
		word.add("박팽년"); word.add("성삼문"); word.add("마동석"); word.add("나훈아"); 
		
		System.out.println(word.higher("아"));
		System.out.println(word.headSet("라"));
		System.out.println(word.subSet("나", "자"));	//나부터 자까지 모두 포함하는 단어 검색
		System.out.println(word.subSet("ㄴ", "ㅈ")); //하지만 단순히 자음만으로는 안 됨.
		
		//90이상 = 상위 10%, 70이상 = 상위 30%, 40이상 = 상위 80%.
		//내 점수를 입력하여 퍼센테이지 출력하기.
		
	Scanner sc = new Scanner(System.in);
		TreeSet<Integer> rank = new TreeSet<>();
		rank.add(90); rank.add(70); rank.add(40);
		
		System.out.println("성적을 입력하세요 : ");
		int my = sc.nextInt();
		switch(rank.lower(my)+1) {
			case 90 : System.out.println("상위10%"); break;
			case 70 : System.out.println("상위30%"); break;
			case 40 : System.out.println("상위80%"); break;
		}
		
		
		
		sc.nextLine();
//		
		//문2 내 점수 입력 후 나보다 높은 사람들 출력.
		TreeSet<String> score = new TreeSet<>();
		score.add("89점 이순신"); score.add("67점 김유신"); score.add("45점 문익점");
		score.add("98점 한석봉"); score.add("72점 박문수"); score.add("81점 김춘추");
		score.add("59점 이성계"); score.add("32점 정약용");
		
		System.out.println("내 점수는 : ");
		String test = sc.nextLine();
		System.out.println("내 위로 이 사람들이 있네 : "+ score.tailSet(test));
		
	}
}

/*
TreeSet 구조 : 나무 모양으로 부모-형제-자식을 표현해 값을 저장시킴
	- 순차적으로 데이터 저장하지 않음
	- 중복 저장되지 않음
	- 이진트리 사용 = 데이터가 정렬되어 출력 됨.
		ㄴ = 각 노드가 최대 2개의 자식노드를 지니는 것

*/
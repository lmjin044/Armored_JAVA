package java0716_1;

import java.util.TreeMap;

public class TreeMap_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer, String> tree= new TreeMap<>();
		tree.put(20, "자두");
		tree.put(54, "사과");
		tree.put(9, "수박");
		tree.put(33, "참외");
		tree.put(5, "토마토");
		
		System.out.println(tree.headMap(21));
		//HashMap과 동일하게 headMap은 입력값보다 작고, tailMap은 입력값보다 큰 결과를 검색
		
		System.out.println(tree.floorKey(15));
		//입력한 키와 일치(하거나 가장 가까운) '키' 값을 찾음.
		System.out.println(tree.floorEntry(15));
		//입력한 키와 일치(하거나 가장 가까운) '전체' 값을 찾음.
		
		System.out.println(tree.subMap(10, 40));
		//입력한 두 키의 사이에 있는 값을 찾음. 
		
		System.out.println(tree.lowerKey(25));
		//입력한 키의 가장 가까운 '작은' 결과를 찾음.
		System.out.println(tree.higherKey(40));
		//입력한 키의 가장 가까운 '큰' 결과를 찾음.
	}

}

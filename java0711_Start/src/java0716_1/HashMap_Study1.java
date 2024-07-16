package java0716_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Integer> map = new HashMap<>();
			//이때 key값은 String 속성을, value값은 Integer 속성을 가짐
		
		map.put("이순신", 19900405);
		map.put("김춘추", 19990101);
		map.put("장영실", 20110718);
		map.put("이도", 20051103);
		map.put("김춘추", 20091010);	//key가 동일해서, value값만 덮어쓰기 됨
		map.put("이성계", 19990405);
		
		map.putIfAbsent("장영실", 1222);	
			//map에 동일한 key가 존재하면 저장하지 않음.
		
		System.out.println(map);
		
		System.out.println(map.get("이도"));
			//key값을 검색해 그에 따른 value값을 출력하기.
		map.replace("이성계", 19760505);
			//value값 변경
		System.out.println(map);
		
		System.out.println("key값 검색 : "+map.containsKey("김정호"));
		System.out.println("value값 검색 : "+map.containsValue("1222"));
		System.out.println("map 내에 저장된 데이터 확인, 있으면 true, 없으면 false : "+map.isEmpty());
		System.out.println("map 내에 저장된 데이터 갯수 : "+map.size());
		
		//set 혹은 collection으로 변환
		Set<String> keys = map.keySet();
			//지금은 map에 있는 key(String속성)를 Set으로 변경
			//Set으로 변경하면 반복문으로 돌릴 수 있다.
		for(String name : keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
			//list 타입으로 변경하는 방식
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);
			//배열로 변경하는 방식.
		
		map.forEach((k,v) -> System.out.println(k+" "+v));
			//만약 각각 출력하고 싶을 때는 이렇게.
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
 HashMap : 
 	- 순차적으로 저장되지 않음.
 	- key : value
 		※key는 중복허용하지 않음.
 		※value는 중복을 허용함.
 	>> 뭔 소리인지? : {name :'이순신', id:'이순신'} 일때 
 				   name은 key로, id는 value로 설정됨. 	
 	-색인 검색에 특화됨.
 	-메모리 공간을 많이 소비함.
 
 */
 
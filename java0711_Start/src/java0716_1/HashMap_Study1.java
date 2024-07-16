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
			//�̶� key���� String �Ӽ���, value���� Integer �Ӽ��� ����
		
		map.put("�̼���", 19900405);
		map.put("������", 19990101);
		map.put("�念��", 20110718);
		map.put("�̵�", 20051103);
		map.put("������", 20091010);	//key�� �����ؼ�, value���� ����� ��
		map.put("�̼���", 19990405);
		
		map.putIfAbsent("�念��", 1222);	
			//map�� ������ key�� �����ϸ� �������� ����.
		
		System.out.println(map);
		
		System.out.println(map.get("�̵�"));
			//key���� �˻��� �׿� ���� value���� ����ϱ�.
		map.replace("�̼���", 19760505);
			//value�� ����
		System.out.println(map);
		
		System.out.println("key�� �˻� : "+map.containsKey("����ȣ"));
		System.out.println("value�� �˻� : "+map.containsValue("1222"));
		System.out.println("map ���� ����� ������ Ȯ��, ������ true, ������ false : "+map.isEmpty());
		System.out.println("map ���� ����� ������ ���� : "+map.size());
		
		//set Ȥ�� collection���� ��ȯ
		Set<String> keys = map.keySet();
			//������ map�� �ִ� key(String�Ӽ�)�� Set���� ����
			//Set���� �����ϸ� �ݺ������� ���� �� �ִ�.
		for(String name : keys) {
			System.out.println(map.get(name));
		}
		
		List<Integer> birth = new ArrayList<>(map.values());
		System.out.println(birth);
			//list Ÿ������ �����ϴ� ���
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		System.out.println(entry);
			//�迭�� �����ϴ� ���.
		
		map.forEach((k,v) -> System.out.println(k+" "+v));
			//���� ���� ����ϰ� ���� ���� �̷���.
		
		
		
		
		
		
		
		
		
		
		
	}

}

/*
 HashMap : 
 	- ���������� ������� ����.
 	- key : value
 		��key�� �ߺ�������� ����.
 		��value�� �ߺ��� �����.
 	>> �� �Ҹ�����? : {name :'�̼���', id:'�̼���'} �϶� 
 				   name�� key��, id�� value�� ������. 	
 	-���� �˻��� Ưȭ��.
 	-�޸� ������ ���� �Һ���.
 
 */
 
package Modifier;

public class modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		book book = new book();
		book.setTitle("JAVA �Ӽ�");
		book.setAuthor("������");
		book.setPage(786);
		
		System.out.println(book.getTitle());
		
		book book2 = new book("JAVA, ��, ������", "�̺���", 564);
		System.out.println(book2);
		
	}

}

/*
 Ŭ�������� ���� ��� : 
 	-����, �޼���
 	-�ν��Ͻ�, Ŭ����
 	-������ �޼���
 	-�ν��Ͻ� ����, Ŭ���� ������ �ʱ�ȭ
 	-�����ε�
 	-�������̵�
 	-���
 	-������
 	-������
 	-�߻�ȭ
 	-�������̽�
 	-����Ŭ����(�͸�, ����)
 	-������
 	<<�̰� �� ���� ����Ʈ �������� ���� �� �����̴�.
 	
 	
 �÷��ǿ��� ���� ��� : 
 	-�ڷᱸ���� �˰���
 	-Collection, List, Map, Set
 	-ArrayList, Vector, LinkedList
 	-Queue, Stack, Vector, TreeSet
 	-HashMap, TreeMap.....
 
 Ư�� �÷����� ������ �� ������ �� ����� �ڹٰ����� �� �� ���� �� �Ѵ�.
 
 �׿ܿ���... ���ʸ�, �������̼�, ��Ʈ��, �����嵵 ����� ��.
 >>��������� �ڹ� (��ü�������μ���) �⺻ ������ ��
 >>�� �������� JSP : 
 	���尴ü, �����������ӿ�ũ(��������Ʈ), MVC ����(���θ�����Ʈ �����)
 	�̰ű��� �ϸ� ù��° �� -�� ������Ʈ 
 
  
  
  
  
  
 */
 
package java0717_4;

import java.sql.Date;
import java.util.ArrayList;

class A<T>{
	T item;
	void get(T... add) {
		//���⼭ ... �� ���������� : �޼����� �Ű������� ����ó���� �� �����.
		//��Ȳ�� ���� �����Ӱ� �迭 ũ�⸦ ��ȭ��ų �� ����ϴ� �뵵
		//�ٵ� �� ���? : ���ʸ��� �����迭�� ����� ������ �������� �ʾƼ� �׷���.
	}
}


public class MainClass {
	@Deprecated
	static void aaa() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aaa();
		@SuppressWarnings("all")
		ArrayList list = new ArrayList();
		Date today = new Date();
		today.getDate();
		
	}

}
/*
�ּ� = �����ڸ� ���� �޸�
@(annotation) �� �ּ� 
		      = ��ǻ�Ϳ��� ������ �ּ���
		      = Ư�� �ڵ�鿡 ���� ������ ��ǻ�Ϳ��� ����
	�ظ�Ÿ������ ���� ����.
1.ǥ��
	1) @Override: �޼��� �������̵�(= "�̰� ����������")
	2) @Deprecated : 'Ķ����'�� ���� Ư�� �޼��带 
					 ������ �� ����� ���̶�� ����.
			ex)get.Year();
	3) @SuppressWarnings("") : ""�� ���뿡 ���� ������ ������ ������
		all = ��� ���
		deprecation = ������� �ʴ� ��� ���
		null = null ���� ���
		unchecked = ��Ȯ�� ���۷��̼� ���
		unused = ������� �ʰų� ���ʿ��� �ڵ� ���� ���
	4) @FunctionalInterface : �Լ��� �������̽����� �˸���.
		 �Լ��� �������̽�? �߻� �޼��带 '�ϳ���' ������ �ִ� ��츦 ����
		 ex)interface moveable{
		 		public void move();
		 	}
		 	�� �䷱ ���.
	5) @SafeVaragrs : ����ƽ�� ���� ���������� �Ű����� ��� �� ��� ����
		'��������?' : �� ����ƽ ����Ѱ� ����
		
2.��Ÿ
	1) @Target : �������̼� ������ �� ����� ��� ������
	2) @Documented : javadoc�� ����ȭ��Ų ������ ����
	3) @Inherited : ����Ŭ������ ��ӵǵ��� �� �� ������(target�� ���� ���)
	4) @Retention : �������̼� �Ⱓ(��� ���������� ����ǰԲ�)�� ������
	5) @Repeatable : �������̼� �ݺ� �ֱ⸦ ������
*/
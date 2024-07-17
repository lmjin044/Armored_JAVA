package java0717_1;

import java.util.ArrayList;

public class Generic_Study1 {

	public static void main(String[] args) {
		
	FruitBox<Apple> appleBox = new FruitBox<>();
	appleBox.setFruit(new Apple());
	
	FruitBox<Banana> bananaBox = new FruitBox<>();
	bananaBox.setFruit(new Banana());
		//���� get-set ������� �ϰ� �� ��� : 
		//FruitBox�� �Ű������� apple�� Ÿ���� �����Ǿ��ִµ�
		//apple Ŭ���� ��ü�� �־ banana�� Ÿ�� ����ġ�� ���� ����.
		//�׷��Ƿ� FruitBox Ŭ������ banana Ÿ�Ե� �߰�
	
	FruitBox<Grape> grapeBox = new FruitBox<>();
	grapeBox.setFruit(new Grape());
	
	Apple apple = appleBox.getFruit();
	
	
//FruitBox<Toy> toyBox = new FruitBox<>();
//toyBox.setFruit(new Toy());
		//������ �̰� .... �³�...? �峭�� �԰�?
		//���׸� Ÿ�Կ� ������ �ƴ� ����� ������� ���� ������ġ�� �ʿ�.	 = ���
		
	FruitBox<fruit> fruitBox = new FruitBox<>();
	fruitBox.setFruit(new Apple());
		//�θ�-�ڽ� ����� �Ǵ� ���� �̰�.
		
		
	Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
	fruit a = new Apple();
		  a = new Banana();
		  a = new Grape();
		//����� �θ� ���ϰ� �ֱ� ������ �پ��� Ŭ���� �� ���� ������ ������.
		
		
		
		
		
		// TODO Auto-generated method stub

//		A<String> a = new A<>();
//			//AŬ������ ���׸� Ÿ�Ը��� T�� �����ϰ� �� �Ӽ��� String���� ����
//			//�̷��� item�̶�� ������ String �Ӽ��� ���Ѵ�.
//		A<Integer> b = new A<>();
//		b.item = 233;
//		
		
		
//class A<T>{
//	T item; 
//	T[] arr = new t[3];
//		//new ������ ����� �� ��.
//	ArrayList<T> list = new ArrayList<>();
//		//������ �迭�ν� ������ �����ϴϱ� �� ������� ��ȸ ����.
//	
//	 void setItem(T item) {
//		this.item = item;
//	//������ ��� ���� �� ������ �� ����
//	 
//	 }
//	
//}
//
//class B{
//	int item1;
//	String item2;
//	float item3;
//	char item4;
//	
////���� ���׸��� ������� ������ item �������� �ٸ� Ÿ��, �ٸ� �̸����� ������ ����
////���� �̸��� �޼��带 �����ε��� �ؾ� ��.
//
//public int getItem1() {
//		return item1;
//	}
//	public void setItem1(int item1) {
//		this.item1 = item1;
//	}
//	public String getItem2() {
//		return item2;
//	}
//	public void setItem2(String item2) {
//		this.item2 = item2;
//	}
//	public float getItem3() {
//		return item3;
//	}
//	public void setItem3(float item3) {
//		this.item3 = item3;
//	}
//	public char getItem4() {
//		return item4;
//	}
//	public void setItem4(char item4) {
//		this.item4 = item4;
//	}

}

	}


/*
 Generic(���׸�) :
  = Ŭ���� '����'�� Ÿ���� �����ϴ� ���
  = �������� ������ Ÿ���� �����ϴ� ����� ������...
    >> ���� ����� �����͸� �� Ŭ������ ������ �� �� �׷��� �ǰԲ�
    
   ��Ÿ�� ǥ�� : �ϴ� �� ����� ������ �� ����. �ٵ� ���� ǥ�� ��� ������.
   	T = type
   	E = element
   	K = key
   	V = value
   	N = number
 
  �ٽ� ��� :
  1) ���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ ������. 
  2) Ŭ������ ���׸��� ǥ���ϴ� ����� ���� �����ϸ�.
  	class A<Tea> << class Ŭ������<���׸����>
  	A<Tea> a = new A<Tea>();
  3) ���׸� Ÿ������ ����� ������ Ŭ���� �� �Ϻ� ������ �ɰ� ���� �� = ���
  	class A<Tea extends Parent>
  	 = Parent(�θ�) Ŭ������ �ڽ� Ŭ������ �θ� Ŭ������ ���׸����� Ÿ�� ���� ����
  	 = �ٸ� Ŭ������ �Ұ�.
  	 *���� Ÿ������ ���� ���� ����(�������̽��� ����Ÿ�� ���� ���� = Ŭ������ �� ��)
  4)���׸� ���ϵ�ī�� = <?>
     - ���׸� Ÿ���� �Ѱ� ���Ͽ�
     - �޼����� �Ű����� Ÿ�����ν� ���׸� Ÿ������ ǥ���� Ŭ������ ����� ���
       Ŭ������ ǥ���� ���׸��� ���� ����� ǥ������ �ʴ� ������ �߻��� �� �����
     - '���ܾ��� ����Ѵ�'��� �ǹ̸� ������ ����.
     - ���� ���� : 
     	��<? extends T> = T Ŭ������ �� �ڽı��� ���� ��� ����
     	  <? super T> = T Ŭ������ �� ����
  
  
 
   	
 */
 
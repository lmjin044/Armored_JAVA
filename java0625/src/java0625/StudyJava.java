package java0625;

public class StudyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ڹ��׽�Ʈ");
		//�ڵ� ������ ctnl(��)+f11
		//�ڹ� ���� ���� : '������Ÿ�� �����̸� = ������;'�� ����
		//������Ÿ���� ����: ����, �Ǽ�, ����
		//	1)���� : byte, short, int, long, char
		//	2)���� : char
		//	3)�Ǽ� : float, double
		
		byte num1 = 10;		//1byte / -128 ~ 127���������� 
		short num2 = 200;	//2byte
		int num3 = 785;		//4byte
		long num4 = 30L;	//8byte / long�� ��� L�� ���̱⵵ �Ѵ�. (�Ǽ���� ǥ��)		
		
		//byte < short < int < long ������ �� ���� ���� ���� �� �ִ�.
		
			//�� ��� ������ �����ϱ����� num�̶�� ������ ���������,
			//���� ���� �� �ش� �����Ͱ� � Ÿ���� �������� Ÿ���� �ٿ� ����Ѵ�.
			//byte�� ������ �ش��ϴ� Ÿ���̹Ƿ�, ���� �������� �����ص� ����, �Ǽ� �����ʹ� ������ ��ȯ�Ѵ�.
			//����� : ����� �ǹ� �������� ������ ����(�� ���, ������ ������µ� ��� ���ؼ�)
		
		char ch = 'a';
			//����ǥ�� ������ ��Ȯ�� �ؾ� �Ѵ�
			//ū ����ǥ = ���ڿ�(2�� �̻��� ���ڿ� ���� ���)
			//���� ����ǥ = ����(1���� ���� ���)
		
		float fnum = 3.14f;
			//�Ҽ����� ���� : �� �����Ϸ��� ������ �ڿ� f�� �ٿ��� �Ѵ�.
			//�ǹ̴�? : 
		
		double dnum = 12.345;
			//float�� �޸� f ǥ�Ⱑ �ʿ����.
		
		boolean isTrue = false;
			//false, true �� �ϳ��� ǥ��
		
		String word ="�̼���";
			//��� Ŭ����(=����� ���� Ÿ��)
		
		//�簢���� ���̸� ���Ͻÿ�(�غ�, ���̴� �����̴�.)
		
		int width = 15;
		int ���� = 20;	//�������� �������ؼ� ����� ���
		int area = width*����;
		
		System.out.println("���� : "+area);

		//Ű���� 30���� ������ �� ���� 8000���� ��� �� ���� �ݾ���?
		
		int keyboard =30;
		int price = 8000;
		int buy = keyboard*price;
		
		System.out.println("java ��¹�� print");
		System.out.println("�ٹٲ� �� �ȴ�");
		System.out.printf("printf \n ��� : ");
			//System.out.printf(word, args);
			//�������� ���ڿ� ���̿� \n�� �Է��ϸ� �� �ܾ �������� �ٹٲ��� �ȴ� 
			// \n = ����Ű(�� ����) : ���Ĺ���(������������ ��� ��)
		System.out.printf("�ѱݾ� : %d", buy );
				//���� %�� ���� ����ϴ� ���Ĺ���
				//d, u, f : 10����
				//c : ����
				//s : ���ڿ�
				//b : boolean(true, false �� ����)
				//o : 8����
				//x : 16����
		System.out.printf("���� : %d�� ���� : %d��", 80, 90);
			//�Է��� ������ ���� ��µȴ�.
		System.out.printf("���� : %d Ű : %d", 34, 173.5);
		System.out.printf("%5d",3);
			//5�ڸ��� ���� ������ Ȯ���ϰڴ�.
	}
	
}

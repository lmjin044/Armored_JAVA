package java0703;

//������ ��ǥ : ���� return�� �ִ� �޼��带 ����!
public class Study_0703_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ReturnMth ret = new ReturnMth();
//-------------------------------------------------
	//1)�޼��带 ���� ���� 10�� �޾� ����ϱ�
	int num=ret.get();
		//return�� ������ �ִ� ���� �ٱ����� ���� ������ ���� �ʿ���.
		//ReturnMth�� �ٱ������� ret���� ����ϱ�� �̸��� ���߰�, �ű⼭ get�� ������� ��.
	System.out.println(num);
	System.out.println();
//-------------------------------------------------
	//2)�޼���� 2���� ������ �� ���� �޾� ����ϱ�.
	int total = ret.sum();
	System.out.println(total);
	System.out.println();
//-------------------------------------------------	
	//3)��ĭ �ۼ��ϱ⿴��.
	/*
	? userName = ?;
	int age = 34;
	System.out.println(userName + " "+age);
	 */
	
	String userName = ret.getName();
	int age = 34;
	System.out.println(userName + " "+age);
//-------------------------------------------------	
	/*����� ���⼭ �� ��. 
	  ����, ����, ���� �� ������ ������ ����� ���ϴ� �޼��带 '����' ����� ����Ͻÿ�.
	 */
	int sumTest= ret.sumTest();
	int avaTest= ret.avaTest(tot);
	System.out.println("������ : "+sumTest);
	System.out.println("����� : "+avaTest);
//-------------------------------------------------	
/*
 �ذ��� : �ֻ����� ���� 1���� ���� ���� �̰������ ����Ͻÿ�.
 	 -���� : 1) �޼���� 2���� �����
 	 		2) �ֻ����� 6���̸�, ���� ū ���� �¸��̴�.
 */
	
//-------------------------------------------------	
	
	
	}

}








class ReturnMth{
//��return : �޼��� �ȿ� �ִ� ���� �ٱ����� ������ ��
//-------------------------------------------------
	int sumTest() {
		int kor=89, eng=78, mat=50; 
		int total = kor+eng+mat;
		return total;
	}
	
	int avaTest(int tot){
		int kor=89, eng=78, mat=50; 
		return tot;
	}
	
	
//-------------------------------------------------
	String getName(){//3)
		String name = "�̼���";	
		return name;
	}
	/*
	 ? getName(){
	 String name ="�̼���";
	 ?
	 }
	 */
//-------------------------------------------------
	int sum() {//2)
		int num1= 10, num2 = 20;
		int result = num1+num2;
		return result;	//�ٱ����� ����� ���̹Ƿ� ���⼭�� �׸�
	}
//-------------------------------------------------
	int get(){//1)
		return 10;	//���� 10�� return �ȿ� �ִ�.
	} 
	
}
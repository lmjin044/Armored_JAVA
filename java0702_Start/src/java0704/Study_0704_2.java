package java0704;

import java.util.Arrays;
import java.util.Scanner;

//������ ��ǥ : ������ �����̴�!(�޼��� ȣ��
public class Study_0704_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	MethodUtil util = new MethodUtil();
//----------------------------------------------------
//��1) 2���� ������ ��ȯ�ϱ�
		int[] num = util.twoNum();
		
		System.out.println(Arrays.toString(num));
//---------------------------------------------------	
//��2) �簢���� �ʺ�� ���̸� ���� ��, ���̸� ����Ͻÿ�.
//	  ���̴� main�޼��忡�� ��µǵ��� �Ͻÿ�.		

	int area = util.squareArea();
	System.out.println("���� : "+area);
//----------------------------------------------------
//��3) class MethodUtil �κ�, �α��� �޼����� ?�� ä��� ������ �α��� ���θ� ����Ͻÿ�.
//�̶�, ���̵�� skyblue, ��й�ȣ�� 1234sea�̸� ��� �����ؾ� �α��� ������ ���, �� �� �ϳ��� Ʋ���� ����.
/* ���������� ���ʵ� ?ä���
 ? isFail = ?
 	if(?){
 		?
 		?
 	}else{
 		?
 	}

	boolean isFail = util.login();
		if(isFail) {//���̵� ��й�ȣ�� ��ġ���� ���
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			return;
		}else {//���̵� ��й�ȣ�� ����ġ�� ���
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
		}
		 */
//----------------------------------------------------
/*��4)���� 3���� Ű����� �Է� �޾� ����Ͻÿ�.
 ���� 1)���� ���� ���� 100�� �ѱ� ��� 100-(�� ������ ��)�� ����� ��.
 ���� 2)���� ���� ���� 100�� �ѱ��� ���� ��� �� ������ ���� ����� ��. */
	
		int total = util.sumTotal();
		System.out.println(total);
//----------------------------------------------------

	}
}
	







class MethodUtil{
//----------------------------------------------------
//��4)
	int sumTotal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ���ڸ� �Է��Ͻÿ� : ");
		int num3 = sc.nextInt();
		
		int sum = (num1+num2+num3);	
		
		if (sum>100){
			return 100-sum;
		}else {
			return sum;}
	}
//----------------------------------------------------
/*��3 ? ä��� :
 ? login(){
 	Scanner sc= new Scanner(System.in);
 	System.out.print("���̵� : ");
 	String id = ?;
 	System.out.print("��й�ȣ : ");
 	String password = ?;
 	?
 	?
 	?
 	?
 	?
 	?
 }
 
	boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� : ");
		String id = sc.nextLine();
		System.out.println("��й�ȣ : ");
		String password = sc.nextLine();
		
		boolean pass = true;
		if(id.equals("skyblue") ) {
			if(password.equals("1234sea") )
			return pass;
		}//���̵�� ��й�ȣ�� ��� ���� ��� ��ȯ�� ��
		return pass = false;
		//�׷��� ���� ��� ��ȯ �� ��
	}
	*/		
//----------------------------------------------------
//��2)
	int squareArea() {
		int width = 40, height = 50;
		int area = width*height;
			//���� ������ ����� ������ �޼ҵ尡 ����Ǿ ������� ����.
		return area;
		//int[] temp = new int[] {width, height};
		//return temp;
		}
	

//----------------------------------------------------	
//��1)	
	int[] twoNum() {
		int num1=20, num2= 50;
		int[] temp = new int[] {num1, num2};
		return temp;
			//return�� ��ħǥ�� ���Ƽ� �ѹ��� ���� ��.
			//num2�� ��ȯ��Ű�ٴٰ� return num2; ����� �� �ȴٴ� �Ҹ�.
			//�׷��Ƿ� �� ������ �ӽ÷� �迭�� ����� return�� ���� 1���� ���� �����.
			//return temp;���� �ǰ� return new int[]{num1, num2}; ���� ��.
		//�ض��� return���� ������ ���� �迭�� �Ǹ�, �װ��� �޾��� �޼��嵵 �迭�� Ÿ���� ������ �Ѵ�.
	}
	
}

package java0704;

import java.util.Scanner;

public class Study_0704_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//---------------------------------------------------------
		/*�ذ�� 1) �ܼ��ϰ� �� 2���϶�.
		Dice game = new Dice();
		int sDice = game.getDice("����");
		int hDice = game.getDice("����");
		game.result(sDice, hDice);
		*/
		
		Dice game = new Dice();	//�ذ�� 2) ������ n��
		game.init();
		game.diceThrow();
		game.result();
	}

}

class Dice{
	//�ذ��2) �迭�� ����ϱ� : �� �̷��� �ϳ���?
	//					  �����ڰ� 2�� �̻��� �� ��¼�÷���?
	String[] names;
	int[] diceNum;
	
	void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֻ��� ���� ���� �ο� : ");
		int cnt = sc.nextInt();
		this.names = new String[cnt];
		this.diceNum = new int[cnt];
			//����(=�Է�)�ϴ� �ο��� ��ŭ �迭�� ũ�Ⱑ ��ȭ��
		sc.nextLine();
			//���� ������ ���ڿ� �Է��� �� ���Ͱ� ������ ��ŵ�Ǵ� ������ �߻���
		for(int i =0; i<names.length; i++) {
			System.out.println("������ �̸��� �Է� �ϼ��� : ");
			names[i]=sc.nextLine();
				//names �迭�� �����͸� ���� ����
				//�׳� �����ϸ� ������ �ִ�?? :
				// ���� �Է� > ���� > ���� �Է� �ܰ迡�� ���� ���� �Է� ������ �νĵ�
				// = ù��° ������ �̸��� ���� �� ����. �̰� '���� ����'��� �ؾ� ��
			
		}
	 
	}
	void diceThrow() {
		for(int i=0; i<names.length;i++) {
			this.diceNum[i] =(int)(Math.random()*6)+1;
			System.out.println(this.names[i]+"�ֻ��� : "+this.diceNum[i]);
		}
	}
	void result() {//�ֻ��� ����� �񱳸� ����� ��
		int max=0; //1) ���� ū �ֻ��� �� ã��
		for(int num : diceNum){//2)�迭 �� �����͸� �������� ã�� ���̹Ƿ� �迭 ���� �ݺ���
			if(max<num) max=num;	//max�� ������ ������ diceNum���� ���� ���� �� ũ�� �װ��� max�� ����
		}
		boolean isSame = true;	//�ֻ��� ���� ���� ������ ���
		for(int num : diceNum) {
			if(num != max) isSame = false;	//�� �� ���̶� �ٸ� ���� ���Դٸ� �������� ����
		}
		if(isSame) {
			System.out.println("��� �����ڵ��� �ֻ��� ���� ����, ���º�");
			return;	//��� �������� �ֻ����� ���� ��� ��� ����Ǿ� �Ʒ� ������ ������� �ʴ´�.
		}
		for(int i=0; i<diceNum.length; i++) {//���� ū �ֻ������� ���� ������� �̱�
			;
			if(diceNum[i] == max) {
				System.out.println(names[i]+" ��");
		}
		
		
	}
}	
	
//---------------------------------------------------------	
	/*�ذ�� 1)
	void result(int s, int h) {
		//�񱳸� ���� �޼��� >> �޼��� �ٱ��� �̹� �����Ͱ� �ִ� = �Ű����� �����Ͷ�
		//void ��� = return �Ⱦ���.
		if(s>h) {
			System.out.println("���� ��, ���� ��");
		}else if(h>s) {
			System.out.println("���� ��, ���� ��");
		}else {
			System.out.println("���º�");
		}
	}
	
	int getDice(String Name) {//������ �ֻ����� ���� ���������� �˱� ���� �Ű����� ���

		int num = (int) (Math.floor(Math.random()*6)+1);
			//�� ����� �ֻ����� ������ ������ ���� ������ 1���� ����� ��
		System.out.println(Name+"�ֻ��� : "+num);
		return num;
	}
	*/
}
package java0704;

import java.util.Scanner;

public class Study_0704_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//----------------------�� �� ��------------------------------		
//���� : ��ǻ�Ϳ� ������������ ����.
//	    ��ǻ�ʹ� �̹� �Էµ� comInput�޼��带 ����Ѵ�. 
//		������ ������������ �ѱ۷� �Է��Ѵ�.
//		����� ��, ��, �з� ����Ѵ�. 	
		
		Game rcp = new Game();
		rcp.comInput();
		rcp.userInput();
		rcp.result();
//----------------------�� �� ��------------------------------		
		
//----------------------�� �� ��------------------------------		
	}

}




class Game{//���������� ���� �����
	String com;
	String user;
	
	void comInput(){
		int temp = (int)(Math.random()*3);
		switch(temp) {
			case 0: this.com="����";break;
			case 1: this.com="����";break;
			case 2: this.com="��";break;
			}
	}
	
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("����, ����, �� �� �ϳ��� �Է��ϼ��� : ");
		String rcp = sc.nextLine();
		switch(rcp) {
			case "����": this.user="����";break;
			case "����": this.user="����";break;
			case "��" : this.user="��";break;
			default :System.out.println("�ٽ� �Է����ּ���."); userInput(); break;
			}

	}
	
	void result() {
		if(user ==null || com == null) {
			System.out.println("������ �߻��߽��ϴ�. �ٽ� �Է����ּ���."); return;
		}
		if(user.equals(com)){
			System.out.printf("���� %s, ��ǻ�� %s�� ���º�", user, com);
		}else if(
		  (user.equals("����") && com.equals("��")) ||
		  (user.equals("����") && com.equals("����"))||
		  (user.equals("��")  && com.equals("����")) ){
			System.out.printf("���� %s, ��ǻ�� %s�� ���� ��", user, com);
		}else {
			System.out.printf("���� %s, ��ǻ�� %s�� ��ǻ�� ��", user, com);
		}

	}
//----------------------�� �� ��------------------------------		
//----------------------�� �� ��------------------------------		
//----------------------�� �� ��------------------------------		
//----------------------�� �� ��------------------------------		
}
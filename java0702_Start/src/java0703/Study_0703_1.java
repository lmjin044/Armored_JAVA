package java0703;

import java.time.LocalDate;


public class Study_0703_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member1 = new Member("�̼���", 31, "����");
		Member member2 = new Member("������", 29, "�����������");
		Member member3 = new Member("�念��", 45, "��������");
			
		//�̶� �� ������� �¾ ���� ���ϱ�
		member1.birth();
		member2.birth();
		member3.birth();
			//�Ʒ� ���� �޼��带 ���ؼ� ������ �Ű�������� ������ ���̵� ����.
		
		
		DataIdentify dataIdentify = new DataIdentify();
			//���� Ŭ���� �̸��� ���س��� �� : ���⼭ ���ɴ�� �����з� �޼��尡 ��
		
		//�׷��� ���ɴ�� ���⼭ ��� ���� ���ΰ�? : ���ɴ� ���ϱ� �޼���� �Ʒ� ����.
		dataIdentify.ageGroup(member1.name,member1.age);
		dataIdentify.ageGroup(member2.name,member2.age);
		dataIdentify.ageGroup(member3.name,member3.age);
		
		//�����з��ϱ� : ���� ���� �з��� ����.
		//��� ��ǥ : '�̼��� : 05.����'			
		
		dataIdentify.jobGroup(member1.name, member1.job);
		dataIdentify.jobGroup(member2.name, member2.job);
		dataIdentify.jobGroup(member3.name, member3.job);


		
/*		
 	���1 : Date �̿��ϱ� (���� import java.util.Date; �߰���)
		Date today = new Date();
			//new Date ��ü�� ������ָ� ���� �����ϰ� �ð����� �� �� �ִ�.
			//�� ��ü���� ������ ���� �������� getYear�� ���� >> int ������ ����
		System.out.println(today.getYear()+1900);
			//today.getYear�θ� �����ϸ� 124�� ����: ������ 1900�� 00�� 01��
			//���� 1900���� ���� ���¿��� ���������� 2024�� ����
			//�ٵ� �� 1900����? ������ ������ ���� �ܼ��ϰ� ����� ������
		System.out.println(today.getMonth()+1);
			//���� �ǹ̿��� ������ 0���� �����ϱ� ������ +1�� ���ؾ� ��
		
		 
	���2 : Calendar �̿��ϱ� (���� import java.util.Calendar; �߰���)
		Calendar cal = Calendar.getInstance();
			//Ķ������ �߻����� �޼���� ���� ������ �� ����. �ν��Ͻ��� ������ ���������� ���� ǥ��
		int year = cal.get(Calendar.YEAR);
			//int Ÿ������ ���ϰ��� ���ƿ�>>Ŭ���� ���� ���
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
			//������ ���� Calendar��� Ŭ���� ������ ������� ������ 
			//���� get�� ���� Year, Month ���� ������ �� �ִ�.
			//�� ���� ��� ������ 0���� ��Ƽ� +1�� ������.
	
	���3 : LocalDate �̿��ϱ� (���� import java.time.LocalDate; �߰���)
		LocalDate today = LocalDate.now();
			//LocalDate : �ڹ�8���� �߰� �� ������ �����δ� �̰� ���� ������
			//.now = ���� ���α׷��� �����ϴ� ���� ������ ������
			//��ü today�� ���� ��, ��, ���� ���
			//���� = today.getYear();   
			//�� = today.getMonthValue(); ���� ����� ���� +1 �� ���ص� ��.
			//�� = today.getDayofMonth();
			//���� = today.getDayofWeek(); or getValue(); ��1(��)~7(��) 
		int nowYear = today.getYear();
			
		int birthYear1 = nowYear -member1.age;
		System.out.printf("%s �¾ ���� : %d�� \n", member1.name, birthYear1);
			//��±��� �߱� ������ return���� �ʿ����� ����
*/
			 
	}

}
class DataIdentify{
	//Ŭ������ ������ �޼���� �ݵ�� ���� ���� ���� �ʿ�� ����. 
	//�޼��� Ȥ�� ������ �־ ok
	//�׷��� Ŭ������ ������ ���� ������ �� : 
	//����� ��û�� ��Ʈ���� �����, ���� ����� �� �뵵, ������ ����� 
		//������ ver.= Controller, Service, DTO(Ȥ�� VO)
	
	void ageGroup(String name, int age) {//=ageGroup���� ���� ����ϰڴ� =return�� �ʿ����.
		//�̸��� ���̰� �ִ� �ܺ� �����Ϳ��� ������ ����.
		String group = null;	//group�̶�� �̸����� ������� ���������� �Ѵ�.
			group = age/10+"0��";
		System.out.println(name+" : "+group);	//�� ������� ǥ���ϰڴٴ� �ǹ���.
		
	}
	//���� ���� �з� : ����(05.����), �������(18.�����Ǻ�), ��������(15.���)
	
	void jobGroup(String name, String job) {
		String ncs = null;
		switch(job) {	//=if�� : if(job.equals("����"))
			case "����" : ncs ="05.����";
				break;
			case "�����������" : ncs = "18.�����Ǻ�";
				break;
			case "��������" : ncs = "15.���";
				break;
			}
		
		System.out.println(name +" : "+job);

	}
	
}	
	



class Member{
	String name;	//�̸�
	int age;		//����
	String job;		//����
	//���� �⺻ ������ �޼���
	Member(){}
	//���� �Ű������� �ִ� ������ �޼��� 
	Member(String name, int age, String job){
		this.name=name;
		this.age=age;
		this.job=job;
	}
	
	//�¾ ������ ����ϴ� �޼��� ����
	void birth() {
		//��ȯ���� �ʿ� ���� ������ void ���
		LocalDate today = LocalDate.now();
		int nowYear = today.getYear();
		int birthYear1 = nowYear -this.age;
		System.out.printf("%s �¾ ���� : %d�� \n", this.name, birthYear1);
			//member1�� �� �޼��� �ȿ��� ���� ������ �ƴ� : 
			//=�޼��� �ٱ����� �����;� ��
			//�׷��� �ڽ��� ���� �ڽ��� �������� �ڰ����� >> this�� ������ �� ����.
			//this = member1~3�� �ǹ�.
			
	}
}
/*
 ������ ���� : �޼��� 2
 
 �ظ޼���� �Լ�, �� ���°�?
 	�ٹݺ����� �ʿ��� ��� : �迭(�ٷ��� ������ ó���� ��), ���(���� ����, ���ҽ�)
 	�ٽ��� ������ �ʹ� ���� �ö󰡾� �ϰ�, ����ġ�� �ݺ����� ��쿡 �޼���, �Լ��� ���
	���� �ݺ��������� �ʹ� ������� ��!
	������ : �ڵ��� ����, ��������, ������ ���� = ����ȭ �� ���α׷����� ����
		
  
 */
 
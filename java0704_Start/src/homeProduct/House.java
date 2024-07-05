package homeProduct;
//tv�� �������� ������� ���� �ƿ� House�� ������.
//�׷� tv�� �������� ��ǻ�͵� ����� �޾Ƽ� ���⼭ ���� power �޼��带 ��� ����
public class House {
	protected boolean onOff;
	protected String brand;	//��ǰ �귣���
	protected int price;		//��ǰ ���Ű���
	
	protected House(){
		this.onOff = false;
	}
	
	protected House(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	protected void power() {
		this.onOff=!this.onOff;
		System.out.println("���� : " +this.onOff);
	}
	
}


/*
 �ڳ� ������ :
 1. static : class�� ���� �������� ���� �޼���
 			 class���� �������� ��� ����.
 			 ��ü�� �ƴ� class�� ����
 	��뿹)class�̸�.static������, class��.static method()
 
 2. abstract : �߻� ����(�޼���) ���� �̿ϼ� =  ��ü ���� �Ұ�
 			   
 3. final : ������� ����
 			���� �տ� final�� �ٿ� �������� ������� �ʰ� ����
 			�޼��� �տ� final�� ���� ��� �ش� �޼���� �������̵� �Ұ�
 			class�� final�� ���� ��� ����� �Ұ� = �θ�class ��� �Ұ�
 			 
 4. ���� ������ 
 	1)public(�߿�) : �ƹ� ���ٵ� �������� ���� = ��� ��Ű�������� ��� ���� ����
 			   	   ����, �޼��� �տ� ���� ���̴°� ������
 		�ظ��� �� ���̸�? : �ٸ� ��Ű������ �ش� �޼��带 �ν��� �� ����.
 			   	 
 	���̰Ŷ� ������...		   	
 		���� ��Ű�� �������� import�� �� �ٿ��� ��
 		�ٸ� ��Ű���� ������ import�� �ٿ��� ��
 		
 	2)default : ���� ��Ű�������� ���� ���� ����(�տ� �� �ٿ��� ����)
 	
 	3)protected : ���� ��Ű�������� ���� ���� ����
 				  �� ��� ������ ��쿡�� �ٸ� ��Ű������ ���� ����
 				  �θ� �ʿ��� protected�� �޾����� �ڽ� �ʿ����� �ٿ��� ��
 				  ���� �ڽ� Ŭ���� �ܿ� ������� �ʰ� ������� �̰� �޾� �ִ°� ����.
 	
 	4)private(�߿�) : ��𼭳� �� ������ ������� ���ϰ� ��
 	 				���������� Ŭ���� ���ο����� ��� ����(�� ȥ�ڸ� ����)
 			   		�θ�-�ڽİ��� �����ص� �̰� �ɸ� ��� ���ϰ� ����
  
 */
 
package homeProduct;

public class Aircon extends House{

	static final String[] windtext = {"��","��","��"};
		//Ŭ���� ����+���� ���ϰڴٴ� ����
		//���� 3�ܰ谡 �ƴ϶� �� �þ���� ���ʸ� ���� �ø��� �迭�� ���� �þ
		//=�Ʒ� if ������ ���� ������ ���� ����.
	int wind =0;
	int temperature; 
	
	Aircon(){}
	Aircon(String brand, int price){
		super(brand, price);
	}
	
	void tempUp() {
		this.temperature++;
	}
	
	void tempDown() {
		this.temperature--;
	}
	
	void windControl() {
		wind++;	
			//"��", "��","��"�� ���� 0, 1, 2�θ� ǥ���ϵ��ϸ� ���ָ� ��
		if(wind == windtext.length) wind =0;
			//������ �ٽ� �� ������ ���ư��� �ϴ� ���� �߰�.
			//�迭�� ũ��(3)�� �������� ���ư���.
		System.out.println("���� �ٶ����� : " +windtext[wind]);
		
	}
	
	
}

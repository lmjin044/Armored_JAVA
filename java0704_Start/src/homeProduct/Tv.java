package homeProduct;

public class Tv extends House {
//tv�ڿ� �ٷ� 1ĭ ��� ���°Ŵ�
//extends House : House�� �ۼ��ߴ� �ڵ带 ����� ���� ���°���.
	
	int channel =10;
	int vol =5;
	
	Tv(){		//������ �޼���
		super();	
	}
	
	Tv(String brand, int price){//�Ű������� �ִ� ������ �޼���
			
	}
	
	void channelUp() {
		this.channel++;
	}
}
package homeProduct;

public class Tv extends House {
//tv�ڿ� �ٷ� 1ĭ ��� ���°Ŵ�
//extends House : House�� �ۼ��ߴ� �ڵ带 ����� ���� ���°���.
	
	private int channel =10;
	private int vol =5;
	 //������ Ÿ���� ���� �ʰ� �ϴ� ��� : 
	 // 1)�޼��� ���� �� �Ʒ��� �� ���� �����ϰ� ��Ŭ��
	 // 2)source > Generated Getters and Setters ����.
	 // 3)�޼��� ���� ���� ���� �� generated Ŭ��.
//�׷��� �Ʒ��� ������ ����ȴ�.
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
//��������� �ڵ����� �������� ��
	
	Tv(){super();}
	Tv(String brand, int price){
		super(brand, price);
	}

	
	void channelUp() {
		this.channel++;
	}
	
	void channelDown() {
		this.channel--;
	}
	@Override
		//�������̵� @ : ��ǻ�Ϳ��� �ִ� �ּ�, ���� �޼����� ������
		//�θ�Ŭ������ �ش� �޼��尡 �ݵ�� �����ؾ� ��.
		//�������̵� �޼���� �ݵ�� ��ȯ Ÿ��, �޼��� �̸�, �Ű����� �Ȱ��� �ۼ�
		//�ż��� �� {} ������ �޶� ��� ����
	
		//�� �����ε� : ���ο� �޼��带 ����
	protected void power() {
		super.onOff = !super.onOff;
		System.out.println("TV ���� : "+super.onOff);
		
		//tvŬ���� ��ü�� power �����϶�� �ϸ� �ڽ� Ŭ����
	}
}
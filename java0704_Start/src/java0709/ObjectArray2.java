package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game[] ga = new Game[7];
		
		ga[0] = new Game("���׿��극����", "AOS", "PC");
		ga[1] = new Game("DJMAX �ø���", "����", "PC, XBOX");
		ga[2] = new Game("�ٿ��", "�÷�����", "�����");
		ga[3] = new Game("������ ���ͽ�����6", "���̽�", "XBOX");
		ga[4] = new Game("Final Fantazy VII REBIRTH", "ARPG", "PS4");
		ga[5] = new Game("������ ���� : �ձ��� ����", "ARPG", "Switch");
		ga[6] = new Game("�߷ζ�Ʈ", "FPS", "PC");
		
		for(int i=0; i<ga.length; i++) {
			System.out.println(ga[i]);
		}
	}

}
/*
���� : 7���� ���� ������ ���� ��ü�� �����ϰ� ����Ͻÿ�
*/
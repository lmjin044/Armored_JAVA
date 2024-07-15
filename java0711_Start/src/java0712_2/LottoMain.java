package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list =new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ڵ����� �� ��? : ");
		int howMany = scan.nextInt();
		
		for(int i=1; i<howMany; i++) {
			int[] temp = new int[6];	
				//6�� ���ڰ� �� �迭�� ����� �ӽ÷� ������ temp�� ���δ�. 
			for(int k=0; k<temp.length; k++) {
				temp[k] = (int)(Math.random()*45)+1;
				//45���� ������ ����ϴ� ������ �Լ��� �����ϰ� �� ������� k�� ����.
				for(int j=0; j<k; j++) {
					if(temp[k] == temp[j]) {
						k--; break;
				//������ �ߺ��� Ȯ���ϱ� ����, ���� ��µ� ���ڸ� j�� ����.
				//j�� k�� ���� ���ٸ� �ٽ� k ���� ����.
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt -> System.out.println(lt));
		//
		//��������� �ζǸ� ���� ���� ���� �߻� ���α׷���.
		
//���� ������ 1�� ���ڿ���, ���� ������ ��ȣ �� 3��(5�� ��ġ)�� 4��(4�� ��ġ)��?

		int trd=0, fth=0;
		
		for(Lotto lotto : list) {
			int[] temp = lotto.getNum();
			int cnt=0;	//��ġ�ϴ� ���ڸ� ������ ������
			//���� ���Ƿ� ������ ���ڸ� �迭�� ������ ��.
			for(int i : temp) {	//���� ���� ������ �迭 ����
				for(int k : first) {//1�� �迭�� ����
					if(i==k)	//���࿡ ��ġ�Ѵٸ�
						cnt++;	//cnt�� ���� 1 �ø���.
				}
			}
			if(cnt == 6) System.out.println("1��");
		
			if(cnt == 5) trd++;
			if(cnt == 4) fth++;
		}

		System.out.println("3���� "+trd+"��");
		System.out.println("4���� "+fth+"��");
		
		
		
		
		
		
		
		
		
		
	}

}

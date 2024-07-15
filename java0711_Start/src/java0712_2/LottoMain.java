package java0712_2;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] first = new int[] {8,12,23,29,35,41};
		
		ArrayList<Lotto> list =new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("자동으로 몇 장? : ");
		int howMany = scan.nextInt();
		
		for(int i=1; i<howMany; i++) {
			int[] temp = new int[6];	
				//6개 숫자가 들어갈 배열을 만들고 임시로 변수명 temp를 붙인다. 
			for(int k=0; k<temp.length; k++) {
				temp[k] = (int)(Math.random()*45)+1;
				//45개의 정수를 출력하는 임의의 함수를 생성하고 그 결과값을 k로 지정.
				for(int j=0; j<k; j++) {
					if(temp[k] == temp[j]) {
						k--; break;
				//숫자의 중복을 확인하기 위해, 먼저 출력된 숫자를 j로 지정.
				//j와 k의 값이 같다면 다시 k 값을 돌림.
					}
				}
			}
			list.add(new Lotto(temp));
		}
		list.forEach(lt -> System.out.println(lt));
		//
		//여기까지가 로또를 위한 랜덤 숫자 발생 프로그래밍.
		
//먼저 지정한 1등 숫자에서, 내가 추출한 번호 중 3등(5개 일치)과 4등(4개 일치)은?

		int trd=0, fth=0;
		
		for(Lotto lotto : list) {
			int[] temp = lotto.getNum();
			int cnt=0;	//일치하는 숫자를 저장할 변수명
			//내가 임의로 추출한 숫자를 배열로 저장할 것.
			for(int i : temp) {	//내가 뽑은 숫자의 배열 숫자
				for(int k : first) {//1등 배열의 숫자
					if(i==k)	//만약에 일치한다면
						cnt++;	//cnt의 값을 1 올린다.
				}
			}
			if(cnt == 6) System.out.println("1등");
		
			if(cnt == 5) trd++;
			if(cnt == 4) fth++;
		}

		System.out.println("3등은 "+trd+"개");
		System.out.println("4등은 "+fth+"개");
		
		
		
		
		
		
		
		
		
		
	}

}

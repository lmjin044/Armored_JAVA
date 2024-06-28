package java0628;

import java.util.Scanner;

public class Study_0628_3 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//과자배열에 좋아하는 과자의 판매가를 키보드로 입력하여 저장할 것
	//저장된 판매가격의 총합과 평균을 구하시오.
	
	int[] snack= new int[5];
	for(int i=0; i<snack.length; i++) {
		System.out.print((i+1)+"번째 과자 가격은 : ");
		snack[i] = scan.nextInt();
	}

	int sum = 0;
	for(int i=0; i<snack.length; i++) {
		sum = sum + snack[i];
	}
	
	int ava = sum/snack.length;

	System.out.printf("과자값 총합은 %d원, 과자값 평균은 %d원 입니다.", sum, ava);
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

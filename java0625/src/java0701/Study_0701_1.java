package java0701;

import java.util.Arrays;

import java.util.Scanner;

public class Study_0701_1 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//배열에 20개 숫자 저장(범위는 1~30) 
		//그 중 5배수는 몇개인가?
		
		int[] number = new int[20];//1)임의의 공간 20개를 가진, number이름의 배열을 만든다
		
		for(int i=0; i<number.length; i++) {	//2)30개의 랜덤한 숫자를 배열에 넣는다.
			number[i] = (int)(Math.random()*30)+1;			
		}
		
		int count = 0;//3)5의 배수를 카운트하여 저장할 변수를 구한다.
		
		for(int i=0; i<number.length; i++) { //4)5의 배수를 구하는 식
			if(number[i]%5 == 0)
				count++;
		}

		System.out.println(Arrays.toString(number));
		System.out.println("5의 배수는 "+count+"개");

	}

}

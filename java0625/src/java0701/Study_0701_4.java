package java0701;

public class Study_0701_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 2차원 배열 : 1차원 배열 공간에 1차원 배열을 연결한 것
 	=인덱스가 2개
 	=타입 뒤에 대괄호를 2개 붙임
 	
		
	int[][] arr = new int[5][3];
		//뜻 : arr라는 이름을 가진 3개짜리 배열이 5개 있다.
		//		= 0번 인덱스의 0번 인덱스는 표로 따지면 가장 좌상단에 위치함
	
	arr[0][0]=10;
	arr[0][1]=20;
	arr[0][2]=30;
	arr[1][0]=40;
	arr[2][1]=50;
*/	

	int[]a = new int[] {10,20,30,40,50,60,70,80,90,100};
	
	for(int data: a) {	//배열 전용 for문(index가 표현될 경우 사용 가능)	= forEach(혹은 Each)
						//int i=0; i<a.length; i++와 같은 표현임.
		System.out.println(data);
	}
	
	int[][]	array1 = new int[2][3];
	System.out.println(array1.length);	//행 자체의 갯수를 물어봄
	System.out.println(array1[0].length); //첫번째 행의 갯수를 물어봄
	System.out.println(array1[1].length); //두번째 행의 갯수를 물어봄
	System.out.println();
	System.out.println();
	
	int[][] array2 = new int[][] {{1,2},{3,4,5}};
	System.out.println(array2[0].length);	//첫번째 행의 갯수는 2개
	System.out.println(array2[1].length);	//두번째 행의 갯수는 3개
		//마찬가지로 행 자체의 갯수는 2개다.
	System.out.println();
	System.out.println(array2[0][0]);	//첫번째 행 첫번째 열의 인덱스를 물어봄 = 1
	System.out.println(array2[0][1]);	//첫번째 행 두번째 열의 인덱스를 물어봄 = 2
	System.out.println();
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

}

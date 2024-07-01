package java0701;

import java.util.Arrays;

public class Study_0701_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//배열의 사용처 : 많은 양의 데이터를 다룰 때(상황에 따라서는 쓰면 안 되는 경우도 존재)
//			  보통 배열의 구조에 데이터를 저장함
		
//오늘의 학습 : 동적배열
//			= 기존 배열의 크기를 늘리거나 줄여서 사용
//			= 정적 배열의 응용

	//데이터를 추가로 더 저장하려면 배열의 크기를 더 늘려야 함	
	int[] num = new int[] {10, 20, 30, 40, 50}; //배열의 크기 = 5(인덱스 상 4)
	int size = num.length;	//배열의 크기를 size라는 변수에 저장
	
	int[] temp = new int[size+1];	//num보다 사이즈가 하나 더 큰 임시 배열 형성(num과 연관X)
	for(int i=0; i<size; i++) {
		temp[i]=num[i];	//반복문을 통해 num이 가진 값을 temp에 저장
		
	}
		
	num = temp;	//기존에 사용하던 배열 이름을 계속 이어 씀(안 그러면 데이터 추가 할 적마다 새 이름 또 써야 함)
	num[5]=60;
	
	System.out.println("크기 증가 후 : "+Arrays.toString(num));
	
	
//문자열에서 같음을 비교하는 표현은 .equals();
//문자열 내 특정 문자 혹은 문자열 포함 여부는 .contains();
//아래 주소 중 선화동 주소만 추출, 배열에 저장
//확인 출력은 Array.toString 이용
	
	String[] addr = new String[] {
			"대전 중구 선화동 25", "대전 중구 선화동 92",
			"대전 서구 둔산동 111", "대전 서구 둔산동 1023",
			"대전 유성구 노은동 93", "대전 중구 대흥동 932",
			"대전 동구 가양동 945", "대전 중구 선화동 1234",
			"대전 중구 대흥동 23", "대전 중구 선화동 984"
	};
	
	String[] 선화동 = new String[addr.length];
	int index = 0;
	
	for(int i =0; i<addr.length; i++) {
		if(addr[i].contains("선화동")) {	//선화동이라는 단어가 addr 배열에 있을 경우
			선화동[index++]=addr[i];	//선화동 배열의 index(=데이터)에 추가할 것
		}
	}
		
	System.out.println(Arrays.toString(선화동));
		//null값이 뒤에 이어지는 이유 : addr의 공간값을 그대로 가져와서 그럼
		
		
		
		
		
		
		
		
		
	}

}

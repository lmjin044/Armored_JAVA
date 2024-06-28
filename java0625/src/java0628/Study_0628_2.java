package java0628;

import java.util.Arrays;

public class Study_0628_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 배열 : 
 	자바스크립트 ver.- 연속적 구조로 이루어진 데이터 저장 공간
 				 - 대괄호로 표기함
 	
 	자바 ver. - 연속적 구조로 이루어진 같은 데이터 타입의 저장 공간
 	  		-중괄호로 표기함. 
 	  		-정수 배열 내에서는 정수 데이터만 저장 가능
 */
	int[] a ={10,20,30};
	System.out.println(a[0]+"  "+a[1]);
		//자바스크립트와 마찬가지로 첫번째 인덱스는 0으로 표기된다.
	System.out.println(a);
		//그냥 배열명 a로 할 경우 단순히 저장된 주소만 출력된다.
	System.out.println(Arrays.toString(a));
		//tostring = 자바에 내장된 문자열
		//그러므로 Arrays.toString(a)는 배열 a가 가지는 데이터를 문자열로 보여달라는 명령어임
	int[] b = {40,50,60};
	
	int[] arr = new int[10];
		//자바에서 배열을 만드는 정석적인 방법
		//이렇게 만들면 : 배열 내 빈 공간이 10개를 생성(자바스크립트의 newArray와 동일)
		//배열 내 데이터 지정 할 때도 왜 int를 붙이느냐 = 데이터 타입을 통일시켜야 하니까.
	
	int[] brr = new int[] {10,20,30,40};
		//이러면 10, 20, 30, 40이 저장된 배열 내 공간이 4개가 생성됨.

	//int[] crr = new int[]; : 성립이 안 됨(데이터도 빈공간 지정도 없으면 오류남)
	//						   그러니까 모르긴 몰라도 크기는 꼭 지정해라.
	
	int size = 15;
	int[] arr2 = new int[size];
	//정적 배열 : 이렇게 하면 나중에 size만 찾아서 수치 변경하면 그 안의 공간도 변경이 가능함
	//		   쓰긴 하는데 주 데이터 저장 용도로는 사용하지 않음. ↔ 동적 배열
	
	//이하 배열 생성 방법 다시 요약.
	//정석 : 데이터타입[] 배열이름 = new 데이터타입[배열크기];		
	
	int[] money = new int[5];	
		//그러므로 int 타입의 변수가 5개 들어갈 공간이 생김!
		//마지막 인덱스 번호는 4번!
	money[0] = 5000;
	money[1] = 10000;
	money[2] = 15000;
	money[3] = 20000;
	money[4] = 25000;
	
	for(int i=0; i<money.length; i++) {
		//어떤 배열이든 for문은 이렇게 쓰면 됨. 
		//인덱스 내 데이터 출력을 하고 싶으면 반복문 필수다.
		if(money[i]>=15000) {
			//조건을 인덱스 전체 중 특정 조건으로 지정하면 해당 조건에 해당하는 데이터만 출력.
		System.out.println(money[i]);
		//이러면 배열 인덱스 순서대로 데이터가 전부 나옴.
		}
		
	}
	
	int[] classA = new int[3];
		//3개의 데이터만 넣을 수 있다.
	classA[0]=89;
	classA[1]=78;
	classA[2]=93;
	
	int[] classB = new int[3];
	classB[0] = 56;
	classB[1] = 84;
	classB[2] = 72;
	
	System.out.println("A반 성적 : "+Arrays.toString(classA));
	System.out.println("B반 성적 : "+Arrays.toString(classB));
		//일때, A, B 두 반의 성적 중 80점 이상만 출력하려면?
		//두 배열의 크기는 동일하게 3 = 1개 배열로 통일 가능 : 통합시킬 배열 1개 추가하면 됨
	
	/*
	for(int i=0; i<classA.length; i++) {
		//어차피 a,b 둘다 배열은 3개라서 a반만 대상으로 해도 상관 없음.
		if(classA[i]>=80) 
			System.out.println(classA[i]);
		if(classB[i]>=80) 
			System.out.println(classB[i]);
		}
	이렇게 표현해도 되지만 아래로도 가능하다.
	
	for(int i=0; i<classA.length; i++) {
		
		grade1[i]=classA[i];
		grade1[i+3]=classB[i];
	}
	
	
	for(int i=0; i<grade1.length; i++) {
		if(i<3) {
			grade1[i]=classA[i];
				//grade1의 n번 인덱스가 classA의 n번 인덱스에 저장되는 것(0~2번까지)
		}else {
			grade1[i]=classB[i-3];//3~5까지는 classB에 저장할거니까.
		}
		
	}
	
	*/
	
	
	int[] grade1 = new int[classA.length+classB.length];
			//a,b 둘다 가지려면 두 배열의 크기를 합치면 된다. (그러므로 grade1의 배열 크기는 6)
	
	//반복문 없이 메소드를 이용하는 방법도 있다. arrayCopy : 배열을 복사해서 다른 배열에 붙여넣는 기능!
	//물론 같은 타입이여야 가능
	System.arraycopy(classA, 0, grade1, 0, classA.length);
	System.arraycopy(classB, 0, grade1, 3, classB.length);
	//괄호 안 설명 : (복사할 배열, 복사를 시작할 인덱스, 저장할 배열, 저장시킬 인덱스, 복사할 데이터 수)
	//			   ※이때 데이터 수를 숫자로 기입해도 되겠지만 그냥 저렇게 하는게 더 정확하다.
	
	
	for(int i=0; i<grade1.length;i++) {
		if(grade1[i]>=80)
			System.out.println(grade1[i]);
	}
	
	Arrays.sort(grade1);//얘는 배열을 정렬하는 목적의 클래스다.
	System.out.println(Arrays.toString(grade1));
	
	boolean same = Arrays.equals(classA, classB);
	System.out.println("A반, B반 배열이 같은가? : "+same);
	
	
	
	
	
	
	
	
	}
}



package java0701;

import java.util.Arrays;
import java.util.Scanner;

public class Study_0701_5 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

/*
 String 클래스 : 
  - 자바에서 문자열을 사용하고자 하면 이걸 이용해야 한다
  - 내부적으로 char 기본 데이터타입(*동적배열이다)의 배열이 생성됨
  - 프로그램의 70% 이상을 차지하는 것은 문자열 데이터이므로 반드시 익혀야 함
*/
		
String word = "I like banana";

System.out.println(word);

//(중요!!)1)문자열 비교하기 : equals
System.out.println("equals : "+word.equals("i like orenge"));
	//각 스펠링의 일치여부를 따지는 것이 아니라 전체적인 문자열 비교를 하기에 결과값은 false가 나옴

//(중요!!)2)문자열 포함여부 : contains
System.out.println("contains : "+word.contains("banana"));
	//word에 저장된 문자열에 banana가 있는지를 확인하고 있으면 true, 없으면 false로 나옴

//3)서로 다른 문자열 합치기 : +, .concat()
System.out.println(word+"합치기");
	//지정한 문자열 변수의 앞 혹은 뒤로 +"쓰고자 하는 텍스트"를 이용하면 된다.
System.out.println(word.concat("합치기"));
	//혹은 .concat("추가하고자 하는 텍스트")를 이용해도 된다.

//4)특정 문자(열)의 위치 찾기 : indexOf
System.out.println("indexOf : "+word.indexOf("orange"));
	//word에 저장된 문자열에 orange가 있는지를 확인하고 있으면 해당 문자열이 시작되는 첫 인덱스값을, 없으면 -1로 나옴
System.out.println("indexOf : "+word.indexOf("banana"));
	//그래서 banana가 시작되는 b의 인덱스 값을 7로 반환한다.
System.out.println("lastIndexOf : "+word.lastIndexOf("a"));
	//이쪽은 문자열을 뒤에서부터 찾으며, 뒤에서 시작하는 기준으로 a의 인덱스값을 반환한다.

//5)문자열에서 특정 문자를 추출하기 : charAt
System.out.println(word.charAt(5));
	//I like banana에서 5번째 인덱스로 e가 그래서 출력됨

	//5-1)키보드로 '문자'를 입력 받기
	//System.out.println("알파벳 하나 입력하기 : ");
	//char alp = scan.nextLine().charAt(0);
	 //0번 인덱스는 곧 문자의 가장 맨 앞을 의미하기 때문에 입력한 글자에서 charAt로 맨 앞의 인덱스만을 추출한다.
	//System.out.println("입력한 문자 : " + alp);
			
	//char ch = 65;
	//System.out.println(ch);
	//char로 숫자를 입력하면 그 숫자에 맞는 아스키코드가 출력된다.
	
//6)문자열의 길이 세기 : .length()
System.out.println(".length(괄호가 없으면 변수 취급입니다.) : " + word.length());
		
//7)대-소문자 변환 : .toUpperCase(), .toLowerCase(); 
//				 목적은 사용자가 실수로 소문자로만 입력해야하거나 할 때 처리를 위함
String 대문자 = word.toUpperCase();
String 소문자 = word.toLowerCase();

System.out.println(대문자);
System.out.println(소문자);
		
//8)앞 뒤공백제거 : trim() 7)과 마찬가지로 앞 뒤 공백이 생기는 불상사 방지용
String word2 = " I hate you. ";
System.out.println(word2.trim());	
		
//(중요!!)9)문자열 분할 :.split(" ")
System.out.println(Arrays.toString(word.split(" ")));
	//word에 저장된 문장을 공백을 기준으로 나눔 : I, like, banana 
	//Arrays.toString을 사용한 것으로 짐작할 수 있듯, 해당 메소드는 무적권 배열이다.
String name ="이순신@김유신@강감찬@";
String[] names = name.split("@");
System.out.println(names[2]);
	//위 순서를 따라 문자열을 배열로 전환하면 @를 기준으로 문자열이 나눠진다.
	//따라서 만약 기준으로 사용된 문자열이 아닌 다른 문자열이 자리하면 그건 취급 안 한다.

//10)문자열 자르기(=추출) : .substring(인덱스번호);
System.out.println(word.substring(2));
	//위 경우는 like banana가 출력된다. : 2번 인덱스부터 추출됨
System.out.println(word.substring(6));
	//같은 원리로 이쪽은 6번 인덱스부터 마지막까지 추출되도록 하는 것
System.out.println(word.substring(2,6));
	//응용하면 시작할 인덱스부터 끝낼 인덱스까지 지정했을 때 특정 단어만 추출하는 것도 가능

//11)문자열 변환 : .replace(All)("변경하고 싶은 문자열", "변경할 문자열",
//				-replace(); : 
//				-replaceAll; : 정규표현식 사용 가능
/*	※정규표현식 : 프로그래밍 내에서 문자열의 일정한 패턴을 표현하는 일종의 형식언어
	 예시:
		1)^ : 문자열의 시작
		2)$ : 문자열의 종료
		3). : 임의의 문자 하나
		4)* : 앞문자의 유무와 관계없이 그 문자로 끝나는 단어를 의미(ex. *가 : 가로 끝나는 단어 전부)
		5)+ : 앞 문자가 하나 이상
		6)? : 앞 문자가 없거나 하나있다
		7)[] : 문자의 집합~범위
		8){} : 횟수나 범위
		9)() :소괄호의 문자를 하나의 문자로 인식
		10)| : 패턴 안에서 or연산을 수행
		11)\s : 공백문자
		12)\S : 공백문자가 아닌 나머지 문자
		13)\w : 알파벳이나 숫자
		14)\W : 알파벳이나 숫자가 아닌 나머지 문자
		15)\d : 숫자
		16)\D : 숫자가 아닌 나머지 문자
		
		문자열에서 숫자만 제거하는 표현식? : replace("[0-9]","");
		연락처 표현 : ^010-\d{4}-\d{4}&
		한글만 작성 확인 : ^[가-힅] 
*/
	String a = "abc123def456gh";
	System.out.println(a.replaceAll("[0-9]", ""));
		//왜 [0-9]냐면 10진수에서 사용하는 숫자의 모든 범위기 때문. 0~9를 사용하는 숫자를 모두 한 집단으로 표현함
	System.out.println(a.replaceAll("\\d",""));
		//혹은 이렇게 표현해줘도 된다. 단 \자체가 특수문자기 때문에 \+\d라는 느낌으로 쓰자.
	System.out.println(a.replaceAll("\\D", ""));
		//이쪽은 반대로 숫자만 살리는 정규표현식이다.
	
	
	

String 뽀뽀뽀 = "아빠가 출근할 때 뽀뽀뽀 엄마가 안아줘도 "+"뽀뽀뽀 만나면 반갑다고 뽀뽀뽀";
String 변경 = 뽀뽀뽀.replace("뽀뽀뽀", "쪽쪽쪽" );
System.out.println(변경);

변경 = 변경.replaceAll("쪽쪽쪽", "뽑뽑뽑");
System.out.println(변경);
		
		
		
		
		
		
		
		
		
		
		
	}
}

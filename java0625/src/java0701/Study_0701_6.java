package java0701;

public class Study_0701_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//indexOf, lastIndexOf, substring 사용할 것.
String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";

String name;
int age;

name = str.substring(str.indexOf("[")+1, str.indexOf("]"));
String temp = str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]"));
age = Integer.parseInt(temp);

System.out.println(name);
System.out.println(age);
	}

}

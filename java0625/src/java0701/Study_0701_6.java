package java0701;

public class Study_0701_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//indexOf, lastIndexOf, substring ����� ��.
String str = "�� �̸��� [ȫ�浿]�Դϴ�. ���̴� [15]�� �Դϴ�.";

String name;
int age;

name = str.substring(str.indexOf("[")+1, str.indexOf("]"));
String temp = str.substring(str.lastIndexOf("[")+1, str.lastIndexOf("]"));
age = Integer.parseInt(temp);

System.out.println(name);
System.out.println(age);
	}

}

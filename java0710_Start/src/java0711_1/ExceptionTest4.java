package java0711_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(BufferedReader br=
			new BufferedReader(new FileReader("c:/test/data.txt")))
	{
		String text = br.readLine();
		System.out.println(text);
		
	}catch(Exception e){
		System.out.println("���� ���� Ȥ�� ���� ����");
	}
		
		
		//���Ͽ� ����
//		BufferedWriter br =null;
//		try {
//			BufferedWriter br = new BufferedWriter(new FileWriter("c:/test1/data.txt"));
//			String name = "�̼���";
//			br.write("�̼��� 34 ����"+name.substring(10));
//				//��������� �ϸ� �޸𸮿� ����Ǵ� �ܰ迡 �Ұ��ϴ�.
//			br.close();	
//				//�ݱⰡ �Ǿ�� ���Ⱑ �Ϸ�ȴ�.
//		}catch(Exception e) {
//			System.out.println("���� ���� �Ұ�!");
//			try {
//				br.close();
//			}catch(IOException e1){
//				e1.printStackTrace();
//			}
//		}
	}

}

//����ó�� = �ڵ� �ڿ� ��ȯ
//������ �б�� ���� : �ϱ� ���ؼ� �ϴ� ������ �������?
//������ ������ ����� ������ ����� �޸�(�ڿ�)�� �ݳ��ؾ� �Ѵ�. = �ݱ�
//DB�� ������ ���� Ȥ�� �������� ������ �ߴٸ� �� ������ ����Ǵ� �������� �ݱⰡ ����Ǿ�� �Ѵ�.
package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//�ڵ�1
			if()
				throw new NullPointerException("aa");
			//�ڵ�2
		}catch(Exception e) {
			System.out.println("���� ���� �߻�");
		}
		
		//�� ���� ���� �߻� ��Ŵ?
		//
	}

}


class Member{
	String name;
	int age;
	int birth;
	Member(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	void setAge() {
		this.age = 2024-birth;
	}
}
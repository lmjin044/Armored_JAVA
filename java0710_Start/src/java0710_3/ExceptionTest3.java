package java0710_3;

public class ExceptionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member("�̼���", 1999);
		System.out.println(member.name+", "+member.birth);
		try {
			member.setAge();
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(member.age);
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
	
	//setAge �޼��� ȣ���Ͽ� age��� �̸��� �������� ����
	//age������ ���̸� ǥ���ϱ� ���� ������, 0���� ���� ���� ����Ǿ�� �� �ȴ�.
	//���� �¾ ������ ������ �� �� ������� 0���� ���� ���� ������ �߸� �� ���̴�.
	//birth������ ���� �߸��Ǿ��⿡ �߻��� ������ �� ���� �ڵ忡�� �ذ��ؾ� �Ѵ�.
	//�׷��� ���⼭�� ���� ó�� �߻���Ű�� �Ѱ��ֱ⸦ �Ѵ�.
	
	void setAge() throws {
		this.age=2023-birth;
		if(age<0)
			throw new RuntimeException("��� ������ �߸� �Ǿ��ٰ�");
	}
	
	//throw : ���ܸ� ������ �߻���Ű�� ��.
	//throws : ����ó���� �ٸ� ��ҿ� �̷�� ��.
	
//	void setAge() {
//		try {
//			this.age = 2024-birth;
//			if(age<0) {
//				throw new RuntimeException("��� ������ �߸� �Է��߽��ϴ�.");
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//		}
//	}
}
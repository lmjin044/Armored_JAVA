package java0711_2;

public class Member {

		private String name;
		private int age;
		private String birth;
		
		public Member(String name, int age, String birth) {
			this.name = name;
			this.age = age;
			this.birth = birth;
		}
		
		@Override
		public String toString() {
			return name+", "+age+", "+birth;
		}
		
//		@Override
//		public boolean equals(object o) {
//			Member tmp = (Member)o;
//				//어떤 데이터를 비교할 것인지 묻는 내용.
//			boolean isSame = this.age == tmp.age;
			//이쪽은 나이 비교 : return this.age == tmp.age;
			//이쪽연 이름을 비교 : return this.name.equals(tmp.name);
		//}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getBirth() {
			return birth;
		}
		public void setBirth(String birth) {
			this.birth = birth;
		}
		//@Override
		//public int compareTo(Member o) {
			//return this.name.compareTo(o.name)
		}
		
//}

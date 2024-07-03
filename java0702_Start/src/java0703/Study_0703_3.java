package java0703;

//오늘의 목표 : 이제 return이 있는 메서드를 배운다!
public class Study_0703_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ReturnMth ret = new ReturnMth();
//-------------------------------------------------
	//1)메서드를 통해 숫자 10을 받아 출력하기
	int num=ret.get();
		//return에 가지고 있는 것을 바깥으로 꺼내 저장할 곳이 필요함.
		//ReturnMth를 바깥에서는 ret으로 사용하기로 이름을 정했고, 거기서 get을 끌어오는 것.
	System.out.println(num);
	System.out.println();
//-------------------------------------------------
	//2)메서드로 2개의 정수와 그 합을 받아 출력하기.
	int total = ret.sum();
	System.out.println(total);
	System.out.println();
//-------------------------------------------------	
	//3)빈칸 작성하기였음.
	/*
	? userName = ?;
	int age = 34;
	System.out.println(userName + " "+age);
	 */
	
	String userName = ret.getName();
	int age = 34;
	System.out.println(userName + " "+age);
//-------------------------------------------------	
	/*출력은 여기서 할 것. 
	  국어, 영어, 수학 세 과목의 총점과 평균을 구하는 메서드를 '각각' 만들어 출력하시오.
	 */
	int sumTest= ret.sumTest();
	int avaTest= ret.avaTest(tot);
	System.out.println("총점은 : "+sumTest);
	System.out.println("평균은 : "+avaTest);
//-------------------------------------------------	
/*
 ※과제 : 주사위를 각각 1번씩 굴려 누가 이겼는지를 출력하시오.
 	 -조건 : 1) 메서드는 2개를 만들것
 	 		2) 주사위는 6면이며, 값이 큰 쪽이 승리이다.
 */
	
//-------------------------------------------------	
	
	
	}

}








class ReturnMth{
//※return : 메서드 안에 있는 것을 바깥으로 꺼내는 것
//-------------------------------------------------
	int sumTest() {
		int kor=89, eng=78, mat=50; 
		int total = kor+eng+mat;
		return total;
	}
	
	int avaTest(int tot){
		int kor=89, eng=78, mat=50; 
		return tot;
	}
	
	
//-------------------------------------------------
	String getName(){//3)
		String name = "이순신";	
		return name;
	}
	/*
	 ? getName(){
	 String name ="이순신";
	 ?
	 }
	 */
//-------------------------------------------------
	int sum() {//2)
		int num1= 10, num2 = 20;
		int result = num1+num2;
		return result;	//바깥에서 출력할 것이므로 여기서는 그만
	}
//-------------------------------------------------
	int get(){//1)
		return 10;	//숫자 10은 return 안에 있다.
	} 
	
}